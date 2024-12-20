package class5.parkinglotadditionalservices.respositories;

import class5.parkinglotadditionalservices.models.Invoice;

import java.util.HashMap;
import java.util.Map;

public class InMemoryInvoiceRepositoryImpl implements InvoiceRepository{

    private Map<Long, Invoice> map;

    public InMemoryInvoiceRepositoryImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public Invoice save(Invoice invoice) {
        if (invoice.getId() == 0) {
            invoice.setId(map.size() + 1);
        }
        map.put(invoice.getId(), invoice);
        return invoice;
    }
}
