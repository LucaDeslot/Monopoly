import java.util.ArrayList;
import java.util.Scanner;

import com.exceptions.NombreJoueurException;

public class Main {

	public static void main(String[] args) throws Exception, NombreJoueurException {

		Plateau p = new Plateau();
		boolean menu = true;
		// TODO Auto-generated method stub

		System.out.println("---------------------------- Monopoly v1 -----------------------------");

		ArrayList<Case> c = new ArrayList<Case>();
		c = p.getCases();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i).getNom());
		}

		while(menu) { // boucle du menu
			System.out.println("Nombre de joueur ? ");
			Scanner sc = new Scanner(System.in);
			try {		
				int nbjoueur = sc.nextInt();
				if (nbjoueur > 0 && nbjoueur<9) {
					menu = false; // on peut sortir du menu

					for (int i = 0; i < nbjoueur ; i++) { // création des joueurs
						System.out.println("Nom joueur "+(i+1)+ " ?");
						p.creerJoueur((new Scanner(System.in)).next()); 
					}

				} else {
					throw new NombreJoueurException("Veuillez rentrer un chiffre entre 1 et 8 compris");
				}
			} 

			catch (NombreJoueurException e) {
				System.out.println("Veuillez rentrer un chiffre entre 1 et 8 compris");
				System.out.println("Réessayer ? (O/N) ");
				if((new Scanner(System.in).next()).toLowerCase().charAt(0) == 'n') {
					menu = false;
				}
			}

			catch (Exception e) {
				// TODO: handle exception

				System.out.println(" Veuillez rentrer un chiffre");
			} 

			for (int i = 0; i < p.getJoueurs().size(); i++) {
				System.out.println("Nom joueur "+(i+1)+" = "+p.getJoueurs().get(i).getNom());
			}

		}
	}
}
