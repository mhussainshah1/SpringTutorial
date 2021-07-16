package me.kodysimpson.MyFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Scan all Beans and default packages
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}
}
