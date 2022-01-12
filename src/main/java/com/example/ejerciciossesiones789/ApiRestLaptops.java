package com.example.ejerciciossesiones789;

import com.example.ejerciciossesiones789.entities.Laptop;
import com.example.ejerciciossesiones789.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ApiRestLaptops {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiRestLaptops.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"hp", "intel i7", 8L, LocalDate.of(2022, 1, 8));
		Laptop laptop2 = new Laptop(null,"Lg", "intel i7", 16L, LocalDate.of(2022, 1, 8));

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
