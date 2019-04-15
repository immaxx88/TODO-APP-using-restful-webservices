package com.todos.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@CrossOrigin(origins = "http://localhost:4200")
public class TodoHardcodedService {
	

private static List<Todo> todos= new ArrayList();
private static int idCounter = 0;

static {
	todos.add(new Todo(++idCounter,"root","Learn to Dance","23/06/2014",false));
	todos.add(new Todo(++idCounter,"root","Learn AngulaR","23/06/2015",false));
	todos.add(new Todo(++idCounter,"root","Learn MicroServices","23/06/2016",false));
}

public List<Todo> findAll(){
	return todos;
}

public Todo deleteById(long id) {
	Todo todo = findById(id);
	if(todo == null) return null;
	
	if(todos.remove(todo)) {
		return todo;
	}
	return null;
}	

public Todo save(Todo todo) {
	if(todo.getId()==-1 || todo.getId()==0) {
		todo.setId(++idCounter);
		todos.add(todo);
	}
	else {
		deleteById(todo.getId());
		todos.add(todo);
	}
	return todo;
}

public Todo findById(long id) {
	// TODO Auto-generated method stub
	for(Todo todo:todos) {
	if(todo.getId()==id) {
		return todo;
	}
	}
	return null;
}
}
