package com.project.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		System.out.println("Docker project starts!");
		SpringApplication.run(DockerApplication.class, args);
	}

}
