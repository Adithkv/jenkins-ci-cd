package com.ad.jenkins_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoAppApplication {

	@GetMapping("/jenkinstest/{name}")
	public String jenkinsTest(@PathVariable String name){
		name=name.split("")[0];
		return "Hello" + name + "Congrats you have successfully completed jenkins demo";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoAppApplication.class, args);
	}

}
