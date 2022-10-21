package com.mipresupuesto.personalbudget.application.service.implementacion;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.infrastructure.data.interfaces.BuddgetRepository;
@Service
@Transactional
public final class CreateBugetUseCaseImpl implements CreateBudgetUseCase {
	@Autowired
	private  EntityAssembler<BudgetEntity, BudgetDomain> entitAsssambler;
	@Autowired
	private BuddgetRepository budgetRepoitory;

	@Override
	public final void excute(BudgetDomain budget) {
		budgetRepoitory.save(entityAssembler.assembleEntity(budget));
		// TODO Auto-generated method stub
		
	}
	

}
