import java.util.*;

class MatriseProgram {

	public static void main(String[] args){


		Matrise matrise1 = new Matrise();
		int[][] matrise2 = new int[][]{
			{10, 11, 12},
			{13, 14, 15},
			{16, 17, 18},
		};

		System.out.println(" Den første matrisen er: ");
		matrise1.getMatrise();

		System.out.println(" Den andre matrisen er: ");
		matrise1.printMatrise(matrise2);

		System.out.println(" Den første matrisen addert med den andre matrisen er: ");
		matrise1.printMatrise(matrise1.addisjon(matrise2));

		System.out.println(" Den første matrisen multiplisert med den andre matrisen er: ");
		matrise1.printMatrise(matrise1.multiplisere(matrise2));

		System.out.println(" Den første matrisen transposert er: ");
		matrise1.printMatrise(matrise1.transposer());
	}
}