package com.Hayfa.GestionTickets.Controller;

import java.math.BigDecimal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hayfa.GestionTickets.Service.HdkTicketSupportService;
import com.Hayfa.GestionTickets.entities.HdkTicketSupport;


@RestController
@RequestMapping("/api")
public class HdkTicketSupportController {

	@Autowired
	HdkTicketSupportService HdkTicket;

	@GetMapping("/hdkticket")
	@ResponseBody
	public List<HdkTicketSupport> getAlltickets() {
		List<HdkTicketSupport> list = HdkTicket.getAllTickets();
		return list;
	}

	@GetMapping("hdkticket/{id}")
	@ResponseBody
	public Optional<HdkTicketSupport> getticket(@PathVariable BigDecimal id) {
		return HdkTicket.getTicket(id);
	}
	

	@PostMapping("/addhdkticket")
	@ResponseBody
	public HdkTicketSupport addhdkticket(@RequestBody HdkTicketSupport t) {
		return HdkTicket.saveTicket(t);

	}

	@DeleteMapping("deletehdkticket/{id}")
	@ResponseBody
	public void deleteticket(@PathVariable("id") BigDecimal id) {
		HdkTicket.deleteTicketById(id);

	}

	@PutMapping("updatehdkticket/{id}")
	@ResponseBody
	public HdkTicketSupport updatehdkticket(@RequestBody HdkTicketSupport htk, @PathVariable("id") BigDecimal id) {

		htk.setIdTicket(id);
		HdkTicket.updateTicket(htk);
		return htk;
	}
	
	@GetMapping("/findticket")
    public ResponseEntity<List<HdkTicketSupport>> findticket(@RequestParam("query") String query){
        return ResponseEntity.ok(HdkTicket.chercherticket(query));
    }
	
}
