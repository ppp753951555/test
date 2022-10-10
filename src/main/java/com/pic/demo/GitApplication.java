package com.pic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
	}

	@GetMapping("/")
	public String test(){
		return "test";
	}

}
