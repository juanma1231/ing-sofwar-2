package com.mipresupuesto.personalbudget.crosscutting.util.text;

import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;

public class UtilText {
	public static final String EMPTY = "";
	public static final String SPACE = " ";
	private UtilText() {
	}
	
	public static boolean isNull(String value) {
		return UtilObject.getUtilObject().isNull(value);
	}
	
	private static String getDefault(String value, String defaultValue) {
		return UtilObject.getUtilObject().getDefault(value, defaultValue);
	}
	
	public static String getDefault(String value) {
		return getDefault(value, EMPTY);
	}
	
	public static String trim(String value) {
		return getDefault(value).trim();
	}
	public static boolean isEmpty(String value) {
		return EMPTY.equals(trim(value));
	}
}
