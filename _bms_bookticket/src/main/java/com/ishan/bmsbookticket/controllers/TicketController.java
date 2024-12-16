package com.ishan.bmsbookticket.controllers;

import com.ishan.bmsbookticket.dtos.BookTicketRequestDTO;
import com.ishan.bmsbookticket.dtos.BookTicketResponseDTO;
import com.ishan.bmsbookticket.dtos.ResponseStatus;
import com.ishan.bmsbookticket.models.Ticket;
import com.ishan.bmsbookticket.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO){
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();
        try {
            Ticket ticket = ticketService.bookTicket(requestDTO.getShowSeatIds(), requestDTO.getUserId());
            responseDTO.setTicket(ticket);
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
