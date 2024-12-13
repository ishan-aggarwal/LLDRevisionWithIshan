package class2.q3.generateinvoices.repositories;

import class2.q3.generateinvoices.models.Booking;

import java.util.List;

public interface BookingRepository {
    Booking save(Booking booking);

    List<Booking> findBookingByCustomerSession(long customerSessionId);
}
