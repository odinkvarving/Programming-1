import java.util.Random;


class MinRandom {

	private Random r = new Random();

	public int nesteHeltall(int nedre, int ovre){

		return r.nextInt((ovre - nedre) + 1) + nedre; //sp�r hvordan dette fungerer
	}
	public double nesteDesimaltall(double nedre, double ovre){

		return nedre + (r.nextDouble()*(ovre - nedre)); //Sp�r hvordan dette fungerer
	}
}
