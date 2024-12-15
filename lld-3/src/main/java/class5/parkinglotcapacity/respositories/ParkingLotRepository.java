package class5.parkinglotcapacity.respositories;

import class5.parkinglotcapacity.models.ParkingLot;

import java.util.Optional;

public interface ParkingLotRepository {

    // Do not change the method signatures, feel free to add methods

    public Optional<ParkingLot> getParkingLotByGateId(long gateId);

    public Optional<ParkingLot> getParkingLotById(long id);

    public ParkingLot save(ParkingLot parkingLot);
}
