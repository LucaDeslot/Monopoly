import java.util.ArrayList;

public class Joueur {
	
	private String nom; 
	private int argent;
	private ArrayList<Carte> cartes; 
	private int postion;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.argent = 1500;
		this.postion = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public int getPostion() {
		return postion;
	}

	public void setPostion(int postion) {
		this.postion = postion;
	}
 
}
