package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

public class BudgetEntity {
	
	private UUID id;
	private YearEntity year;
	private PersonEntity person;
	
	public BudgetEntity() {
		setYear(new YearEntity());
		setPerson(new PersonEntity());
	}
	
	
	
	public BudgetEntity(final YearEntity year, final PersonEntity person) {
		setYear(year);
		setPerson(person);
	}
	
	public final YearEntity getYear() {
		if(year == null) {
			setYear(YearEntity.create());
		}
		return year;
	}
	public final void setYear(YearEntity year) {
		this.year = year;
	}
	public final PersonEntity getPerson() {
		if(person == null) {
			setPerson(PersonEntity.create());
		}
		return person;
	}
	public final void setPerson(PersonEntity person) {
		this.person = person;
	}

	public final UUID getId() {
		return id;
	}

	public final void setId(UUID id) {
		this.id = id;
	}
	
	
}
