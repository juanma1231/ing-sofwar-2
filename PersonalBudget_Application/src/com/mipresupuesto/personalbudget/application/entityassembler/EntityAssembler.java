package com.mipresupuesto.personalbudget.application.entityassembler;

import com.mipresupuesto.personalbudget.domain.BudgetDomain;

public interface EntityAssembler<E, D> {
	
	D asssembleDomain(E entity);
	E assembleDTO(D domain);
}
