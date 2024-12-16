package com.ishan.bmsbookticket.services;

import com.ishan.bmsbookticket.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception;
}
