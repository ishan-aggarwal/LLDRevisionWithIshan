package class5.changepaymentgateway.services;

import class5.changepaymentgateway.exceptions.InvalidBillException;
import class5.changepaymentgateway.models.Payment;

public interface PaymentService {

    Payment makePayment(long billId) throws InvalidBillException;
}