import java.util.*;

class TemperaturerProgram {

	public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	String m�ned = "Mars";
	int antallDager = 31;
	int antallTimer = 24;
	int counter = 0;
	int teller = 0;

	Temperaturer temperatur = new Temperaturer(31, 24);

	boolean kj�r = true;

		while(kj�r = true){

			System.out.println(" M�neden vi skal ta for oss er: " + m�ned);

			int tempdag[] = temperatur.getMiddeltemperaturPerDag();

			for(int i : tempdag){
				counter++;
				System.out.println("\nMiddeltemperaturen den " + counter + " Mars var: " + tempdag[i]);
			}

			int temptime[] = temperatur.getMiddeltemperaturPerTime();

			for(int i : temptime){
				teller++;
				System.out.println("\nMiddeltemperaturen den " + teller + " timen var: " + temptime[i]);
			}

			int tempm�ned = temperatur.getMiddeltemperaturHeleM�neden();
				System.out.println("\nMiddeltemperaturen i Mars var: " + tempm�ned);


			int temprekkevidder[] = temperatur.getAntallD�gnMedMiddeltemperatur();

				System.out.println("\nAntall d�gn med temperatur mindre enn -5 grader er: " + temprekkevidder[0]);
				System.out.println("\nAntall d�gn med temperatur mellom -5 og 0 grader er: " + temprekkevidder[1]);
				System.out.println("\nAntall d�gn med temperatur mellom 0 og 5 grader er: " + temprekkevidder[2]);
				System.out.println("\nAntall d�gn med temperatur mellom 5 og 10 grader er: " + temprekkevidder[3]);
				System.out.println("\nAntall d�gn med temperatur mer enn 10 grader er: " + temprekkevidder[4]);

			break;
		}
	}
}