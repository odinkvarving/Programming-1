import java.util.*;

class TerningspillProgram {
	public static void main(String [] args){

		TerningSpill SpillerA = new TerningSpill("Spiller A");
		TerningSpill SpillerB = new TerningSpill("Spiller B");

		boolean spill = true;
		int antall = 1;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Runde nr: " + antall++);
			int poengsum = SpillerA.getSumpoeng();
			int sisteTerning = SpillerA.getSisteTerning();
			System.out.println("Spiller A kastet terning " + sisteTerning + " Poengsummen er nå: " + poengsum);

			int poengsum2 = SpillerB.getSumpoeng();
			int sisteTerning2 = SpillerB.getSisteTerning();
			System.out.println("Spiller B kastet terning " + sisteTerning2 + " Poengsummen er nå: " + poengsum2);

		if(SpillerA.erFerdig()){
			System.out.println(" Gratulerer Spiller A! Du vant! ");
			break;
		}

		if(SpillerB.erFerdig()){
			System.out.println(" Gratulerer Spiller B! Du vant! ");
			break;
		}

		}while(spill);
	}
}




