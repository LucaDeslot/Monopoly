
public class Case {

	private String nom;
	private int posX;
	private int posY; 
	
	public Case(String nom, int x, int y) {
		this.nom = nom; 
		posX = x; 
		posY = y;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
