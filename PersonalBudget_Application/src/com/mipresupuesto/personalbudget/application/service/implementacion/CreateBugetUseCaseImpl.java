package com.mipresupuesto.personalbudget.application.service.implementacion;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.data.interfaces.BuddgetRepository;

@Service
@Transactional
public class CreateBugetUseCaseImpl implements CreateBudgetUseCase {

	@Autowired
	private EntityAssembler<BudgetEntity, BudgetDomain> entityAssembler;

	@Autowired
	private BuddgetRepository budgetRepository;

	@Override
	public void execute(BudgetDomain budget) {
		budgetRepository.save(entityAssembler.assembleEntity(budget));

	}

}
