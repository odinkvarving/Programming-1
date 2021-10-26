import java.util.Random;
public class Temperaturer {

	private String m�nedsnavn = "Januar";

	private int antallDager;

	private int antallTimer;

	private int[][] temperatur;

	private int[] MiddeltemperaturPerDag;

	private int[] MiddeltemperaturPerTime;

	private int[] MiddeltemperaturHeleM�neden;

	private int[] forskjelligeD�gn;

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

		MiddeltemperaturPerDag = new int[antallDager];       		 // Lager en ny tabell MiddeltemperaturPerDag med like mange indekser som det er dager i m�neden.

		for(int i = 0; i < antallDager; i++){
			for(int j = 0; j < antallTimer; j++){

				MiddeltemperaturPerDag[i] += temperatur[i][j];		 // MiddeltemperaturPerDag p� en gitt dag 'i' + temperaturen p� den samme dagen 'i' i timen 'j'
			}
				MiddeltemperaturPerDag[i] /= antallTimer;    		 // Temperaturen p� dag 'i' delt p� antall timer i det d�gnet
		}
	return MiddeltemperaturPerDag;
	}

	public int[] getMiddeltemperaturPerTime(){

		MiddeltemperaturPerTime = new int[antallTimer];				// Lager en ny tabell MiddeltemperaturPerTime med like mange indekser som det er timer i d�gnet.

		for(int i = 0; i < antallTimer; i++){
			for(int j = 0; j < antallDager; j++){

				MiddeltemperaturPerTime[i] += temperatur[j][i];
			}
				MiddeltemperaturPerTime[i] /= antallDager;
		}
	return MiddeltemperaturPerTime;
	}

	public int getMiddeltemperaturHeleM�neden(){

		int MiddeltemperaturHeleM�neden = 0;

		for(int i = 0; i < MiddeltemperaturPerDag.length; i++){

			MiddeltemperaturHeleM�neden += MiddeltemperaturPerDag[i];
		}
	return MiddeltemperaturHeleM�neden / antallDager;
	}
	public int[] getAntallD�gnMedMiddeltemperatur(){

		int[] forskjelligeD�gn = new int[5];

		for(int i = 0; i < antallDager; i++){

		if(MiddeltemperaturPerDag[i] < (-5)){
			forskjelligeD�gn[0]++;
		}
			else if(MiddeltemperaturPerDag[i] > (-5) && MiddeltemperaturPerDag[i] < 0){
				forskjelligeD�gn[1]++;
			}
			else if(MiddeltemperaturPerDag[i] > 0 && MiddeltemperaturPerDag[i] < 5){
				forskjelligeD�gn[2]++;
			}
			else if(MiddeltemperaturPerDag[i] > 5 && MiddeltemperaturPerDag[i] < 10){
				forskjelligeD�gn[3]++;
			}
			else if(MiddeltemperaturPerDag[i] > 10){
				forskjelligeD�gn[4]++;
			}
		}
		return forskjelligeD�gn;
	}

}

// gjerne skriv denne p� nytt med en ny todimensjonal tabell int[][] som gir oss temperatur (i en gitt time p� en gitt dag)