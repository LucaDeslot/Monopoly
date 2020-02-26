import java.util.ArrayList;

public class Joueur {
	
	private String nom; 
	private int argent;
	private ArrayList<Carte> cartes; 
	private int postion;
	private boolean sortieprison;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.argent = 100000;
		this.postion = 0;
		sortieprison = false;
	}

	public void addArgent(int somme) {
		argent = argent + somme;
	}

	public void avancer (int val) {
		postion = postion + val;
	}

	public void addArgentMaisonHotel(int prixmaison, int prixhotel){

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

	public void setPostion(int x) {
		this.postion = x;
	}



	public void setSortieprison(boolean value){ this.sortieprison = value; }
 
}
