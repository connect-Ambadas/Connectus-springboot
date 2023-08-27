package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.repository.ConnectUsAdminRepository;
import com.example.demo.repository.ConnectUsWorkerRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})
@EnableJpaRepositories(basePackageClasses = { ConnectUsAdminRepository.class , ConnectUsWorkerRepository.class})
@EntityScan("com.example.demo.model")
public class LogintestApplication {

	public static void main(String[] args) {
		
		System.out.println("login app");
		SpringApplication.run(LogintestApplication.class, args);
	}

}
