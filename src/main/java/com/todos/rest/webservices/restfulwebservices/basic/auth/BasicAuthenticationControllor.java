package com.todos.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins="http://localhost:4200")
@RestController
public class BasicAuthenticationControllor{

	@RequestMapping(method=RequestMethod.GET,path="/basicauth")
	public AutenticationBean helloWorldBean() {
		//throw new RuntimeException("Some Error Present");
		
		return new AutenticationBean("You are Authenticated man");
	}

	}

	 