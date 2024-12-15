package structural.facade.q1;

import structural.facade.q1.models.BookingResult;
import structural.facade.q1.services.*;

import java.time.LocalDate;

public class BookingManager {

    private BookingProcessor bookingProcessor;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        this.bookingProcessor = new BookingProcessor(availabilityService, paymentService, notificationService, loyaltyService, accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingProcessor.process(userId, accommodationId, checkInDate, checkOutDate);
    }

}