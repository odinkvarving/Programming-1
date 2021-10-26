import java.util.*;

class primtall{

	public static void main(String[] args){

		Scanner in = new Scanner (System.in);

	    System.out.println(" Hvilket tall vil du sjekke? ");

		int tall = in.nextInt();

		System.out.println(" Du har valgt tallet " + tall);

		boolean primSant = true;

		for (int i = 2; i < tall; i++){
			if (tall%i == 0){
				primSant = false;
				break;
			}
		}

		if (primSant){
			System.out.println(+ tall + " er et primtall. ");
		}else{
			System.out.println(+ tall + " er ikke et primtall. ");
		}
	}
}
