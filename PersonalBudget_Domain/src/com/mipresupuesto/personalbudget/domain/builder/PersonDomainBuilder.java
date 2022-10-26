package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

import java.util.UUID;

public class PersonDomainBuilder {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String lastName;
	private PersonDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setidCard("");
		setfirstName("");
		setmiddleName("");
		setfirstSurname("");
		setsecondSurname("");
	}
	
	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}
	
	public final PersonDomainBuilder setId(UUID id) {
		this.id = (id== null) ? UtilUUID.DEFAULT_UUID : id;
		return this;
	}
	
	public final PersonDomainBuilder setidCard(String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim(); 
		return this;
	}
	
	public final PersonDomainBuilder setfirstName(String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
		return this;
	}
	
	public final PersonDomainBuilder setmiddleName(String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim(); 
		return this;
	}
	
	public final PersonDomainBuilder setfirstSurname(String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim(); 
		return this;
	}
	
	public final PersonDomainBuilder setsecondSurname(String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : secondSurname.trim(); 
		return this;
	}
	public final String setLastName() {
		return getFirstSurname() + " " + getSecondSurname();
	}
	
	public final String setName() {
		return (getFirstName() + " " + getMiddleName().trim() + " " + getLastName());
	}
	
	
	public final String getFirstName() {
		return firstName;
	}

	public final String getLastName() {
		return lastName;
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

	public PersonDomain build() {
		return PersonDomain.create(id, idCard, firstName, middleName, firstSurname, secondSurname);
	}
}
