import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Plateau {

	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	private ArrayList<Carte> cartes = new ArrayList<Carte>(); 
	private ArrayList<Case> cases = new ArrayList<Case>();
	final private int joueurcourant = 0;

	public Plateau() throws Exception {

		File file = new File("/Users/lucadeslot/eclipse-workspace/Monopoly/src/Propriétés.txt"); 				  
		BufferedReader br = new BufferedReader(new FileReader(file)); 			  
		String nom; // nom proprio

		for (int i = 0; i < 40; i++) {

			if(i == 7 || i == 22 || i == 33) {
				cases.add(new Case("Chance", TypeCase.Bonus));
			} else if (i == 2 || i == 17 || i == 36) {
				cases.add(new Case("Caisse de communauté", TypeCase.Bonus));
			} else if (i == 0) {
				cases.add(new Case("Case départ", TypeCase.Action));
			} else if (i == 10) {
				cases.add(new Case("Prison", TypeCase.Neutre));
			} else if (i == 20) {
				cases.add(new Case("Parc Gratuit", TypeCase.Neutre));
			} else if (i == 4) {
				cases.add(new Case("Impôts sur le revenu", TypeCase.Action)); 
			} else if (i == 38) {
				cases.add(new Case("Taxe de luxe", TypeCase.Action));
			} else if (i == 30) {
				cases.add(new Case("Aller en prison", TypeCase.Action));
			} else{
				nom = br.readLine();
				int prix = Integer.valueOf(br.readLine());
				try {
				cases.add(new Case(nom, TypeCase.Propriété));
				cartes.add(new Propriété(nom, prix, Couleur.valueOf(br.readLine()), (prix/2)));
				
				} catch (IllegalArgumentException e) {
					cartes.add(new Carte(nom, prix, (prix/2)));
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
			joueurs.ge
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
