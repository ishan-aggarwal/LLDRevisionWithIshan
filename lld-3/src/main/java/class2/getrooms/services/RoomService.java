package class2.getrooms.services;

import class2.getrooms.models.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRooms(String roomType);
}
