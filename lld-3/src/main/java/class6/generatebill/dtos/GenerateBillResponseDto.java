package class6.generatebill.dtos;

import class6.generatebill.models.Bill;

public class GenerateBillResponseDto {
    private ResponseStatus responseStatus;
    private Bill bill;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}