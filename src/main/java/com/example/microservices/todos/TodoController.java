package com.example.microservices.todos;

import java.util.LinkedList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TodoController {

	private LinkedList<Todo> TodoList = new LinkedList<Todo>();

	@RequestMapping()
	public void addTodo(Todo todo) {
		TodoList.add(todo);
	}

	public void updateTodo(int index, Todo todo) {
		TodoList.add(index, todo);
	}

	public void clearList(Todo todo) {
		TodoList.clear();
	}

	public LinkedList<Todo> getTodoList() {
		return this.TodoList;
	}
	
	@GetMapping(value = "/todo")
	public String getTodos(@RequestParam(value = "name") String todo) {
		return String.format("Hello %s!", todo);
	}

	@PostMapping(value = "/todo")
	public String createTodo(@RequestParam(value = "name") String todo) {
		return "";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/error")
	public String error(@RequestParam(value = "error_message", defaultValue = "error_message") String error_message) {
		return ("");
	}

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "video not found")
	public class VideoNotFoundException extends RuntimeException {

	}
}
