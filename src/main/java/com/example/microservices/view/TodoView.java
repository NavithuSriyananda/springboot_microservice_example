package com.example.microservices.view;

import java.util.LinkedList;

import com.example.microservices.model.Todo;

public class TodoView {

	/**
	 * Returns specified no of todos
	 * 
	 * @param todoList - {@link LinkedList}<{@link Todo}>
	 * @param length   - {@link Integer}
	 * @return {@link LinkedList}<{@link Todo}>
	 */
	public LinkedList<Todo> filterTodos(LinkedList<Todo> todoList, int length) {
		try {
			int listLength = todoList.size();
			LinkedList<Todo> tempList = new LinkedList<Todo>();
			int n = (listLength >= length ? length : listLength);
			for (int i = 0; i < n; i++) {
				Todo todo = todoList.get(i);
				tempList.add(i, new Todo(todo.getTodo()));
			}
			return tempList;
		} catch (Exception e) {
			throw e;
		}
	}

}
