package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;


@Repository
public interface HdkTicketSupportRepository extends JpaRepository<HdkTicketSupport, BigDecimal> {
	
	HdkTicketSupport findTicketByStatus(Character status) ;

}
