package com.greatlearning.Ims.service;

import java.util.List;

import com.greatlearning.Ims.model.Ticket;

public interface TicketService {
	
	Ticket saveTicket(Ticket ticket);
	
	List<Ticket> viewAllTickets();
	
	Ticket editTicket(long id, Ticket ticket);
	
	Ticket findTicketById(long id);
	
	void deleteTicket(long id);

}
