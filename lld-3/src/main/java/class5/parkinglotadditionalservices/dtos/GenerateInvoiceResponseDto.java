package class5.parkinglotadditionalservices.dtos;

import class5.parkinglotadditionalservices.models.Invoice;

public class GenerateInvoiceResponseDto {
    private ResponseStatus status;
    private Invoice invoice;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
