import java.util.*;

class Multiplication {
	public static void main(String[] args){

		Scanner in = new Scanner (System.in);
		System.out.println(" skriv inn den første gangetabellen: ");
		int m = in.nextInt();
		System.out.println(" skriv inn den siste gangetabellen : ");
		int n = in.nextInt();

		for (int k = m; k <= n; k++){

			System.out.println(k + "-gangen: ");
			for (int i = 1; i <= 10; i++){

				System.out.println( k + " x " + i + " = " + k*i);
			}
        }
   }
}




