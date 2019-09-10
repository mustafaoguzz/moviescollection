package com.mustafa.moviescollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.mustafa.moviescollection.persistence.model"})
public class MoviescollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviescollectionApplication.class, args);
	}

}
