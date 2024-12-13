package class2.bookrooms.controllers;

import class2.bookrooms.dtos.MakeBookingRequestDto;
import class2.bookrooms.dtos.MakeBookingResponseDto;
import class2.bookrooms.dtos.ResponseStatus;
import class2.bookrooms.models.Booking;
import class2.bookrooms.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public MakeBookingResponseDto makeBooking(MakeBookingRequestDto makeBookingRequestDto) {
        MakeBookingResponseDto responseDto = new MakeBookingResponseDto();
        try {
            Booking booking = bookingService.makeBooking(makeBookingRequestDto.getUserId(), makeBookingRequestDto.getBookedRooms());
            responseDto.setBooking(booking);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
