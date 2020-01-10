package fr.java.persistence.repository;

import java.util.stream.Stream;

import fr.java.persistence.entities.UserEntity;

public interface UserRepository {
	Stream<UserEntity> findAll();
}