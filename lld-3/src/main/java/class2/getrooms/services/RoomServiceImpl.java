package class2.getrooms.services;

import class2.getrooms.models.Room;
import class2.getrooms.models.RoomType;
import class2.getrooms.repositories.RoomRepository;

import java.util.List;

public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getRooms(String roomType) {
        if (roomType == null) {
            return roomRepository.getRooms();
        } else {
            return roomRepository.getRoomsByRoomType(RoomType.valueOf(roomType));
        }
    }
}
