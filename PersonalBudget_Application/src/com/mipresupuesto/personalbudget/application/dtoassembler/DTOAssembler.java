package com.mipresupuesto.personalbudget.application.dtoassembler;

public interface DTOAssembler<T, D>{

	T assembleDTO(D dto);
	D assembleDomain(T domain);
}
