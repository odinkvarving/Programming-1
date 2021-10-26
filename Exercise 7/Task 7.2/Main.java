import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hvilken tekst vil du undersøke?");

        String tekst = in.nextLine();

        Tekstbehandling Tekst = new Tekstbehandling(tekst);

        System.out.println(" Gjennomsnittlig ordlengde i teksten er: " + Tekst.getGjennomsnittOrdLengde());

        System.out.println(" Gjennomsnittlig antall ord per periode er: " + Tekst.getGjennomsnittOrdPeriode());

        System.out.println(" Hvilket ord i teksten vil du bytte ut med et annet ord? (skriv et ord fra teksten, deretter et ønsket ord)");

        String første = in.next();
        String andre = in.next();

       System.out.println(" Den nye teksten blir da: " + Tekst.getErstattetTekst(første, andre));

        System.out.println(" Den originale teksten er: " + Tekst.getOriginalTekst(tekst));

        System.out.println(" Teksten i store bokstaver er: " + Tekst.getStorBokstavTekst(tekst));
    }





}
