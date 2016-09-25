package com.sis.resttest.exception;

public class TeamException extends Exception {

	private static final long serialVersionUID = -7357649461142084736L;

	public TeamException(String teamName) {
		super(String.format("There was a problem retrieving information for team [%s].", teamName));
	}

}
