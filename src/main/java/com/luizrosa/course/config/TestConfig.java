package com.luizrosa.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.luizrosa.course.entities.User;
import com.luizrosa.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // vai ser executado qd a aplicacao foi iniciada
		
		User u1 = new User(null, "Maria Almeida", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Luiz Rosa", "luiz@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
