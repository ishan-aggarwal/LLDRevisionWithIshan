package class5.parkinglotadditionalservices.strategies.assignment;

import class5.parkinglotadditionalservices.models.*;

import java.util.Optional;

public class AssignNearestAvailableSpotStrategy implements SpotAssignmentStrategy{
    @Override
    public Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            if(parkingFloor.getStatus().equals(FloorStatus.OPERATIONAL)){
                for (ParkingSpot spot : parkingFloor.getSpots()) {
                    if(spot.getStatus().equals(ParkingSpotStatus.AVAILABLE) && spot.getSupportedVehicleType().equals(vehicleType)){
                        spot.setStatus(ParkingSpotStatus.OCCUPIED);
                        return Optional.of(spot);
                    }
                }
            }
        }
        return Optional.empty();
    }
}
