package class5.parkinglotadditionalservices.controllers;

import class5.parkinglotadditionalservices.dtos.GenerateInvoiceRequestDto;
import class5.parkinglotadditionalservices.dtos.GenerateInvoiceResponseDto;
import class5.parkinglotadditionalservices.dtos.ResponseStatus;
import class5.parkinglotadditionalservices.models.Invoice;
import class5.parkinglotadditionalservices.services.InvoiceService;

public class InvoiceController {

    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public GenerateInvoiceResponseDto createInvoice(GenerateInvoiceRequestDto requestDto) {
        GenerateInvoiceResponseDto responseDto = new GenerateInvoiceResponseDto();
        try {
            Invoice invoice = invoiceService.createInvoice(requestDto.getTicketId(), requestDto.getGateId());
            responseDto.setStatus(ResponseStatus.SUCCESS);
            responseDto.setInvoice(invoice);
            return responseDto;
        } catch (Exception e) {
            responseDto.setStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
