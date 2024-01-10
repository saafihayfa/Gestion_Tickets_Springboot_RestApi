package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Service
public interface HdkTicketSupportService {


	HdkTicketSupport updateTicket(HdkTicketSupport t);

	void deleteTicket(HdkTicketSupport t);

	void deleteTicketById(BigDecimal id);

	Optional<HdkTicketSupport> getTicket(BigDecimal id);

	HdkTicketSupport getTicketByStatus(String s);

	List<HdkTicketSupport> findTicketByAttributedTo(BigDecimal x);

	List<HdkTicketSupport> findTicketByidUser(HdkUser idUser);

	List<HdkTicketSupport> getAllTickets();

	List<HdkTicketSupport> chercherticket(String query);

	List<HdkTicketSupport> received_ticket();

	List<HdkTicketSupport> sent_ticket();

	List<HdkTicketSupport> notaff_ticket();

	List<HdkTicketSupport> resolved_ticket();
	
	List<HdkTicketSupport> pending_ticket();
	
	List<HdkTicketSupport> progress_ticket();
	
	List<HdkTicketSupport> test_ticket();

	HdkTicketSupport saveTicket(HdkTicketSupport newTicket);

	
	//List<HdkTicketSupport> others_ticket();
	

}
