package com.mipresupuesto.personalbudget.dto;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class YearDTO {
	
	private UUID id;
	private int year;
	
	public YearDTO() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public YearDTO(UUID id, int year) {
		setId(id);
		setYear(year);
	}
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	private final void setId(final UUID id) {
		this.id = (id== null) ? UUID.randomUUID() : id;
	}
	
	public final int getYear() {
		if (year < 0 ) {
			setYear(0);
		}
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
	
	
}
