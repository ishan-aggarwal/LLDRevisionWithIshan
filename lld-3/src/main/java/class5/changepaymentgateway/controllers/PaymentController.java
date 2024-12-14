package class5.changepaymentgateway.controllers;

import class5.changepaymentgateway.dtos.MakePaymentRequestDto;
import class5.changepaymentgateway.dtos.MakePaymentResponseDto;
import class5.changepaymentgateway.dtos.ResponseStatus;
import class5.changepaymentgateway.models.Payment;
import class5.changepaymentgateway.services.PaymentService;

public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public MakePaymentResponseDto makePayment(MakePaymentRequestDto makePaymentRequestDto) {
        MakePaymentResponseDto makePaymentResponseDto = new MakePaymentResponseDto();
        try{
            Payment payment = paymentService.makePayment(makePaymentRequestDto.getBillId());
            makePaymentResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            makePaymentResponseDto.setPaymentStatus(payment.getPaymentStatus());
            makePaymentResponseDto.setTxnId(payment.getTxnId());
            return makePaymentResponseDto;
        } catch (Exception e) {
            makePaymentResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            return makePaymentResponseDto;
        }
    }
}