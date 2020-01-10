package fr.java.service;

import java.util.stream.Stream;

import fr.java.persistence.entities.UserEntity;
import fr.java.persistence.repository.RepositoryFactory;
import fr.java.persistence.repository.UserRepository;

public class AppMain {

	public static void main(String[] args) {
		// UserRepositoryImpl is hidden
		RepositoryFactory factory = new RepositoryFactory();
		UserRepository userRepository = factory.createUser();
		Stream<UserEntity> entities = userRepository.findAll();
		entities.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));

	}

}
