
public class Carte {
	
	private String nom;
	private int prix;
	private int prixHypotheque;
	
	public Carte(String nom, int prix, int prixHypotheque) {
		this.nom = nom;
		this.prix = prix;
		this.prixHypotheque = prixHypotheque;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixHypotheque() {
		return prixHypotheque;
	}

	public void setPrixHypotheque(int prixHypotheque) {
		this.prixHypotheque = prixHypotheque;
	}

	

}
