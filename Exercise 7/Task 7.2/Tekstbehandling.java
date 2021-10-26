public class Tekstbehandling {

    private final String tekst;

    public Tekstbehandling(String tekst){

        this.tekst = tekst;
    }

    public int getAntallOrd(){

        String[] ord = tekst.split(" ");

        int antallOrd = 0;

        antallOrd += ord.length;

        return antallOrd;
    }

    public double getGjennomsnittOrdLengde() {

        String[] ord = tekst.split(" ");

        int gjennomsnitt = 0;

        for (int i = 0; i < ord.length; i++) {

            gjennomsnitt += ord[i].replaceAll("[!?.,:]", "").length();
        }
        return gjennomsnitt / ord.length;
    }

    public double getGjennomsnittOrdPeriode(){

        String[] periode = tekst.split("!,.?:");

        int gjennomsnitt = 0;

        for(int i = 0; i < periode.length; i++) {
            String[] ordPeriode = periode[i].split(" ");   // Deler periodene inn i antall ord, siden vi splitter med antall mellomrom i perioden.
            gjennomsnitt += ordPeriode[i].length();  // gjennomsnitt pluss lengden av ordPeriode i indeks 'i'
        }
        gjennomsnitt /= periode.length;
        return gjennomsnitt;
    }

    public String getErstattetTekst(String første, String andre){

    String newTekst = tekst.replaceAll(første, andre);
        return newTekst;
    }

    public String getOriginalTekst(String tekst){
        return tekst;
    }

    public String getStorBokstavTekst(String tekst){

        return tekst.toUpperCase();
    }

}

