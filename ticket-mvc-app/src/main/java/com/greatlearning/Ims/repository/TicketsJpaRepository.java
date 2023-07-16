package com.greatlearning.Ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.Ims.model.Ticket;

public interface TicketsJpaRepository extends JpaRepository<Ticket,Long> {
	
	

}
