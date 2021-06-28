package com.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping; //(RequestMapping method=GET)
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.todos.TodoController;

@SpringBootApplication
@RestController
public class MicroservicesApplication {

	public static void main(String[] args) {
		TodoController cont=new TodoController();
		SpringApplication.run(MicroservicesApplication.class, args);
		
	}

}
