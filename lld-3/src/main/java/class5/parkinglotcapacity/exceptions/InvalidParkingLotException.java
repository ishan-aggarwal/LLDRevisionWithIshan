package class5.parkinglotcapacity.exceptions;

public class InvalidParkingLotException extends Exception {
    public InvalidParkingLotException() {
    }

    public InvalidParkingLotException(String message) {
        super(message);
    }
}
