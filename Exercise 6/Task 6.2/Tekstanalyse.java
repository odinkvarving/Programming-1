class Tekstanalyse {

	private String tekst = "";
	private String bokstav;
	int [] antallTegn = new int[30];


	public Tekstanalyse(String tekst){

	this.tekst = tekst;

		for(int i = 0; i < tekst.length(); i++){    //en variabel i som �ker med 1 helt frem til lengden p� teksten. Hvis teksten inneholder 15 verdier, g�r i fra 0-15.

			int bokstav = tekst.charAt(i);        //Setter en variabel 'bokstav' for hver bokstav 'i' finner i teksten.

			if(bokstav > 64 && bokstav < 91){
				this.antallTegn[bokstav - 65]++;      // 65 = DESIMAL-verdi for 'A' -> legger til 1 p� indeksen [0-25] til tabellen AntallTegn
			}
			else if(bokstav > 96 && bokstav < 123){
				this.antallTegn[bokstav - 97]++;     //  97 = DESIMAL-verdi for 'a' -> legger til 1 p� indeksen [0-25] til tabellen AntallTegn
			}
			else if(bokstav == 8216 || bokstav == '�'){    // '�' og '�' har samme DESIMAL-verdi som '[' og '{' -> vi m� derfor spesifisere at charAt m� v�re '�' eller '�'
				this.antallTegn[26]++;
			}
			else if(bokstav == 8250 || bokstav == '�'){
				this.antallTegn[27]++;
			}
			else if(bokstav == 8224 || bokstav == '�'){
				this.antallTegn[28]++;
			}
			else if(bokstav > 31 && bokstav < 65 || bokstav > 90 && bokstav < 97 || bokstav > 122 && bokstav < 127){  // DESIMAL-verdiene mellom 32 og 64, 91 og 96, 123 og 126 refererer til ting som ikke er bokstaver (mellomrom, punktum, komma etc.)
				this.antallTegn[29]++;
			}
		}
	}

		public int getAntallForskjelligeBokstaver(){

		int antallForskjellige = 0;

			for(int i = 0; i < 29; i++){     // 29 er antallet indekser i tabellen antallTegn

				if(antallTegn[i] != 0){        // hvis antallTegn[i] = 0 vil det si at en bokstav ikke har blitt registrert i tabellen. int antallForskjellige �ker alts� bare med 1 for hver bokstav som har blitt telt, og har verdi over 0.
					antallForskjellige++;
				}
			}
		return antallForskjellige;
		}

		public int getTotalAntallBokstaver(){

			int totalBokstaver = 0;

			for(int i = 0; i < 29; i++){        	// 29 er antallet indekser i tabellen antallTegn. totalBokstaver blir da +1 for hver gang antallTegn tar inn en indeks-verdi.

				totalBokstaver = totalBokstaver + antallTegn[i];
			}
				return totalBokstaver;
		}


		public int getAntallIkkeBokstaver(){

			int ikkeBokstav = antallTegn[29];   	// antallTegn[29] representerer indeksen til antallTegn som representerer ikke-bokstaver.

			return (ikkeBokstav / tekst.length())* ikkeBokstav;   // sjekk dette
		}

		public int forekomstAvBokstav(String bokstav){

			int bestemtBokstav = bokstav.charAt(0);       				 //variabelen 'bestemtBokstav' er den f�rste bokstaven i 'String bokstav', alts� den bokstaven vi vil sjekke forekomsten av.

			if(bestemtBokstav >= 65 && bestemtBokstav <= 90){
				return antallTegn[bestemtBokstav - 65];     			// 65 er DESIMAL-verdi for 'A'. Hvis charAt(0) = 'D' (som har DESMIAL-verdi 68) vil bestemtBokstav bli lik 68 - 65 = 3.
			}
			else if(bestemtBokstav >= 97 && bestemtBokstav <= 122){
				return antallTegn[bestemtBokstav - 97];     			// 97 er DESIMAL-verdi for 'a'. Hvis charAt(0) = 'd' (som har DESIMAL-verdi 100) vil bestemtBokstav bli lik 100-97 = 3.
			}
			else if(bestemtBokstav == '�' || bestemtBokstav == '�'){   // 26 er index-verdien for '�' og '�' i tabellen antallTegn. N�r vi skriver return antallTegn[26] f�r vi da hvor mange ganger '�' eller '�' er blitt telt.
				return antallTegn[26];
			}
			else if(bestemtBokstav == '�' || bestemtBokstav == '�'){   // _____"_____
				return antallTegn[27];
			}
			else if(bestemtBokstav == '�' || bestemtBokstav == '�'){   // _____"_____
				return antallTegn[28];
			}
			else{
				return antallTegn[29]; 			// Vi f�r en retur-verdi som er det samme som en spesifikk index-verdi for tabellen antallTegn. Hvis vi f�r antallTegn[3] teller den da hvor mange ganger 'd' eller 'D' kom i teksten.
			}
		}

		public int[] flestAntallGanger(String tekst){

			int flest = antallTegn[0];   		// variabel 'flest' er verdien indeks 0 har i tabellen antallTegn (denne har i utgangspunktet ingen verdi f�r metoden f�r inn en tekst)

			for(int i = 0; i < 29; i++){

				if(antallTegn[i] > flest){  	// hvis en ny indeks f�r st�rre verdi enn indeks 0 blir variabelen 'flest' endret til denne nye verdien.

					flest = antallTegn[i];  	// Dette blir verdien til den st�rste indeksen i tabellen
				}
			}
			int temp [] = new int[29];   		// Initierer en ny tabell med samme antall indekser som v�r opprinnelige tabell
			int counter = 0;					// Initierer en variabel 'counter'
			for(int i = 0; i < 29; i++){		// Lager en for-l�kke som �ker med 1 frem til den n�r verdien av lengden til tabellen 'temp'
				if(antallTegn[i] == flest){		// Hvis verdien for indeksen 'i' er den samme som 'flest'  - blir verdien av temp[counter] den samme som 'i' eks. hvis counter = 3 blir temp[3] lik 'i'
					temp[counter] = i;			// 'i' er den indeksen i tabellen hvor for-l�kka fant en verdi som er den samme som den st�rste indeksen i tabellen
					counter++;					// verdien for 'counter' �ker med 1 for hver gang for-l�kka finner en verdi i antallTegn som er lik den indeksen med st�rst verdi
				}
			}
			int[] out = new int[counter];       // Initierer en ny tabell med samme antall idekser som verdien av 'counter'
			for(int i= 0; i < counter; i++){	// lager en for-l�kke som starter i 0 og g�r frem til verdien av 'counter'
				out[i] = temp[i];				// Verdien tabellen 'out' har i indeks 'i' er lik verdien som tabellen 'temp' har i indeks 'i'
			}
		return out;								// Dette returnerer tabellen 'out', som n� har telt hvor mange ganger max-verdien ble funnet i tabellen, og ved hvilken indeks denne ble funnet
		}
}



