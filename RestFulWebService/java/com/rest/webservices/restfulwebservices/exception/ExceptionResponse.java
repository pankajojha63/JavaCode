package com.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timseStamp;
	private String message;
	private String details;

	public ExceptionResponse(Date timseStamp, String message, String details) {
		super();
		this.timseStamp = timseStamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimseStamp() {
		return timseStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
