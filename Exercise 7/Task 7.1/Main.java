import java.util.*;

public class Main {

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Hvilken tekst vil du forkorte?");
      String tekst = in.nextLine();

      NyString Tekst = new NyString(tekst);

      System.out.println(" Vi skal forkorte teksten:  " + tekst);

      System.out.println(" Teksten etter forkortingen ser slik ut: " + Tekst.getForkortetTekst());

      System.out.println(" Hvilken bokstav vil du fjerne fra teksten? (Skriv én bokstav) ");
      String bokstav = in.next();

      System.out.println(" Vi fjerner bokstaven: " + Tekst.getTegnFjernet(bokstav));
    }
}
