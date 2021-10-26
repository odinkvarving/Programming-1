import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
        Student[] studenter = {
                new Student("Magnus", 8),
                new Student("Petter", 4),
                new Student("Ole", 9),
                new Student("Samuel", 3),
                new Student("Odin", 8),
        };

        Oppgaveoversikt oversikt = new Oppgaveoversikt(studenter, studenter.length);

        Object[] options = {"Antall registrerte studenter", "Sjekk løste oppgaver", "Registrer student", "Legg til oppgave", "informasjon om student", "Avslutt"};

        boolean aktiv = true;

        while (aktiv) {

            int valg = showOptionDialog(null, "Hvilket valg vil du ta?", "Oppgave 9", 0, QUESTION_MESSAGE, null, options, options[0]);

            Object[] studentListe = new Object[oversikt.getRegStud()];  //Lager en ny objektliste som inneholder antall registrerte studenter
            Student[] oversiktListe = oversikt.getStudenter();          //Lager en ny 'Student' liste, som inneholder alle studentene som er registrert i 'oversikt'

            switch (valg) {

                case 0:

                    showMessageDialog(null, " Antall registrerte studenter er: " + oversikt.getRegStud());
                    break;

                case 1:

                    for (int i = 0; i < oversiktListe.length; i++) {

                        studentListe[i] = oversiktListe[i].getNavn();  //Bruker objektlisten for å få opp navnet til hver enkelt student på index 'i'

                    }
                    int j = showOptionDialog(null, "Hvilken student vil du sjekke?", "Oppgaver", 0, QUESTION_MESSAGE, null, studentListe, studentListe[0]);

                    showMessageDialog(null, oversiktListe[j].getNavn() + " har løst " + oversiktListe[j].getAntOppg() + " oppgaver. ");

                    break;

                case 2:

                    String nyStudentNavn = showInputDialog("Navn til student: ");
                    String nyStudentOppgaver = showInputDialog("Antall oppgaver løst: ");

                    int nyStudentOppg = Integer.parseInt(nyStudentOppgaver);
                    oversikt.registrerStudent(nyStudentNavn, nyStudentOppg);

                    showMessageDialog(null, nyStudentNavn + " er registrert");

                    break;

                case 3:

                    for (int i = 0; i < oversiktListe.length; i++) {

                        studentListe[i] = oversiktListe[i].getNavn();
                    }

                    int k = showOptionDialog(null, "Hvilken student vil du legge til oppgaver for?", "Legge til oppgave", 0, QUESTION_MESSAGE, null, studentListe, studentListe[0]);
                    String nyOppgaveAnt = showInputDialog("Hvor mange oppgaver vil du legge til? ");

                    int økning = Integer.parseInt(nyOppgaveAnt);
                    oversikt.ØkAntOpp(økning);

                    showMessageDialog(null, " Du har lagt til " + økning + " oppgaver til studenten " + oversiktListe[k].getNavn());

                    break;

                case 4:
                    for (int i = 0; i < oversiktListe.length; i++) {

                        studentListe[i] = oversiktListe[i].getNavn();
                    }
                    int l = showOptionDialog(null, "Hvilken student vil du sjekke?", "Student-informasjon", 0, QUESTION_MESSAGE, null, studentListe, studentListe[0]);
                    showMessageDialog(null, oversiktListe[l].toString());
                    break;

                case 5:
                    aktiv = false;

                    break;
            }
        }
    }
}

