package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonEntity {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	
	public PersonEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}
	//Desactiva sonarlint esta vuelta cuidado
	@SuppressWarnings("all")
	public PersonEntity(UUID id, String idCard, String firstName, String middleName, String firstSurname,
			String secondSurname) {
		this.id = id;
		this.idCard = idCard;
		this.firstName = firstName;
		this.middleName = middleName;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
	}

	public static final PersonEntity create() {
		return new PersonEntity();
	}
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	public final void setId(final UUID id) {
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
