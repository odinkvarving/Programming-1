import java.util.Random;
import java.util.Scanner;

class MinRandomProgram {

	public static void main(String[] args) {

		MinRandom Heltall = new MinRandom();
		MinRandom Desimaltall = new MinRandom();

		Scanner scanner = new Scanner(System.in);

			System.out.println(" Velg en nedre og ovre grense for heltallene (med mellomrom): ");

				int nedre = scanner.nextInt();
				int ovre = scanner.nextInt();

				System.out.println(" Du har valgt nedre grense: " + nedre + " og ovre grense: " + ovre);

			for(int antall = 1; antall <= 20; antall++){
				System.out.println(Heltall.nesteHeltall(nedre, ovre));
			}
				if(Heltall.nesteHeltall(nedre, ovre) < nedre || Heltall.nesteHeltall(nedre, ovre) > ovre){
					System.out.println(" Fant en verdi som ikke er innenfor nedre eller ovre grense. ");
				}
				else{
					System.out.println(" Fant ingen verdi som ikke er innenfor nedre eller ovre grense. ");
				}
				if(Heltall.nesteHeltall(nedre, ovre)%1 != 0){
					System.out.println(" Fant en double-verdi. ");
				}
				else{
					System.out.println(" Ingen av verdiene er en double-verdi. ");
				}

			System.out.println(" Velg en nedre og ovre grense for desimaltallene (med mellomrom): ");

				int nedre1 = scanner.nextInt();
				int ovre1 = scanner.nextInt();

				System.out.println(" Du har valgt nedre grense: " + nedre1 + " og ovre grense: " + ovre1);

			for(int antall = 1; antall <= 20; antall++){

				System.out.println(Desimaltall.nesteDesimaltall(nedre1, ovre1));
			}
				if(Desimaltall.nesteDesimaltall(ovre1, nedre1) < nedre1 || Desimaltall.nesteDesimaltall(nedre1, ovre1) > ovre1){
					System.out.println(" Fant en verdi som ikke er innenfor nedre eller ovre grense. ");
				}
				else{
					System.out.println(" Fant ingen verdi som ikke er innenfor nedre eller ovre grense. ");
				}
				if(Desimaltall.nesteDesimaltall(nedre1, ovre1)%1 == 0){
					System.out.println(" Fant en int-verdi. ");
				}
				else{
					System.out.println(" Ingen av verdiene er en int-verdi. ");
				}
	}
}
