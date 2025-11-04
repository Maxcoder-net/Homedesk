package com.sal.part;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PartprocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartprocApplication.class, args);
	}

}
