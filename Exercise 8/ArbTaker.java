import java.util.GregorianCalendar;

import static java.util.Calendar.YEAR;

public class ArbTaker {
private int arbtakernr;
private int ansettelsesår;
private double månedslønn;
private double skatteprosent;
private Person personalia;

    public ArbTaker (Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent){
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
        this.personalia = personalia;
    }

    public String getFornavn(){
       return personalia.getFornavn();
    }

    public String getEtternavn(){
        return personalia.getEtternavn();
    }

    public int getFødselsår(){
        return personalia.getFødselsår();
    }

    public int getArbtakernr(){
        return arbtakernr;
    }

    public int getAnsettelsesår(){
        return ansettelsesår;
    }

    public double getMånedslønn(){
        return månedslønn;
    }

    public double getSkatteprosent(){
        return skatteprosent;
    }

    public void setMånedslønn(double månedslønn){
        this.månedslønn = månedslønn;
    }

    public void setSkatteprosent(double skatteprosent){
        this.skatteprosent = skatteprosent;
    }

    public double getSkattetrekk(){
        double skattetrekk = (månedslønn / 100)* skatteprosent;

        return skattetrekk;
    }

    public double getBruttolønn(){
        double bruttolønn = månedslønn * 12;

        return bruttolønn;
    }

    public double getSkattetrekkÅr(){
        double skattetrekkÅr = getSkattetrekk()*10.5;

        return skattetrekkÅr;
    }

    public int getAlder(int år, int fødselsår){
        int alder = år - fødselsår;

        return alder;
    }

    public int getAntallÅrAnsatt(int år){
        int antallÅrAnsatt = år - ansettelsesår;

        return antallÅrAnsatt;
    }

    public boolean AnsattOverGrense (int år, int over){

        if(getAntallÅrAnsatt(år) > over){
            return true;
        }
        else{
            return false;
        }
    }
}
