package class5.changepaymentgateway.adapters;


import class5.changepaymentgateway.models.Payment;

public interface PaymentGatewayAdapter {

    Payment makePayment(long billId, double amount);
}