package com.mipresupuesto.personalbudget.application.entityassembler;

import com.mipresupuesto.personalbudget.domain.BudgetDomain;

public interface EntityAssembler <E,D> {
	E assemblerDomain(D domain);
	D assemblerEntity(E entity);
}
