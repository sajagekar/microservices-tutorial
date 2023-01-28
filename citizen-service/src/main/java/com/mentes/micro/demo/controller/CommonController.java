package com.mentes.micro.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mentes.micro.demo.pojo.Citizen;
import com.mentes.micro.demo.services.CitizenService;

@RestController
@RequestMapping("/citizen")
public class CommonController {

	@Autowired
	private CitizenService cs;
	
	@PostMapping(path = "/register")
	public ResponseEntity<String> registerUser(@RequestBody Citizen citizen) {
		cs.registerCitizen(citizen);
		return new ResponseEntity<String>("Welcome, " +citizen.getName(), HttpStatus.OK);
	
	}
	
	@GetMapping(path = "/find/{user}")
	public ResponseEntity<Citizen> findUser(@PathVariable("user") int id ) {
		
		Citizen ct = cs.getCitizen(id);
		return new ResponseEntity<Citizen>(ct, HttpStatus.OK);
	
	}
	
	@GetMapping(path = "/findByVaccineCenter/{centerId}")
	public ResponseEntity<List<Citizen>> findByVaccineCenter(@PathVariable("centerId") int id ) {
		
		List<Citizen> cts = cs.findByCenterId(id);
		return new ResponseEntity<List<Citizen>>(cts, HttpStatus.OK);
	
	}
	
	@RequestMapping()
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello Test", HttpStatus.OK);
	
	}
}
