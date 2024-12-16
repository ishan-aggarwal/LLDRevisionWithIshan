package com.ishan.bmsbookticket.dtos;

import com.ishan.bmsbookticket.models.Ticket;
import lombok.Data;

@Data
public class BookTicketResponseDTO {
    private ResponseStatus status;
    private Ticket ticket;
}
