package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;


import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.dto.YearDTO;
@Component
public final class YearDTOAssembler implements DTOAssembler<YearDTO, YearDomain>{

	@Override
	public YearDomain assembleDomain(YearDTO dto) {
		
		YearDomain domain = YearDomainBuilder.get().build();
		
		if(dto!=null) {
			domain = YearDomainBuilder.get().setId(dto.getId()).setYear(dto.getYear()).build();
		}
		return domain;
	}

	@Override
	public  YearDTO assembleDTO(YearDomain domain) {
		YearDTO dto = new YearDTO();
		
		if(domain != null) {
			dto = new YearDTO(domain.getId(), domain.getYear());
		}
		return null;
	}
}
