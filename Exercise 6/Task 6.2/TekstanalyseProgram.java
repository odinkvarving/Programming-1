import java.util.*;

class TekstanalyseProgram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println(" Hvilken tekst vil du undersøke? ");

		String tekst = in.nextLine();

		System.out.println(" Hvilken bokstav vil du sjekke forekomsten av? ");

		String bokstav = in.next();

		String resultat = "";

		Tekstanalyse Teksten = new Tekstanalyse(tekst);

		boolean loop = true;

		while(loop = true){

			System.out.println(" Antall forskjellige bokstaver i teksten er: " + Teksten.getAntallForskjelligeBokstaver());
			System.out.println("\n Totalt antall bokstaver i teksten er: " + Teksten.getTotalAntallBokstaver());
			System.out.println("\n Antall ikke-bokstaver utgjør " + Teksten.getAntallIkkeBokstaver() + " prosent av teksten. ");
			System.out.println("\n Antall av bokstaven " + bokstav + " som forekommer i teksten er: " + Teksten.forekomstAvBokstav(bokstav));

				int[] max = Teksten.flestAntallGanger(tekst);  // Initierer en ny tabell 'max' som er lik tabellen 'out'

					for(int i : max){           // For hver int 'i' i tabellen 'max'

						String[] alfabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å", "0"};

						System.out.println("\n Bokstaven som forekommer flest ganger er: " + alfabet[i]);
					}
			break;
		}
	}
}


