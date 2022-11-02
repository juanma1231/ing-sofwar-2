package com.mipresupuesto.personalbudget.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.entity.YearEntity;

@Component
public class YearEntityAssembler implements EntityAssembler<YearEntity, YearDomain> {

	@Override
	public YearEntity assemblerDomain(YearDomain domain) {
		YearEntity entity = new YearEntity();
		if(domain != null) {
			entity = new YearEntity(domain.getId(),domain.getYear());
		}
		return entity;
	}

	@Override
	public YearDomain assemblerEntity(YearEntity entity) {

		YearDomain domain = YearDomainBuilder.get().build();

		if (entity != null) {
			domain = YearDomainBuilder.get()
					.setId(entity.getId())
					.setYear(entity.getYear())
					.build();
		}
		return domain;
	}

}



