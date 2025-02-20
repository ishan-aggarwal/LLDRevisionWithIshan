package structural.facade.q1;

import structural.facade.q1.models.BookingConfirmation;
import structural.facade.q1.models.BookingResult;
import structural.facade.q1.models.PaymentStatus;
import structural.facade.q1.services.*;

import java.time.LocalDate;

public class BookingProcessor {

    private AvailabilityService availabilityService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private LoyaltyService loyaltyService;
    private AccommodationDetailsService accommodationDetailsService;

    public BookingProcessor(AvailabilityService availabilityService, PaymentService paymentService, NotificationService notificationService, LoyaltyService loyaltyService, AccommodationDetailsService accommodationDetailsService) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.loyaltyService = loyaltyService;
        this.accommodationDetailsService = accommodationDetailsService;
    }

    public BookingResult process(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {

        boolean isAvailable = availabilityService.checkAvailability(accommodationId, checkInDate, checkOutDate);
        if (!isAvailable) {
            return BookingResult.notAvailable("Accommodation not available for the given dates");
        }

        PaymentStatus paymentStatus = paymentService.makePayment(userId, accommodationId);
        if (paymentStatus != PaymentStatus.SUCCESS) {
            return BookingResult.paymentFailed("Payment failed with status: " + paymentStatus);
        }

        BookingConfirmation confirmation = new BookingConfirmation(userId, accommodationId, checkInDate, checkOutDate);
        notificationService.sendBookingConfirmation(confirmation);

        loyaltyService.updateLoyaltyPoints(userId, paymentService.calculatePaymentAmount(accommodationId));
        accommodationDetailsService.updateAccommodationDetails(accommodationId, checkInDate, checkOutDate);

        return BookingResult.success(confirmation);
    }

}