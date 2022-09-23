package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Repository
public interface HdkTicketSupportRepository extends JpaRepository<HdkTicketSupport, BigDecimal> {

	HdkTicketSupport findTicketByStatus(String status);

	List<HdkTicketSupport> findTicketByAttributedTo(BigDecimal x);

	List<HdkTicketSupport> findTicketByidUser(HdkUser x);

	@Query("SELECT t FROM HdkTicketSupport t WHERE " + "t.status LIKE CONCAT('%',:query, '%')"
			+ " Or t.title LIKE CONCAT('%',:query, '%')")
	List<HdkTicketSupport> chercherticket(String query);

	@Query(" SELECT rec FROM  HdkTicketSupport rec WHERE rec.attributedTo = rec.idUser ")
	List<HdkTicketSupport> received_ticket();

	@Query(" SELECT snt FROM  HdkTicketSupport snt WHERE snt.attributedTo != snt.idUser  ")
	List<HdkTicketSupport> sent_ticket();

	@Query(" SELECT oth FROM HdkTicketSupport oth WHERE  oth.attributedTo != oth.idUser ")
	List<HdkTicketSupport> others_ticket();

	@Query(" SELECT naf FROM HdkTicketSupport naf WHERE naf.attributedTo = null  ")
	List<HdkTicketSupport> notaff_ticket();

	@Query(" SELECT res FROM HdkTicketSupport res WHERE res.status = 'resolved'  ")
	List<HdkTicketSupport> resolved_ticket();

}
