package class2.addroomshotelmanagement.controllers;

import class2.addroomshotelmanagement.dtos.AddRoomRequestDto;
import class2.addroomshotelmanagement.dtos.AddRoomResponseDto;
import class2.addroomshotelmanagement.dtos.ResponseStatus;
import class2.addroomshotelmanagement.models.Room;
import class2.addroomshotelmanagement.services.RoomService;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public AddRoomResponseDto addRoom(AddRoomRequestDto requestDto) {
        AddRoomResponseDto responseDto = new AddRoomResponseDto();
        try {
            Room room = roomService.addRoom(requestDto.getUserId(), requestDto.getName(), requestDto.getPrice(),
                    requestDto.getRoomType(), requestDto.getDescription());

            responseDto.setRoom(room);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
