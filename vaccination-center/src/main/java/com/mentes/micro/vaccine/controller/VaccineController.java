package com.mentes.micro.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentes.micro.vaccine.pojo.VaccineCenter;
import com.mentes.micro.vaccine.service.VaccineService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/vaccine-center")
public class VaccineController {

	@Autowired
	private VaccineService vaccineService;
	
	@RequestMapping("/centerdetails/{centerId}")
	@HystrixCommand(fallbackMethod = "fallbackOfCitizen", commandProperties = {@HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="3")})
	public ResponseEntity<VaccineCenter> getCenterDetails(@PathVariable("centerId") int id) {
		
		VaccineCenter vc =vaccineService.getCenterDetails(id);
		return new ResponseEntity<VaccineCenter>(vc, HttpStatus.OK);
		
	}
	
	public ResponseEntity<VaccineCenter> fallbackOfCitizen(@PathVariable("centerId") int id) {
		
		VaccineCenter vc =vaccineService.getFallbackData(id);
		return new ResponseEntity<VaccineCenter>(vc, HttpStatus.OK);
		
	}
}
