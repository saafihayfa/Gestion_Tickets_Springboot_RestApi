package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.entities.HdkTypeTicket;

@Service
public interface HdkTypeTicketService {

	HdkTypeTicket saveTypeTicket(HdkTypeTicket t);

	HdkTypeTicket updateTypeTicket(HdkTypeTicket t);

	void deleteTypeTicket(HdkTypeTicket t);

	void deleteTypeTicketById(BigDecimal id);

	Optional<HdkTypeTicket> getTypeTicket(BigDecimal id);

	List<HdkTypeTicket> getAllTypeTicket();

}
