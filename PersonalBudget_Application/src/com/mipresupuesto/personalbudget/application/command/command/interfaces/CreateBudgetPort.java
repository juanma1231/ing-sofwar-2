package com.mipresupuesto.personalbudget.application.command.command.interfaces;

import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public interface CreateBudgetPort {
	
	void execute(BudgetDTO budget);
	

}
