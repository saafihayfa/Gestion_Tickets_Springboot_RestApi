package com.Hayfa.GestionTickets.Controller;

import java.math.BigDecimal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

import com.Hayfa.GestionTickets.Repos.HdkTicketSupportRepository;
import com.Hayfa.GestionTickets.Repos.HdkUserRepository;
import com.Hayfa.GestionTickets.Service.HdkTicketSupportService;
import com.Hayfa.GestionTickets.entities.HdkTicketSupport;
import com.Hayfa.GestionTickets.entities.HdkUser;

@RestController
@RequestMapping("/api")
public class HdkTicketSupportController {

	@Autowired
	HdkUserRepository userrepository;

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
	public ResponseEntity<List<HdkTicketSupport>> findticket(@RequestParam("query") String query) {
		return ResponseEntity.ok(HdkTicket.chercherticket(query));
	}

	@RequestMapping(value = "/receivedticket", method = RequestMethod.GET)
	public List<HdkTicketSupport> receivedticket() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails authUser = (UserDetails) principal;
		BigDecimal idUser = userrepository.findByUserName(authUser.getUsername()).getIdUser();
		List<HdkTicketSupport> results = HdkTicket.findTicketByAttributedTo(idUser);

		System.out.println(results.toString());

		return results;

	}

	@RequestMapping(value = "/sentticket", method = RequestMethod.GET)
	public List<HdkTicketSupport> sentticket() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails authUser = (UserDetails) principal;
		HdkUser idUser = userrepository.findByUserName(authUser.getUsername());

		List<HdkTicketSupport> results = HdkTicket.findTicketByidUser(idUser);

		System.out.println(results.toString());
		return results;

	}

	@GetMapping("/notaffec_ticket")
	public ResponseEntity<List<HdkTicketSupport>> notaffec_ticket() {
		return ResponseEntity.ok(HdkTicket.notaff_ticket());
	}

	@GetMapping("/resolved_ticket")
	public ResponseEntity<List<HdkTicketSupport>> resolved_ticket() {
		return ResponseEntity.ok(HdkTicket.resolved_ticket());
	}

	@GetMapping("/pending_ticket")
	public ResponseEntity<List<HdkTicketSupport>> pending_ticket() {
		return ResponseEntity.ok(HdkTicket.pending_ticket());
	}

	@GetMapping("/progress_ticket")
	public ResponseEntity<List<HdkTicketSupport>> progress_ticket() {
		return ResponseEntity.ok(HdkTicket.progress_ticket());
	}

	@GetMapping("/test_ticket")
	public ResponseEntity<List<HdkTicketSupport>> test_ticket() {
		return ResponseEntity.ok(HdkTicket.test_ticket());
	}

//	@GetMapping("/othersticket")
//	public ResponseEntity<List<HdkTicketSupport>> othersticket() {
//		return ResponseEntity.ok(HdkTicket.others_ticket());
//	}

}
