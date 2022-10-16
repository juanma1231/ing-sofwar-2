package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class YearEntity {
	
	private UUID id;
	private int year;
	
	public YearEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public static final YearEntity create() {
		return new YearEntity();
	}
	
	public YearEntity(UUID id, int year) {
		this.id = id;
		this.year = year;
	}
	
	public final UUID getId() {
		return id;
	}

	public final void setId(final UUID id) {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		this.id = id;
	}
	
	public final int getYear() {
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
	
}
