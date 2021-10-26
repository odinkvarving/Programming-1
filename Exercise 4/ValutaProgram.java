import static javax.swing.JOptionPane.*;
class ValutaProgram {
	public static void main(String[] args){

		boolean aktiv = true;

		do {
			String inndata1 = showInputDialog(" Velkommen til Valutakonvertøren! \n Velg en valuta: \n1) Euro \n2) Dollar \n3) Svenske Kroner \n4) Avslutt ");
			int valg = Integer.parseInt(inndata1);

			Valuta valutaEUR = new Valuta(9.99198833, 0);
			Valuta valutaUSD = new Valuta(9.00187239, 0);
			Valuta valutaSEK = new Valuta(0.93014547, 0);


			boolean pass = true;

			if(pass){

				double resultat = 0;
				double antall = 0;
			int tilfra = 0;
			String inndata2;
			String inndata3;

				switch(valg){


					case 1:
				showMessageDialog(null, " Du har valgt valutaen: Euro ");
				inndata2 = showInputDialog(" Hvor mye vil du konvertere? ");
				inndata3 = showInputDialog(" Vil du regne til eller fra norske kroner? 1) Til 2) Fra ");
				antall = Double.parseDouble(inndata2);
				tilfra = Integer.parseInt(inndata3);
				if(tilfra == 1){
					resultat = valutaEUR.regnOmTilNok(antall);
				}
				else if(tilfra == 2){
					resultat = valutaEUR.regnOmFraNok(antall);
				}
				else break;
				showMessageDialog(null, + antall + " Euro tilsvarer " + resultat + " NOK. ");
				break;

			case 2:
				showMessageDialog(null, " Du har valgt valutaen: Dollar ");
				inndata2 = showInputDialog(" Hvor mye vil du konvertere? ");
				inndata3 = showInputDialog(" Vil du regne til eller fra norske kroner? 1) Til 2) Fra ");
				antall = Double.parseDouble(inndata2);
				tilfra = Integer.parseInt(inndata3);
				if(tilfra == 1){
					resultat = valutaUSD.regnOmTilNok(antall);
				}
				else if(tilfra == 2){
					resultat = valutaUSD.regnOmFraNok(antall);
				}
				showMessageDialog(null, + antall + " Dollar tilsvarer " + resultat + " NOK. ");
				break;

			case 3:
				showMessageDialog(null, " Du har valgt valutaen: Svenske Kroner ");
				inndata2 = showInputDialog(" Hvor mye vil du konvertere? ");
				inndata3 = showInputDialog(" Vil du regne til eller fra norske kroner? 1) Til 2) Fra ");
				antall = Double.parseDouble(inndata2);
				tilfra = Integer.parseInt(inndata3);
				if(tilfra == 1){
					resultat = valutaSEK.regnOmTilNok(antall);
				}
				else if(tilfra == 2){
					resultat = valutaSEK.regnOmTilNok(antall);
				}
				showMessageDialog(null, + antall + " Svenske Kroner tilsvarer " + resultat + " NOK. ");
				break;
			case 4:
				showMessageDialog(null, " Avslutter! ");
				aktiv = false;
				pass = false;
				break;

			default:
				showMessageDialog(null, " Ugyldig menyvalg! ");
				pass = false;
				break;

			}
		}
	}while(aktiv);
  }
}
