package htu.first.jpa.firstjpa;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import htu.first.jpa.firstjpa.entity.StudentEntity;
import htu.first.jpa.firstjpa.repository.StudentRepo;

@SpringBootApplication
public class FirstjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstjpaApplication.class, args);
	}
}
