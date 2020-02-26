import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Jeu {

	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	private ArrayList<Carte> cartes = new ArrayList<Carte>(); 
	private ArrayList<Case> cases = new ArrayList<Case>();
	private ArrayList<Bonus> carteschance = new ArrayList<Bonus>(); 
	private ArrayList<Bonus> cartescdc = new ArrayList<Bonus>();
	final private int joueurcourant = 0;

	public Jeu() throws Exception {

		File file = new File("/Users/lucadeslot/eclipse-workspace/Monopoly/src/Propriétés.txt"); 				  
		BufferedReader br = new BufferedReader(new FileReader(file)); 			  
		String nom; // nom proprio

		for (int i = 0; i < 40; i++) {

			if(i == 7 || i == 22 || i == 33) {
				int x = 0;
				int y = 0;
				switch (i) {
				case 7:
					x = 0;
					y = 7;
					break; 
				case 22:
					x=2;
					y=10;
					break;				
				case 33:
					x=7;
					y=0;
				}
				cases.add(new Case("Chance", x, y)); 	
			} else if (i == 2 || i == 17 || i == 36) {
				int x = 0;
				int y = 0;
				
				switch (i) {
				case 2:
					x = 0;
					y = 2;
					break;
				
				case 17:
					x = 7;
					y = 10;
					break;
					
				case 36:
					x = 4; 
					y = 0;
				}
				cases.add(new Case("Caisse de communauté", x, y));
	
			} else if (i == 0) {
				cases.add(new Case("Case départ", 0, 0));
			} else if (i == 10) {
				cases.add(new Case("Prison", 0, 10));
			} else if (i == 20) {
				cases.add(new Case("Parc Gratuit", 10, 10));
			} else if (i == 4) {
				cases.add(new Impôt("Impôts sur le revenu", 0, 4, Action.PAYER, 200)); 
			} else if (i == 38) {
				cases.add(new Impôt("Taxe de luxe", 2, 0, Action.PAYER, 100));
			} else if (i == 30) {
				cases.add(new Case("Aller en prison", 10, 0));
			} else{
				
				nom = br.readLine();
				int prix = Integer.valueOf(br.readLine());
	
					int x = 0; 
					int y = 0; 
				if (i == 5 || i == 12 || i == 15 || i == 25 || i == 28 || i == 35) {
					
					switch (i) {
					case 5:
						x = 0; 
						y = 5;
						break;
					case 12:
						x = 2;
						y = 10;
						break;
					case 15:
						x = 5; 
						y = 10;
						break;
					case 25:
						x = 10;
						y = 5;
						break;
					case 28:
						x = 10;
						y = 2; 
						break;
					case 35:
						x = 5;
						y = 0;
						break;
					}
					
					cases.add(new Service(nom, x, y, prix));
					cartes.add(new Carte(nom, prix,(prix/2)));
					br.readLine();
				} else {
					Couleur c = Couleur.valueOf(br.readLine());
					cases.add(new Constructible(nom, x, y, c, prix));
					cartes.add(new Propriété(nom, prix, c, (prix/2)));
				}
			
				br.readLine();
			}
			
		}


		
	}

	public void creerJoueur(String nom) {
		Joueur j = new Joueur(nom);
		joueurs.add(j);
		System.out.println("Joueur "+j.getNom()+" ajouté");
	}
	
	public void commencerPartie() {
		Collections.shuffle(cartes);
		Collections.shuffle(joueurs);
		System.out.println("Après tirage au sort "+joueurs.get(joueurcourant).getNom()+" va commencer");
		boolean finPartie = false;
		while (!finPartie) {
			//joueurs.ge
		}
	}
	

	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueur(ArrayList<Joueur> joueur) {
		this.joueurs = joueur;
	}

	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public ArrayList<Case> getCases() {
		return cases;
	}

	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}
	
	
}
