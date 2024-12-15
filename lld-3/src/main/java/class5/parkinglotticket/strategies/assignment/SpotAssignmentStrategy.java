package class5.parkinglotticket.strategies.assignment;

import class5.parkinglotticket.models.ParkingLot;
import class5.parkinglotticket.models.ParkingSpot;
import class5.parkinglotticket.models.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {

    Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, VehicleType vehicleType);

}
