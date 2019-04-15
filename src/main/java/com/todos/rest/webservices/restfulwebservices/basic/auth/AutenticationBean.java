package com.todos.rest.webservices.restfulwebservices.basic.auth;

public class AutenticationBean {

	private String message;

	public AutenticationBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Hello World in Beans [message=%s]",message );
	}
	

}
