package class5.parkinglotadditionalservices.respositories;

import class5.parkinglotadditionalservices.models.Slab;
import class5.parkinglotadditionalservices.models.VehicleType;

import java.util.List;

public interface SlabRepository {

    public List<Slab> getSortedSlabsByVehicleType(VehicleType vehicleType);

    public Slab save(Slab slab);
}
