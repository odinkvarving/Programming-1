import static javax.swing.JOptionPane.*;


public class HjelpemiddelKlientProgram {

    public static void main(String[] args){

        Hjelpemiddelsentralen ntnu = new Hjelpemiddelsentralen("NTNU-sentralen");
        String [] muligheter = {"List all informasjon", "Registrer nytt hjelpemiddel", "Registrer Utlån", "Registrer innlevering", "Avslutt"};
        final int LIST_ALLE = 0;
        final int REGISTRER_NYTT_HJELPEMIDDEL = 1;
        final int UTLEVERING_AV_HJELPEMIDDEL = 2;
        final int INNLEVERING_AV_HJELPEMIDDEL = 3;
        final int AVSLUTT = 4;

        int valg = showOptionDialog(null, "Hjelpemiddelsentralen " + ntnu.getNavn() + "\nVelg funksjon", "Eksamen des 2019", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
        while (valg != AVSLUTT){
            switch (valg){
                case LIST_ALLE:

                    showMessageDialog(null, ntnu.InfoRegister());
                    break;

                case REGISTRER_NYTT_HJELPEMIDDEL:

                    String hjelpemiddelID = showInputDialog(null, "Hva er hjelpemiddelets ID? (1001-9999)");
                    int ID = Integer.parseInt(hjelpemiddelID);

                    String beskrivelse = showInputDialog(null, "Beskrivelse av hjelpemiddel (type): ");

                    ntnu.regNyttHjelpemiddel(new Hjelpemiddel(ID, beskrivelse));
                    break;

                case UTLEVERING_AV_HJELPEMIDDEL:

                    String utleieHjelpemiddelID = showInputDialog(null, "Skriv inn ID for hjelpemiddelet: ");
                    int utleieID = Integer.parseInt(utleieHjelpemiddelID);

                    String utleieBeskrivelse = showInputDialog(null, "Beskrivelse av hjelpemiddel (type): ");
                    String navnLeietaker = showInputDialog(null, "Navn på leietaker: ");

                    ntnu.leiUtHjelpemiddel(new Hjelpemiddel(utleieID, utleieBeskrivelse), navnLeietaker);
                    break;

                    case INNLEVERING_AV_HJELPEMIDDEL:

                    String innleveringHjelpemiddelID = showInputDialog(null, "Skriv inn ID for hjelpemiddelet: ");
                    int innleveringID = Integer.parseInt(innleveringHjelpemiddelID);

                    String innleveringNavn = showInputDialog(null, "Navn på leietaker: ");

                    ntnu.avsluttLeie(innleveringID, innleveringNavn);
                    break;

                default: break;
            }
            valg = showOptionDialog(null, "Hjelpemiddelsentralen " + ntnu.getNavn() + "\nVelg funksjon", "Eksamen des 2019", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
        }

    }
}
