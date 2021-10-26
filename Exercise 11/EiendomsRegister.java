import java.util.ArrayList;

/**
 * EiendomsRegister.java
 *
 * EiendomsRegister Klasse
 *
 * @author Odin Kvarving
 * @version 1.0
 */

public class EiendomsRegister {

    private ArrayList<Eiendom> oversikt = new ArrayList<Eiendom>();

    /**
     * Metode for å registrere en ny eiendom. Returnerer true eller false basert på om eiendommens ID allerede er registrert eller ikke
     * @param nyEiendom
     * @return
     */
    public boolean registrerNyEiendom(Eiendom nyEiendom) {

       for(Eiendom e : oversikt){
           if(e.getEiendomsID().equals(nyEiendom.getEiendomsID())){
               return false;
           }
       }
       oversikt.add(nyEiendom);
       return true;
    }

    /**
     * Metode for å slette en eiendom, hvor man tar inn eiernavn, gårdsnummer og bruksnummer som parametere, for å være sikker på at man sletter riktig eiendom
     * @param eiernavn
     * @param gnr
     * @param bnr
     */

    public void slettEiendom(int kommuneummer, int gnr, int bnr){

        for(int i = 0; i < oversikt.size(); i++){
            if(oversikt.get(i).getKommunenummer() == kommuneummer && oversikt.get(i).getGnr() == gnr && oversikt.get(i).getBnr() == bnr){
                oversikt.remove(oversikt.get(i));
            }
        }
    }

    /**
     * Metode for å få en oversikt over alle registrerte eiendommer. Returnerer en ArrayList av eiendommer som er registrert i Eiendom-klassen
     * @return
     */


    public int antallEiendommer(){

        return oversikt.size();
    }

    /**
     * Metode for å finne en spesifikk eiendom. Tar inn kommunenummer, gårdsnummer og bruksnummer som parametere. Denne sjekker parameterne opp mot en eiendom sitt kommunenummer, gårdsnummer og bruksnummer
     * @param kommunenummer
     * @param gnr Gårdsnummer
     * @param bnr Bruksnummer
     * @return
     */
    public Eiendom finnEiendom(int kommunenummer, int gnr, int bnr){

        for(int i = 0; i < oversikt.size(); i++){

            if(oversikt.get(i).getKommunenummer() == kommunenummer && oversikt.get(i).getGnr() == gnr && oversikt.get(i).getBnr() == bnr){
                return oversikt.get(i);
            }
        }
        return null;
    }

    /**
     * Metode for å regne ut gjennomsnittsarealet av alle de registrere eiendommene. Bruker metoden .getAreal og dele på ArrayListen sin .size() for å få gjennomsnittet
     * @return
     */
    public double gjennomsnittsAreal(){

        double areal = 0;

        for(int i = 0; i < oversikt.size(); i++){
            areal += (oversikt.get(i).getAreal());
        }
         return areal/oversikt.size();
    }

    /**
     * Metode for å finne en eiendom med et spesifikt gårdsnummer. Lager en ny ArrayList av typen String, hvor alle eiendommer med samme gårdsnummer som parameteren blir lagt til. Returnerer den nye listen.
     * @param gårdsnummer
     * @return
     */

    public ArrayList<String> eiendommerMedGårdsnummer(int gårdsnummer){

        ArrayList<String> nyListe = new ArrayList<>();

        for(int i = 0; i < oversikt.size(); i++){
            if(oversikt.get(i).getGnr() == gårdsnummer){
                nyListe.add(oversikt.get(i).toString());

                return nyListe;
            }
        }
        return null;
    }

    public ArrayList<Eiendom> getOversikt(){
        return oversikt;
    }
}
