package com.mipresupuesto.personalbudget.dto;

import java.util.UUID;

public class YearDTO {
	
	private UUID id;
	private int year;
	
	public YearDTO() {
		setYear(0);
	}
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	public YearDTO(UUID id, int year) {
		this.year = year;
	}
	
	public final UUID getId() {
		return id;
	}

	private final void setId(final UUID id) {
		this.id = (id== null) ? UUID.randomUUID() : id;
	}
	
	public final int getYear() {
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
	
	
}
