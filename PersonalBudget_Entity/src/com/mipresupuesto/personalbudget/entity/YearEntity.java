package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
@Entity
@Table(name ="Year")
public class YearEntity {
	@Id
	@Column(name ="id")
	private UUID id;
	@Column(name = "year")
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
