package org.springframework.cloud.stream.app.filter.processor.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilterProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterProcessorRabbitApplication.class, args);
	}
}