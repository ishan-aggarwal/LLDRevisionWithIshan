package class2.addroomshotelmanagement.repositories;

import class2.addroomshotelmanagement.models.Room;
import class2.addroomshotelmanagement.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);
    List<Room> getRooms();
    List<Room> getRoomsByRoomType(RoomType roomType);
    Room save(Room room);
}
