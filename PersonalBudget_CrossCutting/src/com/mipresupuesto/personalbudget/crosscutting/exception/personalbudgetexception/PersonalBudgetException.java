package com.mipresupuesto.personalbudget.crosscutting.exception.personalbudgetexception;

import com.mipresupuesto.personalbudget.crosscutting.exception.GeneralException;
import com.mipresupuesto.personalbudget.crosscutting.exception.enumeration.ExceptionLocation;
import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;

public class PersonalBudgetException extends GeneralException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4416685187162507077L;
	private ExceptionType type;
	private ExceptionLocation location;
	
	private PersonalBudgetException(String userMessage, String tecnicalMessage, Exception rootExeption, ExceptionType type,
			ExceptionLocation location) {
		super(userMessage, tecnicalMessage, rootExeption);
		setType(type);
		setLocation(location);
	}
	
	public static PersonalBudgetException build(String userMessage, String technicalMessage) {
		return new PersonalBudgetException(userMessage, technicalMessage, null, null, null);
	}

	public static PersonalBudgetException build(String userMessage, String tecnicalMessage, Exception rootExeption) {
		return new PersonalBudgetException(userMessage, tecnicalMessage, rootExeption, null, null);
	}

	public static PersonalBudgetException build(String userMessage) {
		return new PersonalBudgetException(userMessage, userMessage, null, ExceptionType.BUSINESS, null);
	}

	public static PersonalBudgetException buildTechnicalExeption(String tecnicalMessage) {
		return new PersonalBudgetException(null, tecnicalMessage, null, ExceptionType.TECHNICAL, null);
	}

	public static PersonalBudgetException buildTechnicalExeption(String tecnicalMessage, Exception rootException,
			ExceptionLocation location) {
		return new PersonalBudgetException(null, tecnicalMessage, rootException, ExceptionType.TECHNICAL, location);
	}

	public static PersonalBudgetException buildTechnicalDataException(String tecnicalMessage) {
		return new PersonalBudgetException(null, tecnicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.INFRASTRUCTURE);
	}

	public static PersonalBudgetException buildTechnicalDataException(String tecnicalMessage, Exception exception) {
		return new PersonalBudgetException(null, tecnicalMessage, exception, ExceptionType.TECHNICAL, ExceptionLocation.INFRASTRUCTURE);
	}
	
	public static PersonalBudgetException buildTechnicalBusinessLogicExeption(String tecnicalMessage) {
		return new PersonalBudgetException(null, tecnicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.DOMAIN);
	}
	public static PersonalBudgetException buildTBusinessLogicExeption(String businessMessage) {
		return new PersonalBudgetException(businessMessage, null, null, ExceptionType.BUSINESS, ExceptionLocation.DOMAIN);
	}
	
	

	public ExceptionType getType() {
		return type;
	}

	public ExceptionLocation getLocation() {
		return location;
	}

	private void setType(ExceptionType type) {
		this.type = UtilObject.getUtilObject().getDefault(type, ExceptionType.GENERAL);
	}

	private void setLocation(ExceptionLocation location) {
		this.location = UtilObject.getUtilObject().getDefault(location, ExceptionLocation.GENERAL);
	}
}
