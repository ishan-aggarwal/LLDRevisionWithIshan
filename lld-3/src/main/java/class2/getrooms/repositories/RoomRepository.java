package class2.getrooms.repositories;

import class2.getrooms.models.Room;
import class2.getrooms.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);

    List<Room> getRooms();

    List<Room> getRoomsByRoomType(RoomType roomType);

    Room save(Room room);
}
