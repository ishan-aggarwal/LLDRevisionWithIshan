package class5.parkinglotcapacity.models;

public class ParkingAttendant extends BaseModel{

    public ParkingAttendant(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }

    private String name;
    private String email;
}
