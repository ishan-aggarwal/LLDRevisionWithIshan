package class2.generateinvoices.controllers;

import class2.generateinvoices.dtos.GenerateInvoiceRequestDto;
import class2.generateinvoices.dtos.GenerateInvoiceResponseDto;
import class2.generateinvoices.dtos.ResponseStatus;
import class2.generateinvoices.models.Invoice;
import class2.generateinvoices.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public GenerateInvoiceResponseDto generateInvoice(GenerateInvoiceRequestDto requestDto) {
        GenerateInvoiceResponseDto responseDto = new GenerateInvoiceResponseDto();
        try {
            Invoice invoice = bookingService.generateInvoice(requestDto.getUserId());
            responseDto.setInvoice(invoice);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
