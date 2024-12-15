package class8.cancelorder.exceptions;

public class OrderDoesNotBelongToUserException extends Exception {
    public OrderDoesNotBelongToUserException(String message) {
        super(message);
    }
}
