package class5.parkinglotcapacity.services;

import class5.parkinglotcapacity.exceptions.InvalidParkingLotException;
import class5.parkinglotcapacity.models.ParkingFloor;
import class5.parkinglotcapacity.models.ParkingLot;
import class5.parkinglotcapacity.models.VehicleType;
import class5.parkinglotcapacity.respositories.ParkingLotRepository;
import class5.parkinglotcapacity.utils.ParkingFloorUtils;

import java.util.*;

public class ParkingLotServiceImpl implements ParkingLotService{

    private final ParkingLotRepository parkingLotRepository;

    public ParkingLotServiceImpl(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public Map<ParkingFloor, Map<String, Integer>> getParkingLotCapacity(long parkingLotId, List<Long> parkingFloorIds, List<VehicleType> requiredVehicleTypes) throws InvalidParkingLotException {
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.getParkingLotById(parkingLotId);
        if(parkingLotOptional.isEmpty()){
            throw new InvalidParkingLotException("Invalid Parking Lot Id");
        }

        ParkingLot parkingLot = parkingLotOptional.get();
        Map<ParkingFloor, Map<String, Integer>> map = new HashMap<>();
        Set<Long> parkingFloorIdSet = parkingFloorIds == null ? new HashSet<>(): new HashSet<>(parkingFloorIds);

        if(requiredVehicleTypes == null || requiredVehicleTypes.isEmpty()){
            requiredVehicleTypes = Arrays.asList(VehicleType.values());
        }

        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            if(parkingFloorIdSet.size() > 0 && !parkingFloorIdSet.contains(parkingFloor.getId())){
                continue;
            }
            Map<String, Integer> vehicleTypeIntegerMap = new HashMap<>();
            for(VehicleType vehicleType : requiredVehicleTypes){
                vehicleTypeIntegerMap.put(vehicleType.name(), ParkingFloorUtils.calculateAvailableSpotsByVehicleType(parkingFloor, vehicleType));
            }
            map.put(parkingFloor, vehicleTypeIntegerMap);
        }
        return map;
    }
}
