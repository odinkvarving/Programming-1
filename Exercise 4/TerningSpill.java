import java.util.Random.*;

class TerningSpill {
	private String terning;
	private int sumpoeng;
	private int sisteTerning;

	public TerningSpill(String terningNavn, int sumPoeng, int SisteTerning){
		terning = terningNavn;
		sumpoeng = sumPoeng;
		sisteTerning = SisteTerning;
	}

	public TerningSpill(String terningNavn){
		terning = terningNavn;
		sumpoeng = 0;
		sisteTerning = 0;
	}

	public int getSumpoeng(){
		java.util.Random terning = new java.util.Random();
		int terningkast = terning.nextInt(6) + 1;
		kastTerningen(terningkast);
		return sumpoeng;
	}

	public int kastTerningen(int kast){
		if(kast == 1){
			this.sumpoeng = 0;
		}
		else {
			this.sumpoeng = sumpoeng + kast;
		}
		if (sumpoeng > 100){
			this.sumpoeng = sumpoeng - kast;
		}
		sisteTerning = kast;
		return sumpoeng;
	}
	public int getSisteTerning(){
		return sisteTerning;
	}
	public boolean erFerdig(){
		if(sumpoeng == 100){

			return true;
		}
		else {
			return false;
		}
	}
}
