package com.mentes.micro.vaccine.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor 
public class VaccineCenter {

	private int id;
	
	private String name;
	
	private String address;
	
	private List<Citizen> citizens;
}
