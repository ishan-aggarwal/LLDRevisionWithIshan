package class5.parkinglotticket.respositories;

import class5.parkinglotticket.models.Vehicle;
import class5.parkinglotticket.models.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryVehicleRepositoryImpl implements VehicleRepository{

    private Map<String, Vehicle> vehicleMap1;
    private Map<Long, Vehicle> vehicleMap;
    private static long id = 0;

    public InMemoryVehicleRepositoryImpl() {
        this.vehicleMap = new HashMap<>();
        this.vehicleMap1 = new HashMap<>();
    }

    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber) {
//         return this.vehicleMap.values().stream().filter(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber)).findFirst();
//        return Optional.ofNullable(vehicleMap1.get(registrationNumber));
        return Optional.of(vehicleMap1.get(registrationNumber));

    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicleMap1.put(vehicle.getRegistrationNumber(), vehicle);
        return vehicle;
//        if(vehicle.getId() == 0){
//            vehicle.setId(id++);
//        }
//        this.vehicleMap.put(vehicle.getId(), vehicle);
//        return vehicle;
    }
}
