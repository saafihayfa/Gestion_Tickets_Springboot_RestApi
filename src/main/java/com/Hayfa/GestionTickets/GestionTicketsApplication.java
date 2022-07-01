package com.Hayfa.GestionTickets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Hayfa.GestionTickets.Service.HdkUserService;
import com.Hayfa.GestionTickets.entities.HdkUser;

@SpringBootApplication
public class GestionTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionTicketsApplication.class, args);
	}

	@Bean
	CommandLineRunner run(HdkUserService userservice) {

		return args -> {

			// userservice.SaveUser(new HdkUser("1111.2222",  "1111.2222","1111.2222","a","a","a","27/06/22","27/06/22",'y','n',"1111.2222","a","a","a",[1,2,546],"27/06/22","27/06/22", "1111.2222"));
			//userservice.getUsers() ;
			// userservice.SaveUser(new HdkUser(null, "cc", "dd", "5678", new
			// ArrayList<>()));

		};
	}

}
