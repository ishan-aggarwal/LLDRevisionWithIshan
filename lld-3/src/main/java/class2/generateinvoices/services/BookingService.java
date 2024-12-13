package class2.generateinvoices.services;

import class2.generateinvoices.exceptions.CustomerSessionNotFoundException;
import class2.generateinvoices.models.Invoice;

public interface BookingService {
    Invoice generateInvoice(long userId) throws CustomerSessionNotFoundException;
}
