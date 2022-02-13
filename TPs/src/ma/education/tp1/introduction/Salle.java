package ma.education.tp1.introduction;

public class Salle {
	 public long id;
	 public String nom;
	
	Salle(){
	};
	
	Salle(String nom){
		this.nom = nom;
	};
	
	Salle(long id, String nom){
		super();
		this.id = id;
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
