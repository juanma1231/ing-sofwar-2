package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

import java.util.UUID;

public class PersonDomainBuilder {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String firstSurname;
	private String secondSurname;


	private PersonDomainBuilder() {
		setId(UUID.randomUUID());
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
	}

	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}

	private final UUID getId() {
		return id;
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

	public final PersonDomainBuilder setId(UUID id) {
		this.id = (id == null) ? UUID.randomUUID() : id;
		return this;

	}

	private final String getIdCard() {
		return idCard;
	}

	public final PersonDomainBuilder setIdCard(String idCard) {
		this.idCard = idCard == null ? "" : idCard.trim();
		return this;

	}

	private final String getFirstName() {
		return firstName;
	}

	public final PersonDomainBuilder setFirstName(String firstName) {
		this.firstName = firstName == null ? "" : firstName.trim();
		return this;

	}

	private final String getMiddleName() {
		return middleName;
	}

	public final PersonDomainBuilder setMiddleName(String middleName) {
		this.middleName = middleName == null ? "" : middleName.trim();
		return this;

	}

	private final String getLastName() {
		return lastName;
	}

	public final PersonDomainBuilder setLastName(String lastName) {
		this.lastName = lastName == null ? "" : lastName.trim();
		return this;
	}

	public PersonDomain build() {
		return PersonDomain.build(getId(), getIdCard(), getFirstName(), getMiddleName(), getLastName());
	}

}
