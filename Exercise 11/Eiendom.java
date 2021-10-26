import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.*;

/**
 * Eiendom.java
 *
 * Eiendom Klasse
 *
 * @author Odin Kvarving
 * @version 1.0
 */


public class Eiendom {

    private int kommunenummer;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eiernavn;

    /**
     *
     * @param kommunenummer
     * @param kommunenavn
     * @param gnr Gårdsnummer
     * @param bnr Bruksnummer
     * @param bruksnavn
     * @param areal
     * @param eiernavn
     * @throws IllegalArgumentException Hvis kommunenummeret er utenfor begrensnings-området
     */

    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eiernavn) throws IllegalArgumentException {

        if(kommunenummer < 101 || kommunenummer > 5054){
            throw new IllegalArgumentException("Ugyldig kommunenummer!");
        }

        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eiernavn = eiernavn;
    }

    /**
     * Get Kommunenummer
     * @return
     */

    public int getKommunenummer(){
        return kommunenummer;
    }

    /**
     * Get Kommunenavn
     * @return
     */

    public String getKommunenavn(){
        return kommunenavn;
    }

    /**
     * Get Gårdsnummer
     * @return
     */

    public int getGnr(){
        return gnr;
    }

    /**
     * Get Bruksnummer
     * @return
     */

    public int getBnr(){
        return bnr;
    }

    /**
     * Get Bruksnavn
     * @return
     */

    public String getBruksnavn(){
        return bruksnavn;
    }

    /**
     * Get Areal
     * @return
     */

    public double getAreal(){
        return areal;
    }

    /**
     * Get Eiernavn
     * @return
     */
    public String getEiernavn(){
        return eiernavn;
    }

    /**
     * Setter nytt areal
     * @param areal
     */

    public void setAreal(double areal) {
        this.areal = areal;
    }

    /**
     * Setter nytt eiernavn
     * @param eiernavn
     */

    public void setEiernavn(String eiernavn) {
        this.eiernavn = eiernavn;
    }

    /**
     * Get EiendomsID
     * @return
     */

    public String getEiendomsID(){

    return String.format("%d-%d/%d", getKommunenummer(), getGnr(), getBnr());
    }

    /**
     * toString-metode for å få objektvariablene og eiendoms-ID til eiendommen som en string
     * @return
     */

    public String toString(){
        return "\nEiendoms-ID: " + getEiendomsID() + " Kommunenummer: " + kommunenummer + " Kommunenavn: " + kommunenavn + " Gnr: " + gnr + " Bnr: " + bnr + " Bruksnavn: " + bruksnavn + " Areal: " + areal + " Eiernavn: " + eiernavn;
    }
}