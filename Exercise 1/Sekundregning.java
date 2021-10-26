class Sekundregning {
	public static void main(String[] args) {
		double timer = 4;
		double minutter = 1;
		double sekunder = 1;
		double timesek = timer * 3600;
		double minuttsek = minutter * 60;
		double sekunderTot = timesek + minuttsek + sekunder;

		System.out.println( + timer + " timer og " + minutter + " minutter og " + sekunder + " sekunder er totalt "
		+ sekunderTot + " sekunder");
	}
}


