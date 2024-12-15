package class5.parkinglotadditionalservices.respositories;

import class5.parkinglotadditionalservices.models.Gate;

import java.util.Optional;

public interface GateRepository {
    // Do not modify the method signatures, feel free to add new methods

    public Optional<Gate> findById(long gateId);

    public Gate save(Gate gate);
}