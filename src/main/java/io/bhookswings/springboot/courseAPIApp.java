package io.bhookswings.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class courseAPIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(courseAPIApp.class, args);
		
	}

}
