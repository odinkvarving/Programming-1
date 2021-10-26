import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {

        ArrangementRegister register = new ArrangementRegister();

        register.RegistrerArrangement(new Arrangement(1, "Fest", "Stjørdal", "Hallager", "Disco", 201928102000L));
        register.RegistrerArrangement(new Arrangement(2, "skoleball", "Skatval", "Bullseye", "Ball", 201930101900L));
        register.RegistrerArrangement(new Arrangement(3, "Rave", "Trondheim", "Uptown", "Raveparty", 201914101800L));


        Object[] options = {"Registrere arrangement", "Arrangement på sted", "Arrangement på dato", "Arrangementer mellom to datoer", "Liste etter tidspunkt", "Liste etter sted", "Liste etter type"};

        boolean aktiv = true;

        while (aktiv){

            int valg = showOptionDialog(null, "Hvilket valg vil du ta?", "oppgave 10", 0, QUESTION_MESSAGE, null, options, options[0]);

            switch(valg) {

                case 0:

                    String nyArrangementNummer = showInputDialog("Nummer på arrangement");
                    int arrangementNummer = Integer.parseInt(nyArrangementNummer);

                    String nyNavn = showInputDialog("Navn på arrangement");
                    String nySted = showInputDialog("Sted for arrangement");
                    String nyArrangør = showInputDialog("Navn på arrangør");
                    String nyType = showInputDialog("Type arrangement");

                    String nyArrangementTidspunkt = showInputDialog("Tidspunkt for arrangement");
                    long arrangementTidspunkt = Long.parseLong(nyArrangementTidspunkt);

                    register.RegistrerArrangement(new Arrangement(arrangementNummer, nyNavn, nySted, nyArrangør, nyType, arrangementTidspunkt));
                    showMessageDialog(null, "Arrangementet " + nyNavn + " er registrert.");
                    break;

                case 1:

                    String arrangementSted = showInputDialog("Velg sted du vil sjekke for arrangementer på:");
                    showMessageDialog(null, register.finnSted(arrangementSted));
                    break;

                case 2:

                    String arrangementDato = showInputDialog("Velg dato du vil sjekke for arrangementer på:");
                    int nyArrangementDato = Integer.parseInt(arrangementDato);

                    showMessageDialog(null, register.finnTidspunkt(nyArrangementDato));
                    break;

                case 3:

                    String arrangementIntervall = showInputDialog("Velg den første datoen du vil sjekke:");
                    int nyArrangementIntervall1 = Integer.parseInt(arrangementIntervall);
                    String arrangementIntervall2 = showInputDialog("Velg den andre datoen du vil sjekke");
                    int nyArrangementIntervall2 = Integer.parseInt(arrangementIntervall2);

                    showMessageDialog(null, register.finnIntervall(nyArrangementIntervall1, nyArrangementIntervall2));
                    break;

                case 4:

                    String ArrangementListe  = "";
                    for(Arrangement a : register.ArrangementListeTid()){
                        ArrangementListe += a.getNavn() + " ";
                    }
                    showMessageDialog(null, ArrangementListe);
                    break;

                case 5:

                    String ArrangementListe2 = "";
                    for(Arrangement b : register.ArrangementListeSted()){
                        ArrangementListe2 += b.getSted() + " ";
                    }
                    showMessageDialog(null, ArrangementListe2);
                    break;

                case 6:

                    String ArrangementListe3 = "";
                    for(Arrangement c : register.ArrangementListeType()){
                        ArrangementListe3 += c.getType() + " ";
                    }
                    showMessageDialog(null, ArrangementListe3);
                    break;
            }

        }
    }
}
