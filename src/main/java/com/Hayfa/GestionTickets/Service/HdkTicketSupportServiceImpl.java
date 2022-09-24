package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.Repos.HdkTicketSupportRepository;
import com.Hayfa.GestionTickets.Repos.HdkUserRepository;
import com.Hayfa.GestionTickets.entities.HdkTicketSupport;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Service
public class HdkTicketSupportServiceImpl implements HdkTicketSupportService {

	@Autowired
	HdkTicketSupportRepository HdkTicket;

	@Autowired
	HdkUserRepository userrepo;

	@Override
	public HdkTicketSupport saveTicket(HdkTicketSupport t) {

		return HdkTicket.save(t);
	}

	@Override
	public HdkTicketSupport updateTicket(HdkTicketSupport t) {

		return HdkTicket.save(t);
	}

	@Override
	public void deleteTicket(HdkTicketSupport t) {
		HdkTicket.delete(t);

	}

	@Override
	public void deleteTicketById(BigDecimal id) {
		HdkTicket.deleteById(id);

	}

	@Override
	public Optional<HdkTicketSupport> getTicket(BigDecimal id) {

		return HdkTicket.findById(id);
	}

	@Override
	public HdkTicketSupport getTicketByStatus(String s) {

		return HdkTicket.findTicketByStatus(s);

	}

	@Override
	public List<HdkTicketSupport> getAllTickets() {

		return HdkTicket.findAll();
	}

	@Override
	public List<HdkTicketSupport> chercherticket(String query) {

		List<HdkTicketSupport> tickets = HdkTicket.chercherticket(query);

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> received_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.received_ticket();

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> sent_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.sent_ticket();

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> notaff_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.notaff_ticket();

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> resolved_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.resolved_ticket();

		return tickets;

	}

	@Override
	public List<HdkTicketSupport> findTicketByAttributedTo(BigDecimal x) {

		List<HdkTicketSupport> tickets = HdkTicket.findTicketByAttributedTo(x);

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> findTicketByidUser(HdkUser x) {

		List<HdkTicketSupport> tickets = HdkTicket.findTicketByidUser(x);

		return tickets;
	}

	@Override
	public List<HdkTicketSupport> pending_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.pending_ticket();

		return tickets;

	}

	@Override
	public List<HdkTicketSupport> progress_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.progress_ticket();

		return tickets;

	}

	@Override
	public List<HdkTicketSupport> test_ticket() {

		List<HdkTicketSupport> tickets = HdkTicket.test_ticket();

		return tickets;

	}

//	@Override
//	public List<HdkTicketSupport> others_ticket() {
//
//		List<HdkTicketSupport> tickets = HdkTicket.others_ticket();
//
//		return tickets;
//	}
//	

}
