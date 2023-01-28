package com.mentes.micro.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor 
public class Citizen {
	/*
	 * public Citizen(int id, String name, String vaccinationCenter) { this.id=id;
	 * this.name= name; this.vaccinationCenter = vaccinationCenter; }
	 */

	@NonNull
	private int id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String vaccinationCenter;
}
