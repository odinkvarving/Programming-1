import java.sql.SQLOutput;
import java.util.ArrayList;

public class Hjelpemiddelsentralen {

    private String navn;
    private ArrayList<Hjelpemiddel> hjelpemiddelListe;

    public Hjelpemiddelsentralen(String navn) {
        this.navn = navn;
        this.hjelpemiddelListe = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public boolean regNyttHjelpemiddel(Hjelpemiddel hjelpemiddel) {
        if (!(hjelpemiddelListe.contains(hjelpemiddel))) {

            hjelpemiddelListe.add(new Hjelpemiddel(hjelpemiddel));
            return true;
        }
        return false;
    }

    public boolean leiUtHjelpemiddel(Hjelpemiddel hjelpemiddel, String navn) {
        for (int i = 0; i < hjelpemiddelListe.size(); i++) {
            if (hjelpemiddelListe.get(i).equals(hjelpemiddel) && !(hjelpemiddel.getUtleieStatus())) {

                hjelpemiddelListe.get(i).setUtleieStatus(true);
                hjelpemiddelListe.get(i).setLeierNavn(navn);
                return true;
            }
        }
        return false;
    }

    public boolean avsluttLeie(int hjelpemiddelID, String navn) {

        //Sjekker om hjelpemiddelet er registrert hos Hjelpemiddelsentralen, og om navnet til leietakeren stemmer overens med navnet til den som leier hjelpemiddelet
        for (int i = 0; i < hjelpemiddelListe.size(); i++) {
            if (hjelpemiddelListe.get(i).getHjelpemiddelID() == hjelpemiddelID && hjelpemiddelListe.get(i).getLeierNavn().equals(navn)) {
                //Setter utleiestatus til false (ledig) og navn på leietaker lik null, slik at den nå kan utleies til noen andre
                hjelpemiddelListe.get(i).setUtleieStatus(false);
                return true;
            }
        }
        return false;
    }

    public String InfoRegister() {
        String s = "";

        for (int i = 0; i < hjelpemiddelListe.size(); i++) {
            s += (i + 1) + ". " + hjelpemiddelListe.get(i).toString();
        }
        return s + "\n ";
    }

    public ArrayList<Hjelpemiddel> LedigeHjelpemidlerType(String beskrivelse) {
        ArrayList<Hjelpemiddel> nyListe = new ArrayList<>();

        for (int i = 0; i < hjelpemiddelListe.size(); i++) {
            if (hjelpemiddelListe.get(i).getBeskrivelse().equals(beskrivelse)) {
                nyListe.add(new Hjelpemiddel(hjelpemiddelListe.get(i)));
            }
        }
        return nyListe;
    }
}
