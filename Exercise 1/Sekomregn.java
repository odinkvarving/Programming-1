class Sekomregn {
	public static void main(String[] args){
	double sekunder = 1000;
	double timesek = sekunder * 0.000277777778;
	double minuttsek = sekunder * 0.0166666667;
	double tidtot = timesek + minuttsek + sekunder;
	System.out.println(+ sekunder + " sekunder tilsvarer " + timesek + " timer og " + minuttsek + " minutter og " + sekunder + " sekunder ");
 }
}


