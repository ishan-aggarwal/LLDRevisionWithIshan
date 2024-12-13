package class2.getrooms.controllers;

import class2.getrooms.dtos.GetRoomsRequestDto;
import class2.getrooms.dtos.GetRoomsResponseDto;
import class2.getrooms.dtos.ResponseStatus;
import class2.getrooms.models.Room;
import class2.getrooms.services.RoomService;

import java.util.List;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public GetRoomsResponseDto getRooms(GetRoomsRequestDto requestDto) {
        GetRoomsResponseDto responseDto = new GetRoomsResponseDto();
        try {
            List<Room> rooms = roomService.getRooms(requestDto.getRoomType());
            responseDto.setRooms(rooms);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
