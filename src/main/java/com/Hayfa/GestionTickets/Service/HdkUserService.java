package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;

import com.Hayfa.GestionTickets.entities.HdkUser;

public interface HdkUserService {

	HdkUser SaveUser(HdkUser user);

	HdkUser getUser(String username);

	HdkUser getuserMail(String userMail);

	List<HdkUser> getUsers();
	
	List<BigDecimal> getAllId(); 

}
