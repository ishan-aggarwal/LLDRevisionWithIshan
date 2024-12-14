package class5.changepaymentgateway.adapters;

import class5.changepaymentgateway.libraries.razorpay.RazorpayApi;
import class5.changepaymentgateway.libraries.razorpay.RazorpayPaymentResponse;
import class5.changepaymentgateway.models.Payment;
import class5.changepaymentgateway.models.PaymentStatus;

public class RazorpayAdapter implements PaymentGatewayAdapter{

    private RazorpayApi razorpayApi = new RazorpayApi();
    @Override
    public Payment makePayment(long billId, double amount) {
        RazorpayPaymentResponse razorpayPaymentResponse = razorpayApi.processPayment(billId, amount);
        Payment payment = new Payment();
        payment.setTxnId(razorpayPaymentResponse.getTransactionId());
        payment.setPaymentStatus(PaymentStatus.valueOf(razorpayPaymentResponse.getPaymentStatus()));
        payment.setBillId(billId);
        return payment;
    }
}