package com.testvagrant.assignment;

public class SongsException extends Exception {

	public ExceptionType exceptionType;
	public String message;

	public enum ExceptionType {
		EMPTY, NULL;
	}

	public SongsException(String message, ExceptionType exceptionType) {
		this.message = message;
		this.exceptionType = exceptionType;
	}
}