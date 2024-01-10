package com.Hayfa.GestionTickets.Controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hayfa.GestionTickets.entities.HdkUser;
import com.Hayfa.GestionTickets.Config.jwtutil;
import com.Hayfa.GestionTickets.Repos.HdkUserRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class AuthController {
	
	@Autowired
	HdkUserRepository userrepository ;

	@Autowired
	private jwtutil jwtutil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to my website !!";
	}
     
	
	 @PostMapping("/authenticate")
	    public HdkUser generateToken(@RequestBody HdkUser authRequest) throws Exception {
	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getUserPwd())
	            );
	        } catch (Exception ex) {
	            throw new Exception("invalid username/password");
	        }
	        
	        String jwt = jwtutil.generateToken(authRequest.getUserName());

	        HdkUser  user = userrepository.findByUserName(authRequest.getUserName());

	        user.settoken(jwt);
	        
	        return  user ;
	        		
	        
	       
	    }

}
