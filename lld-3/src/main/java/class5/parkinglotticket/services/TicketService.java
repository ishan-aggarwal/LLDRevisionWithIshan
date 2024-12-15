package class5.parkinglotticket.services;

import class5.parkinglotticket.exceptions.InvalidGateException;
import class5.parkinglotticket.exceptions.InvalidParkingLotException;
import class5.parkinglotticket.exceptions.ParkingSpotNotAvailableException;
import class5.parkinglotticket.models.Ticket;

public interface TicketService {
    // Do not modify the method signatures, feel free to add new methods
    public Ticket generateTicket(int gateId, String registrationNumber, String vehicleType) throws InvalidGateException, InvalidParkingLotException, ParkingSpotNotAvailableException;
}
