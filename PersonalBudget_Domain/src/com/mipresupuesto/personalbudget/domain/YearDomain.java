package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public final class YearDomain {

	private  UUID id;
	private int year;
	
	private YearDomain(final UUID id, final int year) {
		setId(id);
		setYear(year);
	}
	
	public static final YearDomain create(final UUID id, final int year) {
		return new YearDomain(id, year);
	}
	
	public final void setId(UUID id) {
		this.id = (id== null) ? UtilUUID.DEFAULT_UUID : id;
	}

	private final void setYear(final int year) {
		this.year = year;
	}

	public final UUID getId() {
		return id;
	}
//No se pueden modificar ni heredar los FINAL
	public final int getYear() {
		return year;
	}
	
}
