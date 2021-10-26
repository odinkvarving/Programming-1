import java.util.*;

class yearreg {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // Lager en scanner for å gjøre det mulig å skrive input til System.in

        System.out.println("Hvilket årstall vil du sjekke? : ");
		int year = in.nextInt();

		System.out.println(" Du har valgt årstallet " +year);

		if(year%100 == 0 && year%400 == 0){
			System.out.println( year + " er et skuddår ");

		}else if(year%4 == 0 && year%100 != 0){
			System.out.println( year + " er et skuddår ");
		}else{
			System.out.println( year + " er ikke et skuddår ");
		}
	}
}




