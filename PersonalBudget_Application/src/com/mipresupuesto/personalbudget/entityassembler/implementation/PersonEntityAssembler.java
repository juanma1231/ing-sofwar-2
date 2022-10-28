package com.mipresupuesto.personalbudget.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

@Component
public class PersonEntityAssembler implements EntityAssembler<PersonEntity, PersonDomain> {

	@Override
	public PersonDomain asssembleDomain(PersonEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity assembleEntity(PersonDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
