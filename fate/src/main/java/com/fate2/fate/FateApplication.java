package com.fate2.fate;

import javax.persistence.SequenceGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SequenceGenerator(name="seq", initialValue=0)


@EntityScan("com.fate2.fate.entities")
@SpringBootApplication
public class FateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FateApplication.class, args);
	}

}
