package class2.bookrooms.repositories;

import class2.bookrooms.models.Room;

import java.util.Optional;

public interface RoomRepository {
    Room save(Room room);

    Optional<Room> findById(long roomId);
}
