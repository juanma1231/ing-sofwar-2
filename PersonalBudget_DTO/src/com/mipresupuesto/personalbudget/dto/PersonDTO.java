package com.mipresupuesto.personalbudget.dto;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonDTO {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;
	
	public PersonDTO() {
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		setCompleteName("");
	}
	//Desactiva sonarlint esta vuelta cuidado
	@SuppressWarnings("all")
	public PersonDTO(final UUID id, final String idCard, final String firstName, final String middleName, final String firstSurname,
			final String secondSurname, final String name, final String lastName, final String completeName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
	}
	
	public final String getName() {
		if(name==null) {
			setName("");
		}
		return name.trim();
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getLastName() {
		if(lastName==null) {
			setLastName("");
		}
		return lastName.trim();
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getCompleteName() {
		if(completeName==null) {
			setCompleteName("");
		}
		return completeName;
	}

	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public static final PersonDTO create() {
		return new PersonDTO();
	}
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	public final void setId(UUID id) {
		this.id = id;
	}
	public final String getIdCard() {
		return idCard;
	}
	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		return middleName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
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
	
	
	
	
}