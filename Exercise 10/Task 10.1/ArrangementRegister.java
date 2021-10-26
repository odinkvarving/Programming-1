import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrangementRegister {

    private ArrayList<Arrangement> oversikt = new ArrayList<Arrangement>();

    public void RegistrerArrangement(Arrangement nyttArrangement) {

        oversikt.add(nyttArrangement);
    }

    public ArrayList<String> finnSted(String sted) {
        ArrayList<String> nyListe = new ArrayList<String>();

        for (int i = 0; i < oversikt.size(); i++) {

            if (oversikt.get(i).getSted().equals(sted)) {
                nyListe.add(oversikt.get(i).getNavn());

            }
        }
        return nyListe;
    }

    public ArrayList<String> finnTidspunkt(int dato) {
        ArrayList<String> nyListe = new ArrayList<String>();

        for (int i = 0; i < oversikt.size(); i++) {

            long tidspunkt = oversikt.get(i).getTidspunkt();
            String Tidspunkt = Long.toString(tidspunkt);
            String nyString = Tidspunkt.substring(0, 8);

            int ArrangementDato = Integer.parseInt(nyString);

            if ((ArrangementDato == (dato))) {
                nyListe.add(oversikt.get(i).getNavn());
            }
        }
        return nyListe;
    }

    public ArrayList<String> finnIntervall(int dato1, int dato2) {
        ArrayList<String> nyListe = new ArrayList<>();
        Collections.sort(oversikt, new Arrangement.ArrangementDatoSorter());

        for (int i = 0; i < oversikt.size(); i++) {

            long date1 = oversikt.get(i).getTidspunkt();
            String Date1 = Long.toString(date1);
            String nyString = Date1.substring(0, 8);

            int ArrangementDato = Integer.parseInt(nyString);
            if (ArrangementDato >= dato1 && ArrangementDato <= dato2) {
                nyListe.add(oversikt.get(i).getNavn());
            }
        }
        return nyListe;
    }

    public ArrayList<Arrangement> ArrangementListeTid() {
        ArrayList<Arrangement> nyListe = this.oversikt;

        Collections.sort(nyListe, new Arrangement.ArrangementDatoSorter());
        return nyListe;
    }

    public ArrayList<Arrangement> ArrangementListeSted(){
        ArrayList<Arrangement> nyListe = this.oversikt;

        Collections.sort(nyListe, new Arrangement.ArrangementStedSorter());
        return nyListe;
    }

    public ArrayList<Arrangement> ArrangementListeType() {
        ArrayList<Arrangement> nyListe = this.oversikt;

        Collections.sort(nyListe, new Arrangement.ArrangementTypeSorter());
        return nyListe;
    }
}

