package class5.parkinglotadditionalservices.respositories;

import class5.parkinglotadditionalservices.models.Vehicle;
import class5.parkinglotadditionalservices.models.VehicleType;

import java.util.Optional;

public interface VehicleRepository {
    // Do not modify the method signatures, feel free to add new methods

    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber);

    public Vehicle save(Vehicle vehicle);
}
