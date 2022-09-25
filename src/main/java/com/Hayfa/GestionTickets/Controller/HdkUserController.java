package com.Hayfa.GestionTickets.Controller;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Hayfa.GestionTickets.Service.HdkUserService;
import com.Hayfa.GestionTickets.entities.HdkUser;

@RestController
@RequestMapping("/api")
public class HdkUserController {

	@Autowired
	HdkUserService userservice;

	@GetMapping("/users")
	public ResponseEntity<List<HdkUser>> getUsers() {

		return ResponseEntity.ok().body(userservice.getUsers());

	}

	@GetMapping("users/{username}")
	@ResponseBody
	public HdkUser getuser(@PathVariable("username") String name) {
		return userservice.getUser(name);
	}

	@GetMapping("users/{usermail}")
	@ResponseBody
	public HdkUser getusermail(@PathVariable("usermail") String mail) {
		return userservice.getUser(mail);
	}

	@PostMapping("/adduser")
	public ResponseEntity<HdkUser> adduser(@RequestBody HdkUser u) {
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/adduser").toString());
		return ResponseEntity.created(uri).body(userservice.SaveUser(u));

	}
	
	@GetMapping("/getAllId")
	public ResponseEntity<List<BigDecimal>> getAllId() {

		return ResponseEntity.ok().body(userservice.getAllId());

	}
	
	

}
