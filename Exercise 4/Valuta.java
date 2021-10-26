import static javax.swing.JOptionPane.*;

class Valuta {
	private double kurs;

	public Valuta(double kurs, double resultat){
		this.kurs = kurs;
	}

	public void settKurs(double kurs){
		this.kurs = kurs;
	}
	public double regnOmTilNok(double antall) {
		return antall*kurs;
	}
	public double regnOmFraNok(double antall){
		return antall/kurs;
	}
}
