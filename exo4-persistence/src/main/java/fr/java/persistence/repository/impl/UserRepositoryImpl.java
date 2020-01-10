package fr.java.persistence.repository.impl;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

import fr.java.persistence.entities.UserEntity;
import fr.java.persistence.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	private static Logger LOGGER = Logger.getLogger(UserRepositoryImpl.class.getName());

	public Stream<UserEntity> findAll() {
		LOGGER.info("UserRepositoryImpl : Find All Start");
		UserEntity userEntity1 = new UserEntity("Gerard", "Menvussa");
		UserEntity userEntity2 = new UserEntity("Leopold", "Nord");
		List<UserEntity> all = List.of(userEntity1, userEntity2);
		LOGGER.info("UserRepositoryImpl : Find All End: " + all.size() + " entities");
		return all.stream();
	}
}