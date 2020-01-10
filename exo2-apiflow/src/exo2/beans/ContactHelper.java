package exo2.beans;

import java.util.List;

import exo2.streams.Contact;

public interface ContactHelper {
	
	public static List<Contact> getContacts() {
		return List.of(
				new Contact(1, "Arthur", "Arthur"),
				new Contact(2, "Arthur", "Laurent"),
				new Contact(3, "Arthur", "Alain"),
				new Contact(4, "Arthur", "Bernard"),
				new Contact(5, "Arthur", "Alice"),
				new Contact(6, "Arthur", "Marie"),
				new Contact(7, "Arthur", "Juliette"));
	}
}
