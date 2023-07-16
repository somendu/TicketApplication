package com.greatlearning.Ims.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.Ims.model.Ticket;
import com.greatlearning.Ims.repository.TicketsJpaRepository;

@Service
public class TicketServiceImpl implements TicketService	 {
	
	@Autowired
	private final TicketsJpaRepository ticketRepository;
	
	public TicketServiceImpl(TicketsJpaRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> viewAllTickets() {
		List<Ticket> tickets = this.ticketRepository.findAll();
		return tickets;	
		
	}
	
	@Override
	public Ticket findTicketById(long id) {
		return this.ticketRepository.findById(id).orElseThrow();
	}
	

	@Override
	public Ticket editTicket(long id, Ticket ticket) {
		Optional<Ticket> optionalTicket = this.ticketRepository.findById(id) ;
		if(optionalTicket.isPresent()) {
			Ticket ticket2 = optionalTicket.get();
			ticket2.setTitle(ticket.getTitle());
			ticket2.setDescription(ticket.getDescription());
			ticket2.setDate(ticket.getDate());
			
			ticketRepository.save(ticket2);
		}
		
		return ticket;
	}

	@Override
	public void deleteTicket(long id) {
		this.ticketRepository.deleteById(id);
		
	}

}
