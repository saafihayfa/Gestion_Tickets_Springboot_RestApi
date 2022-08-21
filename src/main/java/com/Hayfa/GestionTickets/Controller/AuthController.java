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
import com.Hayfa.GestionTickets.entities.AuthRequest;
import com.Hayfa.GestionTickets.Config.jwtutil;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class AuthController // implements java.io.Serializable 
{

	@Autowired
	private jwtutil jwtutil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to my website !!";
	}
     
	
	 @PostMapping("/authenticate")
	 //@CrossOrigin(origins="http://localhost:8087/api/authenticate")
	    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
	            );
	        } catch (Exception ex) {
	            //throw new Exception("inavalid username/password");
	        }
	        return jwtutil.generateToken(authRequest.getUserName());
	       
	    }

}
