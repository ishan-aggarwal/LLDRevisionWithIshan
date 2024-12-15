package class8.cancelorder.exceptions;

public class OrderCannotBeCancelledException extends Exception {
    public OrderCannotBeCancelledException(String message) {
        super(message);
    }
}
