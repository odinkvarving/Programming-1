import java.util.Random.*;
import java.util.*;

class TalltabellProgram {

	public static void main(String[] args) {

		Talltabell tabell1 = new Talltabell();
		int nedre = 0;
		int ovre = 10;

		for(int antall = 1; antall <= 20; antall++){

			System.out.println(tabell1.nesteTall(nedre, ovre));

			System.out.println(tabell1.finnTall(tabell1.nesteTall(nedre, ovre)));

		}
	}
}