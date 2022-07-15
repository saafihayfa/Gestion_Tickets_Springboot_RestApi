package com.Hayfa.GestionTickets.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.Hayfa.GestionTickets.Repos.HdkUserRepository;
import com.Hayfa.GestionTickets.entities.HdkUser;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private HdkUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// System.out.println("hiiiiiiii");

		HdkUser user = userRepository.findByUserName(username);
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getUserPwd(),
				new ArrayList<>());

	}
}
