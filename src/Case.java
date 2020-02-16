
public class Case {

	private String nom;
	private TypeCase type;
	
	public Case(String nom, TypeCase type) {
		this.nom = nom; 
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeCase getType() {
		return type;
	}

	public void setType(TypeCase type) {
		this.type = type;
	}
	
}
