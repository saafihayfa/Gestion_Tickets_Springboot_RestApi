package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkTypeTicket;

@Repository
public interface HdkTypeTicketRepository extends JpaRepository<HdkTypeTicket, BigDecimal> {

}
