package com.Hayfa.GestionTickets;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Hayfa.GestionTickets.Repos.HdkUserRepository;

import com.Hayfa.GestionTickets.entities.HdkUser;

@SpringBootApplication
public class GestionTicketsApplication {

	/*@Autowired
	private HdkUserRepository userrepository;

	@PostConstruct
	public void initUsers() {
		List<HdkUser> users = Stream.of
				(new HdkUser( "saafi", "1234", "saafihay@gmail.com")
				).collect(Collectors.toList());
		userrepository.saveAll(users);
	} */

	public static void main(String[] args) {
		SpringApplication.run(GestionTicketsApplication.class, args);
	} 

}
