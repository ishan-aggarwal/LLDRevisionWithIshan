package class2.addroomshotelmanagement.services;

import class2.addroomshotelmanagement.exceptions.UnAuthorizedAccess;
import class2.addroomshotelmanagement.exceptions.UserNotFoundException;
import class2.addroomshotelmanagement.models.Room;

public interface RoomService {
    Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccess;
}
