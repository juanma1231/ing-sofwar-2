package com.mipresupuesto.personalBudget.application.dtoassembler;

public interface DTOAssembler<T, D> {

	D assembleDomain(T dto);
	
	T assembleDTO(D domain);
}
