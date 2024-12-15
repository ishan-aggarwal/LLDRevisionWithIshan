package class5.parkinglotticket.controllers;

import class5.parkinglotticket.dtos.GenerateTicketRequestDto;
import class5.parkinglotticket.dtos.GenerateTicketResponseDto;
import class5.parkinglotticket.dtos.ResponseStatus;
import class5.parkinglotticket.models.Ticket;
import class5.parkinglotticket.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        try {
            Ticket ticket = ticketService.generateTicket(requestDto.getGateId(), requestDto.getRegistrationNumber(), requestDto.getVehicleType());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setTicket(ticket);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
