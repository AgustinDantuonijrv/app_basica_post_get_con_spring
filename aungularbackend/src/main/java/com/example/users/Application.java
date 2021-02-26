package com.example.users;

import com.example.users.entities.User;
import com.example.users.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.stream.Stream;

@SpringBootApplication
public class Application {
private final String password = "01123581342506320";
int num = 0;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public String falsehash(String p, int n) {
		String pas = "nonull";
		int hash = 101;
		p = p + pas + hash + n;
		//we are going to hash the password and
		// then recall the function
		// to print in the console
		return p;
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("titi", "mosa", "ana", "gina", "pedro").forEach(name -> {
				num = num + 1;
				User user = new User(name, name.toLowerCase() + "@domain.com", falsehash(password,num));
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}


