import java.util.Random;

class Talltabell {

	public static void main(String[] args) {

		Random random = new Random();

		int[] antall = new int[10];


		for(int i = 0; i < 1000; i++){

			int tall = random.nextInt(10);

			antall[tall]++;
		}
		String resultat = "";
		int antganger = 0;
		for(int i = 0; i < 10; i++){
			resultat += (i + ": " + antall[i] + " ganger \n");
			antganger+= antall[i];
		}

		resultat += (antganger + " ganger tilsammen ");

		System.out.println(resultat);
	}
}