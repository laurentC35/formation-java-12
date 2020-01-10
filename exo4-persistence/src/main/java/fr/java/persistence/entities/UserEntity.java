package fr.java.persistence.entities;

public class UserEntity {
	private String firstName;
	private String lastName;

	public UserEntity(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}