package com.Hayfa.GestionTickets.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Hayfa.GestionTickets.Repos.HdkUserRepository;
import com.Hayfa.GestionTickets.entities.HdkUser;

@Service
public class HdkUserServiceImpl implements HdkUserService {
	
	 @Autowired
	 private PasswordEncoder passwordEncoder;

	@Autowired
	HdkUserRepository userrepo;

	@Override
	public HdkUser SaveUser(HdkUser user) {
		
        String pass = user.getUserPwd();

        user.setUserPwd(passwordEncoder.encode(pass));

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

	@Override
	public HdkUser getuserMail(String userMail) {

		return userrepo.findByuserMail(userMail);
	}

	@Override
	public List<BigDecimal> getAllId() {
		
		return userrepo.getAllId();
	}

	
}
