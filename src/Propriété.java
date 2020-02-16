
public class Propriété extends Carte {
	
	private int maison;
	private boolean hotel;
	private Couleur couleur;
 
	public Propriété(String nom, int prix,  Couleur couleur, int prixHypotheque) {
		super(nom, prix, prixHypotheque);
		this.maison = maison; 
		this.hotel = hotel; 
		this.couleur = couleur;
		// TODO Auto-generated constructor stub
	}

	public int getMaison() {
		return maison;
	}

	public void setMaison(int maison) {
		this.maison = maison;
	}

	public boolean isHotel() {
		return hotel;
	}

	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	
	
}
