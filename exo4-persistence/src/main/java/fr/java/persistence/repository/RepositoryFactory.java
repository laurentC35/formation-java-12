package fr.java.persistence.repository;

import fr.java.persistence.repository.impl.UserRepositoryImpl;

public class RepositoryFactory {
	public UserRepository createUser() {
		return new UserRepositoryImpl();
	}
}