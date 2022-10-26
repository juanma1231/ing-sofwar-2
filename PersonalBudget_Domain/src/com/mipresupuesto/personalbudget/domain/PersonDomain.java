package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonDomain {
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String firstSurname;
	private String secondSurname;


	public final String getFirstSurname() {
		return firstSurname;
	}

	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}

	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	private PersonDomain(UUID id, String idCard, String firstName, String middleName, String lastName) {
		this.id = id;
		this.idCard = idCard;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

	}

	public static PersonDomain build(UUID id, String idCard, String firstName, String middleName, String lastName) {
		return new PersonDomain(id, idCard, firstName, middleName, lastName);
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final String getName() {
		return (getFirstName() + " " + getMiddleName()).trim();
	}

	public final String getCompleteName() {
		return (getName() + " " + getLastName()).trim();
	}

	public final void setId(UUID id) {
		this.id = (id == null) ? UUID.randomUUID() : id;
	}

	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
