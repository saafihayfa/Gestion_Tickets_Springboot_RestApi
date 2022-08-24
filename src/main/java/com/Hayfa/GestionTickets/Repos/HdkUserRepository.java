package com.Hayfa.GestionTickets.Repos;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hayfa.GestionTickets.entities.HdkUser;

@Repository
public interface HdkUserRepository extends JpaRepository<HdkUser, BigDecimal> {

	// Boolean existsByuserMail(String userMail);

	 HdkUser findByuserMail(String userMail);

	 HdkUser findByUserName(String userName);

}
