package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;


@Entity
@Table(name = "Person")
public final class PersonEntity {
	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name = "idCard")
	private String idCard;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "middleName")
	private String middleName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstSurname")
	private String firstSurname;
	@Column(name = "secondSurname")
	private String secondSurname;
	private String name;
	private String completeName;

	public PersonEntity(){
		setId(UtilUUID.DEFAULT_UUID);
		setFirstName("");
		setIdCard("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		
	}

	public PersonEntity(UUID id, String idCard, String firstName, String middleName, 
			String fisrstSurname, String secondSurname, String name, String lastName, String completeName) {
		setId(id);
		setFirstName(firstName);
		setIdCard(idCard);
		setMiddleName(middleName);
		setFirstSurname(fisrstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
	}
	
	public static final PersonEntity create() {
		return new PersonEntity();
	}
	
	
	
	//sets
	public final void setId(UUID id) {
		this.id = id;
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
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public final void setName(String name) {
		this.name = name;
	}

	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	
	
	
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
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

	public final String getFirstSurname() {
		return firstSurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}
	

	public final String getName() {
		return (getFirstName()+ " "+getMiddleName()).trim();
	}
	

	public final String getCompleteName() {
		return getName()+ " "+getLastName();
	}

}

