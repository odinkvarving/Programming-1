/**
 * Hjelpemiddel.java
 * Hjelpemiddel Klasse
 *
 * @author 10310
 * @version 1.0.0
 */

public class Hjelpemiddel {

    //Klassens mutable objektvariabler
    private final int hjelpemiddelID;
    private final String beskrivelse;
    private boolean utleieStatus;
    private String leierNavn;


    /**
     *
     * @param hjelpemiddelID ID på hjelpemiddelet
     * @param beskrivelse  Beskrivelse/Type hjelpemiddel
     * @param utleieStatus Status på utleie (utlånt/ledig)
     * @param leierNavn Navn på leietaker
     */
    //Klassens første konstruktør, klassens objektvariabler som parameter
    public Hjelpemiddel(int hjelpemiddelID, String beskrivelse, boolean utleieStatus, String leierNavn){
        if(hjelpemiddelID < 1001 || hjelpemiddelID > 9999){
            throw new IllegalArgumentException("HjelpemiddelID må være mellom 1001 og 9999!");
        }

        this.hjelpemiddelID = hjelpemiddelID;
        this.beskrivelse = beskrivelse;
        this.utleieStatus = utleieStatus;
        this.leierNavn = leierNavn;
    }

    /**
     *
     * @param hjelpemiddelID
     * @param beskrivelse
     */
    //Klassens andre konstruktør, som bare tar inn hjelpemiddelID, beskrivelse og utleiestatus som parameter, slik at man kan lage objekter uten en leietaker
    public Hjelpemiddel(int hjelpemiddelID, String beskrivelse){
        this.hjelpemiddelID = hjelpemiddelID;
        this.beskrivelse = beskrivelse;
    }

    //Klassens tredje konstruktør med Hjelpemiddel objekt som parameter
    //Bruker objektet sine tilgangsmetoder for å tildele 'this' sine variabler med en verdi lik parameter-objektet

    /**
     *
     * @param hjelpemiddel
     */
    public Hjelpemiddel(Hjelpemiddel hjelpemiddel){

        this.hjelpemiddelID = hjelpemiddel.getHjelpemiddelID();
        this.beskrivelse = hjelpemiddel.getBeskrivelse();
        this.utleieStatus = hjelpemiddel.getUtleieStatus();
        this.leierNavn = hjelpemiddel.getLeierNavn();
    }

    public int getHjelpemiddelID(){
        return this.hjelpemiddelID;
    }

    public String getBeskrivelse(){
        return this.beskrivelse;
    }

    public boolean getUtleieStatus(){
        return this.utleieStatus;
    }

    public String getLeierNavn(){
        return this.leierNavn;
    }

    public void setUtleieStatus(boolean nyStatus){
        this.utleieStatus = nyStatus;
    }

    public void setLeierNavn(String nyLeierNavn){
        this.leierNavn = nyLeierNavn;
    }

    /**
     * equals-metode som sjekker om to objekter er like ved å sammenlikne hjelpemiddelID
     * @param obj
     * @return true eller false basert på om objektet er et Hjelpemiddel eller ikke
     */
    @Override
    public boolean equals(Object obj) {

        //Sjekker om objektet er et dansepar, og returnerer true hvis det er det
        if(this == obj){
            return true;
        }
        //Caster objektet til til Hjelpemiddel og sammenligner hjelpemiddelID til begge to
        if(obj instanceof Hjelpemiddel) {
            Hjelpemiddel hjelpemiddel = (Hjelpemiddel) obj;
            if(hjelpemiddel.getHjelpemiddelID() == (getHjelpemiddelID())) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        if(getUtleieStatus()){
            return hjelpemiddelID + " " + beskrivelse + " utleid " + "til " + leierNavn;
        }
        else{
            return hjelpemiddelID + " " + beskrivelse + " ledig";
        }
    }

}
