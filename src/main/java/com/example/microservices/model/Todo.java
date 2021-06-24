package com.example.microservices.model;

public class Todo {
	private String todo;

	public Todo(String todo) {
		this.setTodo(todo);
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

}
