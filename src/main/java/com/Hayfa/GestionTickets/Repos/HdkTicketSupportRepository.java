package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;


@Repository
public interface HdkTicketSupportRepository extends JpaRepository<HdkTicketSupport, BigDecimal> {
	
	HdkTicketSupport findTicketByStatus(String status) ;
	
	 @Query("SELECT t FROM HdkTicketSupport t WHERE " +
	            "t.status LIKE CONCAT('%',:query, '%')" + " Or t.title LIKE CONCAT('%',:query, '%')" )
	 List<HdkTicketSupport> chercherticket(String query);
}
