import java.util.ArrayList;

public class Meny {

    private String menyNavn;
    private double totalPris;
    private ArrayList<Rett> menyRetter;

    public Meny(String menyNavn, double totalPris, ArrayList menyRetter){

        this.menyNavn = menyNavn;
        this.totalPris = totalPris;
        this.menyRetter = new ArrayList<Rett>();
    }

    public String getMenyNavn(){

        return menyNavn;
    }

    public Double getTotalPris(){

        return totalPris;
    }

    public ArrayList getMenyRetter(){

        return menyRetter;
    }






}
