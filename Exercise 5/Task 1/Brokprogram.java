import java.util.*;

class Brokprogram {

	public static void main(String[] args){

	Scanner in = new Scanner (System.in);
	System.out.println(" Hvilke broker vil du regne med? (Skriv inn 4 tall med mellomrom)");

	int teller = in.nextInt();
	int nevner = in.nextInt();

	int teller2 = in.nextInt();
	int nevner2 = in.nextInt();

	Brok br�k1 = new Brok(teller, nevner);
	Brok br�k2 = new Brok(teller2, nevner2);

	System.out.println(" Du har valgt: " + (teller + "/" + nevner) + " og " + (teller2 + "/" + nevner2));

	System.out.println(" Vil du: 1) Multiplisere 2) Dividere 3) Addere 4) Subtrahere ?");

	int valg = in.nextInt();


		switch(valg){

		case 1:

			br�k1.multiplikasjon(br�k2);
			System.out.println(" Vi multipliserer de to brokene og f�r: " + br�k1.getTeller() + "/" + br�k1.getNevner());
			break;

		case 2:

			br�k1.divisjon(br�k2);
			System.out.println(" Vi dividerer de to brokene og f�r: " + br�k1.getTeller() + "/" + br�k1.getNevner());
			break;

		case 3:

			br�k1.addisjon(br�k2);
			System.out.println(" Vi adderer de to brokene og f�r: " + br�k1.getTeller() + "/" + br�k1.getNevner());
			break;

		case 4:

			br�k1.subtraksjon(br�k2);
			System.out.println(" Vi subtraherer de to brokene og f�r: " + br�k1.getTeller() + "/" + br�k1.getNevner());
			break;
		}
	}
}