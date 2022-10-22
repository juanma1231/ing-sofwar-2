package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonDomain {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	
	private PersonDomain(final UUID id, final String idCard, final String firstName, 
			final String middleName, final String firstSurname, final String secondSurname) {
		setId(id);
		setidCard(idCard);
		setfirstName(firstName);
		setmiddleName(middleName);
		setfirstSurname(firstSurname);
		setsecondSurname(secondSurname);
	}
	
	public static PersonDomain create(final UUID id, final String idCard, final String firstName, 
			final String middleName, final String firstSurname, final String secondSurname) {
		return new PersonDomain(id, idCard, firstName, middleName, firstSurname, secondSurname);
	}
	
	public final void setId(final UUID id) {
		this.id = (id== null) ? UtilUUID.DEFAULT_UUID : id;
	}
	
	public final void setidCard(String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim(); 
	}
	
	public final void setfirstName(String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim(); 
	}
	
	public final void setmiddleName(String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim(); 
	}
	
	public final void setfirstSurname(String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim(); 
	}
	
	public final void setsecondSurname(String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : secondSurname.trim(); 
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

	public final String getFirstSurname() {
		return firstSurname;
	}
	
	public final String getSecondSurname() {
		return secondSurname;
	}
	
	public final String getLastName() {
		return getFirstSurname() + " " + getSecondSurname();
	}
	
	public final String getName() {
		return (getFirstName() + " " + getMiddleName().trim() + " " + getLastName());
	}
	
}

