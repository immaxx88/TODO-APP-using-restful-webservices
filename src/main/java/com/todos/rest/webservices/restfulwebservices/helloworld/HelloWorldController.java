package com.todos.rest.webservices.restfulwebservices.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todos.rest.webservices.restfulwebservices.todo.Todo;

@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String HelloWorld() {
		return "HelloxWorld";
	}
	@CrossOrigin (origins="http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some Error Present");
		return new HelloWorldBean("Hello World in Beans Changed");
	}
	

	@RequestMapping(method = RequestMethod.GET,path = "/hello-world-bean/path-var/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
	
		return new HelloWorldBean(String.format("Hello World %s",name));
	}
	}

