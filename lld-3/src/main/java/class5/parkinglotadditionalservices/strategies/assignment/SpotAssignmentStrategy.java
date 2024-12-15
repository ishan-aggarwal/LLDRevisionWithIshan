package class5.parkinglotadditionalservices.strategies.assignment;

import class5.parkinglotadditionalservices.models.ParkingLot;
import class5.parkinglotadditionalservices.models.ParkingSpot;
import class5.parkinglotadditionalservices.models.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {

    Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, VehicleType vehicleType);

}
