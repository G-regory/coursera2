package test;

import java.util.Scanner;

public class Velo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Donnez l'heure de début de la location (un entier) : ");
		int debut = clavier.nextInt();
		System.out.print("Donnez l'heure de fin de la location (un entier) : ");
		int fin = clavier.nextInt();

		/*******************************************
		 * Completez le programme a partir d'ici.
		 *******************************************/

		/********** Début initialisation des variables ***************/

		int tarifHoraireNuit = 0, tarifHoraireJour = 0, totalHeureLocation = 0,
				totalHeureJour = 0, totalHeureNuit = 0;
		double tarif;
		String groupe1 = "", groupe2 = "", groupe3 = "", groupeA = "", groupeB = "", groupeC = "";
		Boolean controleOk = false;

		/********** Fin initialisation des variables ***************/

//****** Début Vérification que la plage horaire de location est bien respecté********

		if ((debut < 0) || (fin > 24)) {
			System.out.println("Les heures doivent être comprises entre 0 et 24 !");
		} else if (debut > fin) {
			System.out.println("Bizarre, le début de la location est après la fin ...");
		} else if (debut == fin) {
			System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
		} else {
			controleOk = true;
		}

//******Fin Vérification que la plage horaire de location est bien respecté********

		/*********** Contrôle **************/
		if (controleOk) {
			
			//******Début classification de l'heure de Début**********************
			if (debut < 7) {
					groupeA = "a";
			} else if (debut < 17) {
				groupeB = "b";
			} else if (debut >= 17) {
				groupeC = "c";
			}
			//******Fin classification de l'heure de Début**********************
			
			//******Début classification de l'heure de Fin*****************

			if (fin < 7) {
				if (fin < 7) {
						groupe1 = "a";
				} else if (fin < 17) {
					if (groupeA == "a") {
						groupe2 = "a";
					} else if (groupeB == "b") {
						groupe2 = "b";
					}
				} else if (fin >= 17) {
					if (groupeA == "a") {
						groupe3 = "a";
					} else if (groupeB == "b") {
						groupe3 = "b";
					} else if (groupeC == "c") {
						groupe3 = "c";
					}
				}
			}

	//******Fin classification de l'heure de Fin*****************
			
			//**********Début calcule horaire groupeA************************

			if ((groupeA == "a") && (groupe1 == "a")) {
				totalHeureLocation = fin - debut;
				totalHeureNuit = totalHeureLocation;
				tarifHoraireJour = totalHeureJour;
				tarifHoraireNuit = totalHeureNuit;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			} else if ((groupeA == "a") && (groupe2 == "a")) {
				totalHeureJour = fin - 7;
				totalHeureLocation = fin - debut;
				totalHeureNuit = totalHeureLocation - totalHeureJour;
				tarifHoraireJour = totalHeureJour;
				tarifHoraireNuit = totalHeureNuit;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				if (totalHeureJour > 0) {
					System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				}
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			} else if ((groupeA == "a") && (groupe3 == "a")) {
				totalHeureLocation = fin - debut;
				totalHeureJour = 10;
				totalHeureNuit = totalHeureLocation - totalHeureJour;
				tarifHoraireJour = totalHeureJour;
				tarifHoraireNuit = totalHeureNuit;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
//		********Fin calcule horaire groupeA***************

			// **********Début calcule horaire groupeB************************

			if ((groupeB == "b") && (groupe2 == "b")) {
				totalHeureLocation = fin - debut;
				totalHeureJour = totalHeureLocation;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				tarifHoraireJour = totalHeureJour;
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			} else if ((groupeB == "b") && (groupe3 == "b")) {
				totalHeureJour = 17 - debut;
				totalHeureLocation = fin - debut;
				totalHeureNuit = totalHeureLocation - totalHeureJour;
				tarifHoraireJour = totalHeureJour;
				tarifHoraireNuit = totalHeureNuit;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
			// **********Fin calcule horaire groupeB************************

			// **********Début calcule horaire groupeC************************

			if ((groupeC == "c") && (groupe3 == "c")) {
				totalHeureLocation = fin - debut;
				totalHeureNuit = totalHeureLocation;
				tarifHoraireNuit = totalHeureNuit;
				System.out.println("Vous avez loué votre vélo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif = (tarifHoraireNuit * 1) + (tarifHoraireJour * 2);
				System.out.print("Le montant total à  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
			// **********Fin calcule horaire groupeC************************			
		}
		/*******************************************
		 * Ne rien modifier apres cette ligne.
		 *******************************************/

		clavier.close();
	}
}