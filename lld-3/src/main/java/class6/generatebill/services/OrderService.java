package class6.generatebill.services;

import class6.generatebill.exceptions.CustomerSessionNotFound;
import class6.generatebill.models.Bill;

public interface OrderService {

    public Bill generateBill(long userId) throws CustomerSessionNotFound;
}
