package com.mentes.micro.vaccine.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class VaccineCenter {

	@NonNull
	private int id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String address;
	
	private List<Citizen> citizens;
}
