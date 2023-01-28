package com.mentes.micro.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mentes.micro.demo.pojo.Citizen;
import com.mentes.micro.demo.services.CitizenService;

@Service
public class CitizenServiceImpl implements CitizenService {

	@Override
	public Citizen getCitizen(int id) {
		return new Citizen(1, "Johny", "K10110");
	}

	@Override
	public void registerCitizen(Citizen citizen) {
		System.out.println("Saved Citizen");
	}

	@Override
	public void deleteCitizen(Citizen citizen) {
		System.out.println("Deleted citizen");		
	}
	
	@Override
	public List<Citizen> findByCenterId(int id) {
		List<Citizen> lstCitizens = new ArrayList<Citizen>();
		lstCitizens.add(new Citizen(1, "Johny", "K10110"));
		lstCitizens.add(new Citizen(2, "Kiser", "K10110"));
		lstCitizens.add(new Citizen(3, "Sunil", "K10110"));
		lstCitizens.add(new Citizen(4, "Ahmed", "K10110"));
		
		return lstCitizens;
	}

}
