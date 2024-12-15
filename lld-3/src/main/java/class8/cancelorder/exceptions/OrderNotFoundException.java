package class8.cancelorder.exceptions;

public class OrderNotFoundException extends Exception{
    public OrderNotFoundException(String message) {
        super(message);
    }
}
