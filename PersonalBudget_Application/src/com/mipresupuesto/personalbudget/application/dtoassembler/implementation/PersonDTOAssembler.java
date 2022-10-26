package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;


import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.dto.PersonDTO;

public class PersonDTOAssembler implements DTOAssembler<PersonDTO, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		PersonDomain domain = PersonDomainBuilder.get().build();
		
		if(UtilObject.getUtilObject().isNull(domain)) {
			domain = PersonDomainBuilder.get().setId(dto.getId())
											  .setLastName()
											  .setfirstName(dto.getFirstName())
											  .setLastName(dto.getLastName())
											  .setmiddleName(dto.getMiddleName())
											  .build();
		}
		return domain;
	}

	@Override
	public PersonDTO assembleDTO(PersonDomain domain) {
		PersonDTO dto = new PersonDTO();
		
		if(domain != null) {
			dto = new PersonDTO(domain.getId(),
					domain.getFirstName(),
					domain.getIdCard(),
					domain.getMiddleName(),
					domain.getFirstSurname(),
					domain.getSecondSurname(),
					domain.getName(),
					domain.getLastName(),
					domain.getCompleteName());
			
		}
		return dto;
	}

}