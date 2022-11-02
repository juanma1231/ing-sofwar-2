package com.mipresupuesto.personalbudget.crosscutting.util.sql;

import java.sql.Connection;
import java.sql.SQLException;

import com.mipresupuesto.personalbudget.crosscutting.exception.GeneralException;
import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;

public class UtilConnection {
	private UtilConnection() {

	}

	public static boolean isClosed(Connection connection) {

		if (UtilObject.getUtilObject().isNull(connection)) {

			throw GeneralException.build("Connection is null!!!");
		}
		try {
			return connection.isClosed();
		} catch (SQLException exception) {
			throw GeneralException.build("Problems trying validate if connection was closed", exception);
		}

	}

	private static boolean isOpen(Connection connection) {
		return !isClosed(connection);
	}

}
