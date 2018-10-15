
import java.util.Scanner;

public class Velo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Donnez l'heure de dÃ©but de la location (un entier) : ");
		int debut = clavier.nextInt();
		System.out.print("Donnez l'heure de fin de la location (un entier) : ");
		int fin = clavier.nextInt();

		/*******************************************
		 * Completez le programme a partir d'ici.
		 *******************************************/
					/**********Début  initialisation des variables***************/	
		
		int horaireDebut=0, horaireFin=0, tarifHoraireNuit = 0, tarifHoraireJour = 0, totalHeureLocation = 0, totalHeureJour=0, totalHeureNuit=0, tarif;
		 String groupe1="", groupe2="", groupe3="", groupeA="", groupeB="", groupeC="";
		 
					/**********Fin  initialisation des variables***************/
		 
//****** Début Vérification que la plage horaire de location est bien respecté********
		 
		if ((debut < 0) || (fin > 24)) {
			System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
		} else if (debut > fin) {
			System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
		} else if (debut == fin) {
			System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
		}else {
			 horaireDebut=debut;
			 horaireFin=fin;
		}
		
//******Fin Vérification que la plage horaire de location est bien respecté********

//******Début classification de l'heure de Début**********************
		
		if(horaireDebut < 7) {
			groupeA="a";
			}else if (horaireDebut < 17) {
			groupeB="b";
		}else if (horaireDebut >= 17) {
			groupeC="c";
		}
			
//******Fin classification de l'heure de Début**********************
	
//******Début classification de l'heure de Fin*****************
		
		if(horaireFin < 7) {
			groupe1="a";
			}else if (horaireFin < 17) {
				if(groupeA == "a") {
					groupe2="a";
				}else if(groupeB == "b") {
					groupe2="b";
				}
		}else if (horaireFin >= 17) {
			if(groupeA == "a") {
				groupe3="a";
			}else if(groupeB == "b") {
					groupe3="b";
				}else if(groupeC =="c") {
					groupe3="c";
				}
			}
			
//**********Début calcule horaire groupeA************************
			
			if((groupeA =="a") && (groupe1=="a")) {
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureNuit=totalHeureLocation;
				tarifHoraireJour=totalHeureJour;
				tarifHoraireNuit=totalHeureNuit;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}else if((groupeA =="a") && (groupe2 =="a")) {
				totalHeureJour=horaireFin-7;
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureNuit=totalHeureLocation-totalHeureJour;
				tarifHoraireJour=totalHeureJour;
				tarifHoraireNuit=totalHeureNuit;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}else if((groupeA =="a") && (groupe3=="a")) {
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureJour=10;
				totalHeureNuit=totalHeureLocation-totalHeureJour;
				tarifHoraireJour=totalHeureJour;
				tarifHoraireNuit=totalHeureNuit;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
//	********Fin calcule horaire groupeA***************
			
	//**********Début calcule horaire groupeB************************
			
			if((groupeB=="b")&& (groupe2=="b")) {
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureJour=totalHeureLocation;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				tarifHoraireJour=totalHeureJour;
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}else if((groupeB=="b") && (groupe3=="b")) {
				totalHeureJour=17-horaireDebut;
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureNuit=totalHeureLocation-totalHeureJour;
				tarifHoraireJour=totalHeureJour;
				tarifHoraireNuit=totalHeureNuit;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureJour + " heure(s) au tarif horaire de 2.0 franc(s)");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
	//**********Fin calcule horaire groupeB************************
			
	//**********Début calcule horaire groupeC************************
			
			 if((groupeC=="c") && (groupe3=="c")) {
				totalHeureLocation=horaireFin-horaireDebut;
				totalHeureNuit=totalHeureLocation;
				tarifHoraireNuit=totalHeureNuit;
				System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
				System.out.println(totalHeureNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
				tarif=(tarifHoraireNuit*1)+(tarifHoraireJour*2);
				System.out.print("Le montant total Ã  payer est de ");
				System.out.print(tarif);
				System.out.println(" franc(s).");
			}
	//**********Fin calcule horaire groupeC************************
    
		/*******************************************
		 * Ne rien modifier apres cette ligne.
		 *******************************************/

		clavier.close();
	}
}