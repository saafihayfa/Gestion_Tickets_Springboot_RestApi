package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkTicketSupport;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Repository
public interface HdkUserRepository extends JpaRepository<HdkUser, BigDecimal> {

	HdkUser findByuserMail(String userMail);

	HdkUser findByUserName(String userName);
	
	@Query(" SELECT idUser FROM  HdkUser" )
	List<BigDecimal> getAllId();

	void save(HdkTicketSupport newTicket); 

}
