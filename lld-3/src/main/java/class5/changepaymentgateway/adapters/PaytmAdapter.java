package class5.changepaymentgateway.adapters;

import class5.changepaymentgateway.libraries.paytm.PaytmApi;
import class5.changepaymentgateway.libraries.paytm.PaytmPaymentResponse;
import class5.changepaymentgateway.models.Payment;
import class5.changepaymentgateway.models.PaymentStatus;

public class PaytmAdapter implements PaymentGatewayAdapter {

    private PaytmApi paytmApi;

    public PaytmAdapter() {
        this.paytmApi = new PaytmApi();
    }

    @Override
    public Payment makePayment(long billId, double amount) {
        PaytmPaymentResponse paytmPaymentResponse = paytmApi.makePayment(billId, amount);
        Payment payment = new Payment();
        payment.setTxnId(paytmPaymentResponse.getTxnId());
        payment.setPaymentStatus(PaymentStatus.valueOf(paytmPaymentResponse.getPaymentStatus()));
        payment.setBillId(billId);
        return payment;
    }
}