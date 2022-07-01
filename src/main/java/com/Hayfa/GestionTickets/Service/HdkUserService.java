package com.Hayfa.GestionTickets.Service;

import java.util.List;

import com.Hayfa.GestionTickets.entities.HdkUser;
//import com.Hayfa.Tickets.entities.Role;

public interface HdkUserService {

	HdkUser SaveUser(HdkUser user);

	// Role SaveRole(Role role);

	// void AddRoleToUser(String username, String rolename);

	HdkUser getUser(String username);

	List<HdkUser> getUsers();

	
}
