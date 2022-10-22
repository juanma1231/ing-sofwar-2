package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {

	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	
	public final BudgetDomainBuilder setId(final UUID id) {
		this.id = UtilUUID.getDefaultUUID(id);
		return this;
	}
	
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}
	
	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (year==null) ? YearDomainBuilder.get().build() : year;
		return this;
	}
	
	private final BudgetDomainBuilder setPerson(final PersonDomain person) {
		this.person = (person==null) ? PersonDomainBuilder.get().build() : person;
		return this;
	}
	
	public final BudgetDomain build() {
		return BudgetDomain.create(id, year, person);
	}
	
}
