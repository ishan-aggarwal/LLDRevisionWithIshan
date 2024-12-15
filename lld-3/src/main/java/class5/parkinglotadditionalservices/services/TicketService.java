package class5.parkinglotadditionalservices.services;

import class5.parkinglotadditionalservices.exceptions.*;
import class5.parkinglotadditionalservices.models.AdditionalService;
import class5.parkinglotadditionalservices.models.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    // Do not modify the method signatures, feel free to add new methods
    public Ticket generateTicket(long gateId, String registrationNumber, String vehicleType, List<String> additionalServices) throws InvalidGateException, InvalidParkingLotException, ParkingSpotNotAvailableException, UnsupportedAdditionalService, AdditionalServiceNotSupportedByVehicle;
}
