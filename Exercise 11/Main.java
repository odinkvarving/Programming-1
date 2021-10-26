import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.*;

/**
 * Main.java
 *
 * Klientprogram
 * @author Odin Kvarving
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        EiendomsRegister eiendomsRegister = new EiendomsRegister();

        Eiendom eiendom1 = new Eiendom(1445, "Gloppen", 77, 631, "", 1017.6,  "Jens Olsen");
        Eiendom eiendom2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        Eiendom eiendom3 = new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        Eiendom eiendom4 = new Eiendom(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten");
        Eiendom eiendom5 = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indergård");

        eiendomsRegister.registrerNyEiendom(eiendom1);
        eiendomsRegister.registrerNyEiendom(eiendom2);
        eiendomsRegister.registrerNyEiendom(eiendom3);
        eiendomsRegister.registrerNyEiendom(eiendom4);
        eiendomsRegister.registrerNyEiendom(eiendom5);

        /**
         * Objekt-liste som inneholder de forskjellige valgene man kan ta i switchen
         */

        Object[] options ={"Registrere ny eiendom", "Fjern en eiendom", "Skrive ut alle eiendommer", "Søke etter eiendom", "Gjennomsnittsareal"};

        boolean aktiv = true;

        /**
         * While-løkke som går så lenge aktiv = true
         */

        while(aktiv){

            int valg = showOptionDialog(null, "Hvilket valg vil du ta?", "Register", 0, QUESTION_MESSAGE, null, options, options[0]);

            /**
             * Switch som tar inn integer valg som parameter, hvor QUESTION_MESSAGE i option-dialogen bruker objekt-listen 'options' som valg-alternativer
             */

            switch (valg){

                case 0:

                    JTextField reg_kommunenr = new JTextField();
                    JTextField reg_kommunenavn = new JTextField();
                    JTextField reg_gårdsnummer = new JTextField();
                    JTextField reg_bruksnummer = new JTextField();
                    JTextField reg_bruksnavn = new JTextField();
                    JTextField reg_areal = new JTextField();
                    JTextField reg_eiernavn = new JTextField();

                    Object[] boksSkjema = {
                            "Kommunenummer: ", reg_kommunenr,
                            "Kommunenavn: ", reg_kommunenavn,
                            "Gårdsnummer: ", reg_gårdsnummer,
                            "Bruksnummer: ", reg_bruksnummer,
                            "Bruksnavn: ", reg_bruksnavn,
                            "Areal: ", reg_areal,
                            "Eiernavn: ", reg_eiernavn,
                    };

                    int regSkjema_valg = showConfirmDialog(null, boksSkjema, "Registrer en ny eiendom: ", OK_CANCEL_OPTION);
                    if(regSkjema_valg == OK_OPTION){
                        showMessageDialog(null, "Behandler registrering . . .");

                        if(reg_kommunenr.getText().length() > 0 && reg_kommunenavn.getText().length() > 0 && reg_gårdsnummer.getText().length() > 0 && reg_bruksnummer.getText().length() > 0 && reg_areal.getText().length() > 0 && reg_eiernavn.getText().length() > 0) {
                            eiendomsRegister.registrerNyEiendom(new Eiendom(Integer.parseInt(reg_kommunenr.getText()), reg_kommunenavn.getText(), Integer.parseInt(reg_gårdsnummer.getText()), Integer.parseInt(reg_bruksnummer.getText()), reg_bruksnavn.getText(), Double.parseDouble(reg_areal.getText()), reg_eiernavn.getText()));
                            showMessageDialog(null, "Eiendom registrert!");
                        }
                    }
                    else {
                        showMessageDialog(null, "Ugyldig input!");
                    }

                    break;

                case 1:

                    JTextField slett_kommunenummer = new JTextField();
                    JTextField slett_gårdsnummer = new JTextField();
                    JTextField slett_bruksnummer = new JTextField();


                    Object[] slettSkjema = {
                            "Kommunenummer: ", slett_kommunenummer,
                            "Gårdsnummer: ", slett_gårdsnummer,
                            "Bruksnummer: ", slett_bruksnummer,
                    };

                    int slettSkjema_valg = showConfirmDialog(null, slettSkjema, "Slett eiendom", OK_CANCEL_OPTION);
                    if(slettSkjema_valg == OK_OPTION){
                        showMessageDialog(null, "Behandler sletting . . .");

                        if(slett_kommunenummer.getText().length() > 0 && slett_gårdsnummer.getText().length() > 0 && slett_bruksnummer.getText().length() > 0) {
                            eiendomsRegister.slettEiendom(Integer.parseInt(slett_kommunenummer.getText()), Integer.parseInt(slett_gårdsnummer.getText()), Integer.parseInt(slett_bruksnummer.getText()));
                            showMessageDialog(null, "Eiendom slettet!");
                        }
                    }
                    else {
                        showMessageDialog(null, "Ugyldig input!");
                    }

                    break;

                case 2:

                    //eiendomsRegister.OversiktEiendommer().forEach((e) -> System.out.println(e));
                    System.out.println(eiendomsRegister.getOversikt());

                    break;

                case 3:

                    JTextField finn_kommunenummer = new JTextField();
                    JTextField finn_gårdsnummer = new JTextField();
                    JTextField finn_bruksnummer = new JTextField();


                    Object[] finnSkjema = {
                            "Kommunenummer: ", finn_kommunenummer,
                            "Gårdsnummer: ", finn_gårdsnummer,
                            "Bruksnummer: ", finn_bruksnummer,
                    };

                    int finnSkjema_valg = showConfirmDialog(null, finnSkjema, "Slett eiendom", OK_CANCEL_OPTION);
                    if(finnSkjema_valg == OK_OPTION){
                        showMessageDialog(null, "Finner eiendommer . . .");

                        if(finn_kommunenummer.getText().length() > 0 && finn_gårdsnummer.getText().length() > 0 && finn_bruksnummer.getText().length() > 0) {
                            showMessageDialog(null, "Eiendommer: " + eiendomsRegister.finnEiendom(Integer.parseInt(finn_kommunenummer.getText()), Integer.parseInt(finn_gårdsnummer.getText()), Integer.parseInt(finn_bruksnummer.getText())));
                        }
                    }
                    else {
                        showMessageDialog(null, "Ugyldig input!");
                    }

                    break;

                case 4:

                    showMessageDialog(null, "Gjennomsnittsareal av eiendommene: " + eiendomsRegister.gjennomsnittsAreal());

                    break;
            }
        }
    }
}
