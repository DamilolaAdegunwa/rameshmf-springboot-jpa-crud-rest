package com.companyname.springbootcrudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCrudRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRestApplication.class, args);
	}
}
//https://github.com/DamilolaAdegunwa/rameshmf-springboot-jpa-crud-rest
//https://github.com/RameshMF/springboot-jpa-crud-rest