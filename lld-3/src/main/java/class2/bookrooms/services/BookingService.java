package class2.bookrooms.services;

import class2.bookrooms.exceptions.InvalidRoomException;
import class2.bookrooms.exceptions.UserNotFoundException;
import class2.bookrooms.models.Booking;

import java.util.Map;

public interface BookingService {
    Booking makeBooking(long userId, Map<Long, Integer> roomsToBeBooked) throws UserNotFoundException, InvalidRoomException;
}
