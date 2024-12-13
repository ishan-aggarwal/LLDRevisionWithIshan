package class2.q3.generateinvoices.services;

import class2.q3.generateinvoices.exceptions.CustomerSessionNotFoundException;
import class2.q3.generateinvoices.models.Invoice;

public interface BookingService {
    Invoice generateInvoice(long userId) throws CustomerSessionNotFoundException;
}
