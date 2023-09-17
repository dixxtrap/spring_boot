package com.example.sen_cim;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SenCimApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenCimApplication.class, args);
	}
	@GetMapping
	User getUser(){
		return new User(1L, "Djiga Salne");
	}
class User{
	private final Long id;
	private final String name;

		User(Long id, String name){


			this.id=id;
			this.name=name;
		}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
}
