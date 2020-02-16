import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Plateau {
	
	ArrayList<Joueur> joueur = new ArrayList<Joueur>();
	ArrayList<Carte> cartes;
	ArrayList<Case> cases = new ArrayList<Case>();
	
	public Plateau() throws Exception {
		
		for (int i = 0; i < 40; i++) {
			
			if(i == 7 || i == 22 || i == 33) {
				cases.add(new Case("Chance", TypeCase.Bonus)); 
			} else if (i == 2 || i == 17 || i == 17) {
				cases.add(new Case("Caisse de communauté", TypeCase.Bonus));
			} else if (i == 0) {
				cases.add(new Case("Case départ", TypeCase.Action));
			} else if (i == 10) {
				cases.add(new Case("Prison", TypeCase.Neutre));
			} else if (i == 20) {
				cases.add(new Case("Parc Gratuit", TypeCase.Neutre));
			} else {
				
				  File file = new File("/Users/lucadeslot/eclipse-workspace/Monopoly/src/Propriétés.txt"); 				  
				  BufferedReader br = new BufferedReader(new FileReader(file)); 			  
				  String st; 
				  while ((st = br.readLine()).charAt(0) != '.' && st != null) {
					  cases.add(new Case(st, TypeCase.Propriété));
					  br.readLine(); 
					  br.readLine();
				  } 
				 
			}
			
		}
		
	}
	
	public void creerJoueur(String nom) {
		Joueur j = new Joueur(nom);
		joueur.add(j);
		System.out.println("Joueur "+j.getNom()+" ajouté");
	}

	public ArrayList<Joueur> getJoueurs() {
		return joueur;
	}

	public void setJoueur(ArrayList<Joueur> joueur) {
		this.joueur = joueur;
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
