package class5.parkinglotticket.respositories;

import class5.parkinglotticket.models.Vehicle;
import class5.parkinglotticket.models.VehicleType;

import java.util.Optional;

public interface VehicleRepository {
    // Do not modify the method signatures, feel free to add new methods

    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber);

    public Vehicle save(Vehicle vehicle);
}
