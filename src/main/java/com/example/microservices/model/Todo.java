package com.example.microservices.model;

public class Todo {
	private String task;

	public Todo(String task) {
		this.setTask(task);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
