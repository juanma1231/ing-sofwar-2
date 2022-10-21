package com.mipresupuesto.personalbudget.application.command.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.command.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public class CreateBudgetCommand implements CreateBudgetPort {
	@Service
	private DTOassembler<BudgetDTO, Budgetdomain> dtoAssambler;
	@Autowired
	private CreateBudgetUseCase usecase;

	@Override
	public void execute(BudgetDTO budget) {
		usecase.execute(dtoAAssembler.assembleDomain(budget));
		// TODO Auto-generated method stub
		
	}

}
