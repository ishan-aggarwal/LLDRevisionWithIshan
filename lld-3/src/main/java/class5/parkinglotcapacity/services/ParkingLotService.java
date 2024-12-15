package class5.parkinglotcapacity.services;

import class5.parkinglotcapacity.exceptions.InvalidParkingLotException;
import class5.parkinglotcapacity.models.ParkingFloor;
import class5.parkinglotcapacity.models.VehicleType;

import java.util.List;
import java.util.Map;

public interface ParkingLotService {

    public Map<ParkingFloor, Map<String, Integer>> getParkingLotCapacity(long parkingLotId, List<Long> parkingFloors, List<VehicleType> vehicleTypes) throws InvalidParkingLotException, InvalidParkingLotException;

}
