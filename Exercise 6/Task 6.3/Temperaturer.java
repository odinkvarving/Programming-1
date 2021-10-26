import java.util.Random;
public class Temperaturer {

	private String månedsnavn = "Januar";

	private int antallDager;

	private int antallTimer;

	private int[][] temperatur;

	private int[] MiddeltemperaturPerDag;

	private int[] MiddeltemperaturPerTime;

	private int[] MiddeltemperaturHeleMåneden;

	private int[] forskjelligeDøgn;

	public  Temperaturer(int antallDager, int antallTimer){

		this.antallDager = antallDager;
		this.antallTimer = antallTimer;
		this.temperatur = new int[antallDager][antallTimer];

		Random temperaturer = new Random();

		for(int i = 0; i < antallDager; i++){
			for(int j = 0; j < antallTimer; j++){

				this.temperatur[i][j] = temperaturer.nextInt(30 + 10) - 10;
			}
		}
	}

	public int[] getMiddeltemperaturPerDag(){

		MiddeltemperaturPerDag = new int[antallDager];       		 // Lager en ny tabell MiddeltemperaturPerDag med like mange indekser som det er dager i måneden.

		for(int i = 0; i < antallDager; i++){
			for(int j = 0; j < antallTimer; j++){

				MiddeltemperaturPerDag[i] += temperatur[i][j];		 // MiddeltemperaturPerDag på en gitt dag 'i' + temperaturen på den samme dagen 'i' i timen 'j'
			}
				MiddeltemperaturPerDag[i] /= antallTimer;    		 // Temperaturen på dag 'i' delt på antall timer i det døgnet
		}
	return MiddeltemperaturPerDag;
	}

	public int[] getMiddeltemperaturPerTime(){

		MiddeltemperaturPerTime = new int[antallTimer];				// Lager en ny tabell MiddeltemperaturPerTime med like mange indekser som det er timer i døgnet.

		for(int i = 0; i < antallTimer; i++){
			for(int j = 0; j < antallDager; j++){

				MiddeltemperaturPerTime[i] += temperatur[j][i];
			}
				MiddeltemperaturPerTime[i] /= antallDager;
		}
	return MiddeltemperaturPerTime;
	}

	public int getMiddeltemperaturHeleMåneden(){

		int MiddeltemperaturHeleMåneden = 0;

		for(int i = 0; i < MiddeltemperaturPerDag.length; i++){

			MiddeltemperaturHeleMåneden += MiddeltemperaturPerDag[i];
		}
	return MiddeltemperaturHeleMåneden / antallDager;
	}
	public int[] getAntallDøgnMedMiddeltemperatur(){

		int[] forskjelligeDøgn = new int[5];

		for(int i = 0; i < antallDager; i++){

		if(MiddeltemperaturPerDag[i] < (-5)){
			forskjelligeDøgn[0]++;
		}
			else if(MiddeltemperaturPerDag[i] > (-5) && MiddeltemperaturPerDag[i] < 0){
				forskjelligeDøgn[1]++;
			}
			else if(MiddeltemperaturPerDag[i] > 0 && MiddeltemperaturPerDag[i] < 5){
				forskjelligeDøgn[2]++;
			}
			else if(MiddeltemperaturPerDag[i] > 5 && MiddeltemperaturPerDag[i] < 10){
				forskjelligeDøgn[3]++;
			}
			else if(MiddeltemperaturPerDag[i] > 10){
				forskjelligeDøgn[4]++;
			}
		}
		return forskjelligeDøgn;
	}

}

// gjerne skriv denne på nytt med en ny todimensjonal tabell int[][] som gir oss temperatur (i en gitt time på en gitt dag)