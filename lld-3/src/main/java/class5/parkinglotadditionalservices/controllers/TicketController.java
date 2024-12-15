package class5.parkinglotadditionalservices.controllers;

import class5.parkinglotadditionalservices.dtos.GenerateTicketRequestDto;
import class5.parkinglotadditionalservices.dtos.GenerateTicketResponseDto;
import class5.parkinglotadditionalservices.dtos.ResponseStatus;
import class5.parkinglotadditionalservices.models.Ticket;
import class5.parkinglotadditionalservices.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        try{
            Ticket ticket = ticketService.generateTicket(requestDto.getGateId(), requestDto.getRegistrationNumber(), requestDto.getVehicleType(), requestDto.getAdditionalServices());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setTicket(ticket);
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
