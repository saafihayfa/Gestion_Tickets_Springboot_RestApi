package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;

@Service
public interface HdkTicketSupportService {

	HdkTicketSupport saveTicket(HdkTicketSupport t);

	HdkTicketSupport updateTicket(HdkTicketSupport t);

	void deleteTicket(HdkTicketSupport t);

	void deleteTicketById(BigDecimal id);

	Optional<HdkTicketSupport> getTicket(BigDecimal id);
	
	HdkTicketSupport getTicketByStatus (String s);
	

	List<HdkTicketSupport> getAllTickets();

}
