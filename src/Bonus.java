import java.util.Random;

public class Bonus {
	
	private String description; 
	private int somme;
	private int sommeMaison;
	private int sommeHotel;
	private Joueur joueur;
	
	public Bonus(Joueur j) {
		// TODO Auto-generated constructor stub
		description = "";
		somme = 0;
		joueur = j;
	}

	public void piocherCC() {

		Random r = new Random();

		switch (r.nextInt(16)){
			case 0 :
				this.description = "Allez en prison";
				joueur.setPostion(10);
				break;

			case 1 :
				this.description = "Allez à la case départ";
				joueur.setPostion(0);
				break;

			case 2 :
				this.description = "Allez Boulevard de la Villette";
				joueur.setPostion(11);
				break;

			case 3 :
				this.description = "Amende pour ivresse sur la voie publique, vous devez payer 2000";
				this.somme = -2000;
				joueur.addArgent(somme);
				break;

			case 4 :
				this.description = "Vous avez gagné au mots croisés, vous recevez 10000";
				this.somme = 10000;
				joueur.addArgent(somme);
				break;

			case 5 :
				this.description = "Allez rue Henry Martin";
				joueur.setPostion(24);
				break;

			case 6 :
				this.description = "Allez gare de Lyon";
				joueur.setPostion(15);
				break;

			case 7 :
				this.description = "Amende pour excès de vitesse vous devez payer 1500";
				this.somme = 2000;
				joueur.addArgent(somme);
				break;

			case 8 :
				this.description = "Payez les frais de scolarités pour 15000";
				this.somme = -15000;
				joueur.addArgent(somme);
				break;

			case 9 :
				this.description = "Reculez de 3 cases";
				joueur.avancer(-3);
				break;

			case 10 :
				this.description = "Vous devez effectuer des réparations dans vos propriérés : 2500/maisons, 10000/hotel";
				joueur.addArgentMaisonHotel(-2500, -10000);
				break;

			case 11 :
				this.description = "Votre prêt bancaire rapporte 15000";
				this.somme = 15000;
				joueur.addArgent(somme);
				break;

			case 12 :
				this.description = "Vous êtes libéré de prison, vous pouvez conserver cette carte au cas où";
				joueur.setSortieprison(true);
				break;

			case 13:
				this.description = "Rdv rue de la paix";
				joueur.setPostion(39);
				break;

			case 14:
				this.description = "Payez les frais de voirie : 4000";
				this.somme = -4000;
				joueur.addArgent(somme);
				break;
		}


	}
	
}
