public class Student {

private String navn;
private int antOppg;

    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn(){
        this.navn = navn;

        return navn;
    }

    public int getAntOppg(){
        this.antOppg = antOppg;

        return antOppg;
    }

    public void økAntOppg(int økning){
        antOppg += økning;
    }

    public String toString(){
        return " Navn: " + navn + "\n Antall oppgaver: " + antOppg;
    }
}
