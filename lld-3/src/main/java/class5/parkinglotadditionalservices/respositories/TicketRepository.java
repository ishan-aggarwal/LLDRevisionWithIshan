package class5.parkinglotadditionalservices.respositories;

import class5.parkinglotadditionalservices.models.*;

import java.util.Date;
import java.util.Optional;

public interface TicketRepository {
    // Do not modify the method signature, feel free to add new methods

    public Ticket save(Ticket ticket);

    public Optional<Ticket> getTicketById(long ticketId);
}
