package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.Repos.HdkTypeTicketRepository;
import com.Hayfa.GestionTickets.entities.HdkTypeTicket;

@Service
public class HdkTypeTicketServiceImpl implements HdkTypeTicketService {

	@Autowired
	HdkTypeTicketRepository hdktypeticket;

	@Override
	public HdkTypeTicket saveTypeTicket(HdkTypeTicket t) {

		return hdktypeticket.save(t);
	}

	@Override
	public HdkTypeTicket updateTypeTicket(HdkTypeTicket t) {

		return hdktypeticket.save(t);
	}

	@Override
	public void deleteTypeTicket(HdkTypeTicket t) {
		hdktypeticket.delete(t);

	}

	@Override
	public void deleteTypeTicketById(BigDecimal id) {
		hdktypeticket.deleteById(id);

	}

	@Override
	public Optional<HdkTypeTicket> getTypeTicket(BigDecimal id) {

		return hdktypeticket.findById(id);
	}

	@Override
	public List<HdkTypeTicket> getAllTypeTicket() {

		return hdktypeticket.findAll();
	}

}
