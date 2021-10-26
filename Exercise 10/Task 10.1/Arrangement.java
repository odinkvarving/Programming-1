import java.util.ArrayList;
import java.util.Comparator;

public class Arrangement {
    private int nummer;
    private String navn;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangør, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public String toString() {
        return navn;
    }

    static class ArrangementDatoSorter implements Comparator<Arrangement> {

        public int compare(Arrangement arrangement1, Arrangement arrangement2) {

            if (arrangement1.getTidspunkt() < arrangement2.getTidspunkt()) {
                return -1;
            } else if (arrangement1.getTidspunkt() > arrangement2.getTidspunkt()) {
                return 1;
            }
            return 0;
        }
    }

    static class ArrangementStedSorter implements Comparator<Arrangement> {

        public int compare(Arrangement arrangement1, Arrangement arrangement2) {
            return arrangement1.getSted().compareTo(arrangement2.getSted());
        }

    }

    static class ArrangementTypeSorter implements Comparator<Arrangement> {

        public int compare(Arrangement arrangement1, Arrangement arrangement2) {
            return arrangement1.getType().compareTo(arrangement2.getType());
        }
    }
}