package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.Repos.HdkTicketSupportRepository;
import com.Hayfa.GestionTickets.entities.HdkTicketSupport;

@Service
public class HdkTicketSupportServiceImpl implements HdkTicketSupportService {

	@Autowired
	HdkTicketSupportRepository HdkTicket;

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

}
