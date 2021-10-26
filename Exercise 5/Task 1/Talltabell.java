import java.util.Random;

class Talltabell {

	public static void main(String[] args) {

		Random random = new Random();

		int[] antall = new int[10];

		int i = 0;
		while (i < 1000) {

			int tall = random.nextInt(10);

			antall[tall]++;
			i++;
		}
		String resultat = "";
		int antganger = 0;
		for(int k = 0; k < 10; k++){
		resultat += (k + ": " + antall[k] + " ganger \n");
		antganger+= antall[k];
		}

		resultat += (antganger + " ganger tilsammen ");

		System.out.println(resultat);
	}
}