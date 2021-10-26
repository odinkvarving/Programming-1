import java.util.Arrays;
import java.util.stream.Collectors;

public class Oppgaveoversikt {

    private int antStud = 0;
    private Student[] studenter;

    public Oppgaveoversikt(Student[] studenter, int antStud){

        this.studenter = studenter;
        this.antStud = antStud;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void registrerStudent(String navn, int antOppg){
        utvidArray();
        studenter[antStud] = new Student(navn, antOppg);
        antStud++;
        }

    public int getRegStud(){

        return antStud;
    }

    public int antOppgLøst(){

        return studenter[antStud].getAntOppg();
    }

    public void utvidArray(){
        if(studenter.length == antStud){
            Student[] nyStudents = new Student[studenter.length+1];

            for(int i = 0; i < studenter.length; i ++){
                nyStudents[i]=studenter[i];
            }
            studenter = nyStudents;
        }
    }

    public void ØkAntOpp(int økning){

        for(int i = 0; i < studenter.length; i++){

            studenter[i].økAntOppg(økning);
        }
    }
}
