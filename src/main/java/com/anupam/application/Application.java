package com.anupam.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.anupam.elasticsearch.repository")
@ComponentScan(basePackages = "com.anupam")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
