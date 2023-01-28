package com.mentes.micro.demo.services;

import java.util.List;

import com.mentes.micro.demo.pojo.Citizen;

public interface CitizenService {

	public Citizen getCitizen(int id);

	public void registerCitizen(Citizen citizen);
	
	public void deleteCitizen(Citizen citizen);

	List<Citizen> findByCenterId(int id);
	
}
