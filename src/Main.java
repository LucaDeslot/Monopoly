import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Plateau p = new Plateau();
		boolean menu = true;
		// TODO Auto-generated method stub

		System.out.println("------------------- Monopoly v1 -------------------");

		ArrayList<Case> c = new ArrayList<Case>();
		c = p.getCases();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i).getNom());
		}

		while(menu) {
			System.out.println("Nombre de joueur ? ");
			Scanner sc = new Scanner(System.in);
			try {		
				int nbjoueur = sc.nextInt();
				if (nbjoueur > 0 && nbjoueur<9) {
					menu = false;
					
					for (int i = 0; i < nbjoueur ; i++) {
						System.out.println("Nom joueur "+(i+1)+ " ?");
						p.creerJoueur((new Scanner(System.in)).next()); 
					}

				} else {
					System.out.println("Veuillez rentrer un chiffre entre 1 et 8 compris");
					System.out.println("Réessayer ? (O/N)  ");
					if((new Scanner(System.in).next()).toLowerCase() == "N".toLowerCase()) {
						menu = false;
					}

				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" Veuillez rentrer un chiffre");
			}

			for (int i = 0; i < p.getJoueurs().size(); i++) {
				System.out.println("Nom joueur "+(i+1)+" = "+p.getJoueurs().get(i).getNom());
			}

		}
	}
}
