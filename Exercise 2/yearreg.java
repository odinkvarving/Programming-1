import java.util.*;

class yearreg {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // Lager en scanner for � gj�re det mulig � skrive input til System.in

        System.out.println("Hvilket �rstall vil du sjekke? : ");
		int year = in.nextInt();

		System.out.println(" Du har valgt �rstallet " +year);

		if(year%100 == 0 && year%400 == 0){
			System.out.println( year + " er et skudd�r ");

		}else if(year%4 == 0 && year%100 != 0){
			System.out.println( year + " er et skudd�r ");
		}else{
			System.out.println( year + " er ikke et skudd�r ");
		}
	}
}




