package solid.so.design.invoice.v2;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Total price is : " + this.invoice.totalPrice());
    }
}
