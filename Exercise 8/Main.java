import static javax.swing.JOptionPane.*;
import java.util.GregorianCalendar;

import static java.util.Calendar.YEAR;

public class Main {

    public static void main(String[] args) {

        GregorianCalendar kalender = new GregorianCalendar();
        int year = kalender.get(YEAR);

        Person person = new Person("Anders", "Pettersen", 1967);

        ArbTaker arbeidstaker = new ArbTaker(person, 104988, 1990, 51000.00, 32);

        boolean aktiv = true;

        while(aktiv){

        String alternativ = showInputDialog(" Hva vil du sjekke/redigere for arbeidstakeren?\n 1) Skattetrekk/mnd\n 2) Bruttolønn/år\n 3) Skattetrekk/år\n 4) Navn\n 5) Alder\n 6) Antall år i bedriften\n 7) Person ansatt i over 10 år?\n 8) Endre månedslønn\n 9) Endre skatteprosent");

        int valg = Integer.parseInt(alternativ);

            switch(valg){


                case 1:
                    showMessageDialog(null," Skattetrekk per måned er: " + arbeidstaker.getSkattetrekk());
                    break;

                case 2:
                    showMessageDialog(null," Bruttolønn per år er: " + arbeidstaker.getBruttolønn());
                    break;

                case 3:
                    showMessageDialog(null," Skattetrekk per år er: " + arbeidstaker.getSkattetrekkÅr());
                    break;

                case 4:
                    showMessageDialog(null," Navnet til arbeidstakeren er: " + arbeidstaker.getFornavn() + " " + arbeidstaker.getEtternavn());
                    break;

                case 5:
                    showMessageDialog(null,arbeidstaker.getFornavn() + " er " + arbeidstaker.getAlder(year, arbeidstaker.getFødselsår()) + " år gammel.");
                    break;

                case 6:
                    showMessageDialog(null,arbeidstaker.getFornavn() + " har jobbet " + arbeidstaker.getAntallÅrAnsatt(year) + " år i bedriften. ");
                    break;

                case 7:
                    int over = 10;
                    boolean grense = arbeidstaker.AnsattOverGrense(year, over);
                    if(grense = true) {
                        showMessageDialog(null,arbeidstaker.getFornavn() + " har jobbet i over 10 år.");
                    }
                    else {
                        showMessageDialog(null,arbeidstaker.getFornavn() + " har ikke jobbet i over 10 år.");
                    }
                    break;

                case 8:
                    String Nymånedslønn = showInputDialog(" Hva vil du endre månedslønnen til?");
                    arbeidstaker.setMånedslønn(Integer.parseInt(Nymånedslønn));
                    break;

                case 9:
                    String Nyskatteprosent = showInputDialog(" Hva vil du endre skatteprosenten til?");
                    arbeidstaker.setSkatteprosent(Double.parseDouble(Nyskatteprosent));
                    break;

                case 10:
                    aktiv = false;
                    showMessageDialog(null," Ugyldig menyvalg!");
                    break;

                default:
                    aktiv = false;
                    showMessageDialog(null, " Ugyldig menyvalg!");
                    break;
            }
        }
    }
}
