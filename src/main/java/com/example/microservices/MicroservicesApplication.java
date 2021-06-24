package com.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping; //(RequestMapping method=GET)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@SpringBootApplication
@RestController
public class MicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

	@GetMapping(value = "/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/error")
	public String error(@RequestParam(value = "error_message", defaultValue = "error_message") String error_message) {
		return ("");
	}

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "video not found")
	public class VideoNotFoundException extends RuntimeException {
	}

}
