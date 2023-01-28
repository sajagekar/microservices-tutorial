package com.mentes.micro.vaccine.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mentes.micro.vaccine.pojo.Citizen;
import com.mentes.micro.vaccine.pojo.VaccineCenter;

@Service
public class VaccineService {

	@Autowired
	private RestTemplate restTemplate;
	
	public VaccineCenter getCenterDetails(int id) {
		
		java.util.List<Citizen> cts = restTemplate .getForObject("http://CITIZEN-SERVICE/citizen/findByVaccineCenter/"+id, java.util.List.class);
		
		VaccineCenter vc = new VaccineCenter(id, "GOV hospital", "Pune", cts);
		
		return vc;
	}
}
