import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.*;
public class Main {

    public static void main(String[] args) {

        MenyRegister MenyRegister = new MenyRegister();

        MenyRegister.RegistrerRett("Kyllingvinger", "Forrett", 90, "Kyllingvinger, BBQ-Saus, Pommes frites");
        MenyRegister.RegistrerRett("Pizza", "Hovedrett", 145, "Pizzabunn, tomatsaus, Pepperoni og Badon");
        MenyRegister.RegistrerRett("Iskrem", "Dessert", 60, "Sjokolade-is, hasselnøtter, karamellsaus");
        MenyRegister.RegistrerRett("Taco", "Hovedrett", 120, "Kjøttdeig, Mais, Ost, Rømme, Taco-lefse");
        MenyRegister.RegistrerRett("Tomatsuppe", "Forrett", 65, "Tomat, Tomatpurre, Gressløk, Pastaskruer");


        Object[] options = {"Registrer ny rett", "Finn rett", "Finn rett av type", "Registrer ny meny", "Meny med kostnad"};

        boolean aktiv = true;

        while(aktiv){

            int valg = showOptionDialog(null, "Hvilket valg vil du ta?", "Oversikt", 0, QUESTION_MESSAGE, null, options, options[0]);

            switch(valg){

                case 0:

                    String navn = showInputDialog(null, "Navn på retten: ");
                    String type = showInputDialog(null, "Type rett: ");

                    String pris = showInputDialog(null, "Pris på rett: ");
                    double valgtPris = Double.parseDouble(pris);

                    String oppskrift = showInputDialog(null, "Oppskrift på retten: ");

                    MenyRegister.RegistrerRett(navn, type, valgtPris, oppskrift);


                    showMessageDialog(null, "Retten " + navn + " er registrert!");

                    break;

                case 1:

                    String finnRett = showInputDialog(null, "Hvilken rett vil du finne?");
                    if(MenyRegister.finnRett(finnRett).size() == 0){
                        showMessageDialog(null, finnRett + " finnes ikke i menyen. ");
                    }
                    else {
                        showMessageDialog(null, MenyRegister.finnRett(finnRett) + " finnes i menyen!");
                    }
                    break;

                case 2:

                    String finnType = showInputDialog(null, "Hvilken type rett vil du finne? (Forrett, Hovedrett eller Dessert) ");
                    if(MenyRegister.finnRettType(finnType).size() == 0) {
                        showMessageDialog(null, "Vi har ingen retter av denne typen!");
                    }
                    else {
                        showMessageDialog(null, "Her er en liste over retter av denne typen: " + MenyRegister.finnRettType(finnType));
                    }
                    break;

                case 3:
                    MenyRegister.RegistrerNyMeny();

                    break;

                case 4:
                    String laveste = showInputDialog("Nedre grense for menyen: ");
                    int nedre = Integer.parseInt(laveste);

                    String høyeste = showInputDialog("Øvre grense for menyen: ");
                    int øvre = Integer.parseInt(høyeste);

                    showMessageDialog(null, "Menyer innenfor din prisrekkevidde: " + MenyRegister.menyKostnad(øvre, nedre));

                    break;

            }

        }
    }
}
