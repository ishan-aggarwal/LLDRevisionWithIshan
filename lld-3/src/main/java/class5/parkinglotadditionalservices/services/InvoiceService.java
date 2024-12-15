package class5.parkinglotadditionalservices.services;

import class5.parkinglotadditionalservices.exceptions.InvalidGateException;
import class5.parkinglotadditionalservices.exceptions.TicketNotFoundException;
import class5.parkinglotadditionalservices.models.Invoice;

public interface InvoiceService {
    public Invoice createInvoice(long ticketId, long gateId) throws TicketNotFoundException, InvalidGateException;
}
