package com.Hayfa.GestionTickets.Controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hayfa.GestionTickets.Service.HdkTypeTicketService;
import com.Hayfa.GestionTickets.entities.HdkTypeTicket;

@RestController
@RequestMapping("/api")
public class HdkTypeTicketController {

	@Autowired
	HdkTypeTicketService hdktypeticket;

	@GetMapping("/hdktypeticket")
	@ResponseBody
	public List<HdkTypeTicket> getAlltickets() {
		List<HdkTypeTicket> list = hdktypeticket.getAllTypeTicket();
		return list;
	}

	@GetMapping("hdktypeticket/{id}")
	@ResponseBody
	public Optional<HdkTypeTicket> getticket(@PathVariable("id") BigDecimal id) {
		return hdktypeticket.getTypeTicket(id);

	}

	@PostMapping("/addhdktypeticket")
	@ResponseBody
	public HdkTypeTicket addhdktypeticket(@RequestBody HdkTypeTicket t) {
		return hdktypeticket.saveTypeTicket(t);

	}

	@DeleteMapping("deletehdktypeticket/{id}")
	@ResponseBody
	public void deletetypeticket(@PathVariable("id") BigDecimal id) {
		hdktypeticket.deleteTypeTicketById(id);

	}

	@PutMapping("updatehdktypeticket/{id}")
	@ResponseBody
	public HdkTypeTicket updatehdktypeticket(@RequestBody HdkTypeTicket htk, @PathVariable("id") BigDecimal id) {

		htk.setIdType(id);
		hdktypeticket.updateTypeTicket(htk);
		return htk;
	}

}
