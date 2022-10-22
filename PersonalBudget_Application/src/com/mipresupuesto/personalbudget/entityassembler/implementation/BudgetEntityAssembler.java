package com.mipresupuesto.personalbudget.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity, BudgetDomain>{

	@Override
	public BudgetDomain asssembleDomain(BudgetEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetEntity assembleDTO(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
