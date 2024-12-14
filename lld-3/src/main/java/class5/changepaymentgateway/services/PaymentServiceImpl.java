package class5.changepaymentgateway.services;

import class5.changepaymentgateway.adapters.PaymentGatewayAdapter;
import class5.changepaymentgateway.exceptions.InvalidBillException;
import class5.changepaymentgateway.models.Bill;
import class5.changepaymentgateway.models.Payment;
import class5.changepaymentgateway.repositories.BillRepository;

public class PaymentServiceImpl implements PaymentService{

    private BillRepository billRepository;
    private PaymentGatewayAdapter paymentGatewayAdapter;

    public PaymentServiceImpl(BillRepository billRepository, PaymentGatewayAdapter paymentGatewayAdapter) {
        this.billRepository = billRepository;
        this.paymentGatewayAdapter = paymentGatewayAdapter;
    }

    @Override
    public Payment makePayment(long billId) throws InvalidBillException {
        Bill bill = billRepository.findById(billId).orElseThrow(() -> new InvalidBillException("Bill not found"));
        return paymentGatewayAdapter.makePayment(billId, bill.getTotalAmount());
    }
}