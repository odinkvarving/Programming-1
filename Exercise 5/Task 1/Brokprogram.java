import java.util.*;

class Brokprogram {

	public static void main(String[] args){

	Scanner in = new Scanner (System.in);
	System.out.println(" Hvilke broker vil du regne med? (Skriv inn 4 tall med mellomrom)");

	int teller = in.nextInt();
	int nevner = in.nextInt();

	int teller2 = in.nextInt();
	int nevner2 = in.nextInt();

	Brok brøk1 = new Brok(teller, nevner);
	Brok brøk2 = new Brok(teller2, nevner2);

	System.out.println(" Du har valgt: " + (teller + "/" + nevner) + " og " + (teller2 + "/" + nevner2));

	System.out.println(" Vil du: 1) Multiplisere 2) Dividere 3) Addere 4) Subtrahere ?");

	int valg = in.nextInt();


		switch(valg){

		case 1:

			brøk1.multiplikasjon(brøk2);
			System.out.println(" Vi multipliserer de to brokene og får: " + brøk1.getTeller() + "/" + brøk1.getNevner());
			break;

		case 2:

			brøk1.divisjon(brøk2);
			System.out.println(" Vi dividerer de to brokene og får: " + brøk1.getTeller() + "/" + brøk1.getNevner());
			break;

		case 3:

			brøk1.addisjon(brøk2);
			System.out.println(" Vi adderer de to brokene og får: " + brøk1.getTeller() + "/" + brøk1.getNevner());
			break;

		case 4:

			brøk1.subtraksjon(brøk2);
			System.out.println(" Vi subtraherer de to brokene og får: " + brøk1.getTeller() + "/" + brøk1.getNevner());
			break;
		}
	}
}