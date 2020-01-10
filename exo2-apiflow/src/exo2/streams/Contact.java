package exo2.streams;

public class Contact {
	
	protected Integer id;
	protected String name;
	protected String prenom;
	
	public Contact(Integer id, String name, String prenom) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
