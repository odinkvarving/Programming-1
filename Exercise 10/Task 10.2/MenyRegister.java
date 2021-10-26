import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.*;

public class MenyRegister {

    private ArrayList<Meny> MenyRegister = new ArrayList<Meny>();
    private ArrayList<Rett> RettRegister = new ArrayList<Rett>();

    public void RegistrerRett(String navn, String type, double pris, String oppskrift){

        RettRegister.add(new Rett(navn, type, pris, oppskrift));
    }

    public ArrayList<String> finnRett(String navn){

        ArrayList<String> nyListe = new ArrayList<>();

        for(int i = 0; i < RettRegister.size(); i++ ) {
            if(RettRegister.get(i).getNavn().equals(navn)){

                nyListe.add(RettRegister.get(i).getNavn());
            }
        }
    return nyListe;
    }

    public ArrayList<String> finnRettType(String type){

        ArrayList<String> nyListe = new ArrayList<>();

        for(int i = 0; i < RettRegister.size(); i++){
            if(RettRegister.get(i).getType().equals(type)){

                nyListe.add(RettRegister.get(i).getNavn());
            }
        }
    return nyListe;
    }

    private Rett rettEksisterer(String rett) {
        for (int i = 0; i < RettRegister.size(); i++) {
            if (rett.equals(RettRegister.get(i).getNavn())) {
                return RettRegister.get(i);
            }
        }
        return null;
    }

    public boolean RegistrerNyMeny() {

        ArrayList<Rett> nyListe = new ArrayList<Rett>();
        String menyNavn = showInputDialog(null, "Navn på ny meny: ");
        String navn1 = showInputDialog(null, "Navn på den første retten: ");
        String navn2 = showInputDialog(null, "Navn på den andre retten: ");
        String navn3 = showInputDialog(null, "Navn på den tredje retten: ");

        for (int i = 0; i < RettRegister.size(); i++) {
            double totalPris = rettEksisterer(navn1).getPris() + rettEksisterer(navn2).getPris() + rettEksisterer(navn3).getPris();

            if (rettEksisterer(navn1) != null) {
                nyListe.add(rettEksisterer(navn1));
            } else {
                return false;

            }

            if (rettEksisterer(navn2) != null) {
                nyListe.add(rettEksisterer(navn2));
            } else {
                return false;
            }

            if (rettEksisterer(navn3) != null) {
                nyListe.add(rettEksisterer(navn3));
            } else {
                return false;
            }

            MenyRegister.add(new Meny(menyNavn, totalPris, nyListe));
            showMessageDialog(null, "Menyen " + menyNavn + " er registrert. Totalkostnaden på menyen er: " + totalPris);
            break;
        }
     return true;
    }



    public ArrayList<String> menyKostnad (double høyeste, double laveste){

        ArrayList<String> nyListe = new ArrayList<>();

        for(int i = 0; i < MenyRegister.size(); i++){
            if(MenyRegister.get(i).getTotalPris() > laveste && MenyRegister.get(i).getTotalPris() < høyeste){

                nyListe.add(MenyRegister.get(i).getMenyNavn());
            }
        }
    return nyListe;
    }

    public ArrayList<Meny> getMenyListe(){
        return MenyRegister;
    }

    public ArrayList<Rett> getRettListe(){
        return RettRegister;
    }
}










