package com.Hayfa.GestionTickets.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.Repos.HdkUserRepository;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Service
public class HdkUserServiceImpl implements HdkUserService {

	@Autowired
	HdkUserRepository userrepo;

	@Override
	public HdkUser SaveUser(HdkUser user) {

		return userrepo.save(user);
	}

	@Override
	public HdkUser getUser(String username) {

		return userrepo.findByUserName(username);
	}

	@Override
	public List<HdkUser> getUsers() {
		
		return userrepo.findAll();
	}

}
