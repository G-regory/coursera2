package test;

import java.util.Scanner;

public class Champignon {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		/***************Initialisation**************/
		
		boolean foret = false, chapeau = false, anneau = false, lamelle = false;
		
		/***************Initialisation**************/
		
		/****************Choix du champignon à deviner************/
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cÃ¨pe de Bordeaux, coprin chevelu ou agaric jaunissant.");
		/****************Choix du champignon à deviner************/
		
		/************Devine champignon**************/
		System.out.print("Est-ce que votre champignon vit en forÃªt (true : oui, false : non) ? ");
		foret = clavier.nextBoolean();
		if (foret) {
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			chapeau = clavier.nextBoolean();
			} if ((foret==true)&&  (chapeau==true)) {
				System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
				anneau = clavier.nextBoolean();
				if ((((foret==true) && (chapeau==true)) && (anneau==true))) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'amanite tue-mouches");
				} else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le pied bleu");
				}
			} if ((foret == true) && (chapeau != true)) {
				System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				lamelle = clavier.nextBoolean();
				if (lamelle) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("la girolle");
				} else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le cÃ¨pe de Bordeaux");
				}
			} else if (foret != true) {
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			chapeau = clavier.nextBoolean();
			if (chapeau) {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("l'agaric jaunissant");
			} else {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le coprin chevelu");
			}
		}
			
			/************Devine champignon**************/

			
	}
}
