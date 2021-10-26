

public class Matrise {

	int[][] matrise1 = new int[][]{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	};

	int[][] matrise2 = new int[][]{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	};

	public void getMatrise(){

		for(int i = 0; i < matrise1.length; i++){
			for(int j = 0; j < matrise1[i].length; j++){
				System.out.print(matrise1[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
	}

	public void printMatrise(int[][] matrise2){

		for(int g = 0; g < matrise2.length; g++){
			for(int h = 0; h < matrise2[g].length; h++){
				System.out.print(matrise2[g][h]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
	}

	public int[][] addisjon(int[][] matrise2){

		int[][] addfinal = new int[matrise2.length][matrise2[0].length];
		if(matrise1.length == matrise2.length && matrise1[0].length == matrise2[0].length){
			for(int i = 0; i < matrise1.length; i++){
				for(int j = 0; j < matrise1[i].length; j++){
					addfinal[i][j] = matrise1[i][j] + matrise2[i][j];
				}
			}
			return addfinal;
		}
		else{
			return null;
		}

	}

	public int[][] multiplisere(int[][] matrise2){

		int[][] multfinal = new int[matrise1.length][matrise2[0].length];

		if(matrise1[0].length == matrise2.length && matrise1.length == matrise2[0].length){

			int a = 0;
			int b = 0;

			for(int x = 0; x < matrise1.length; x++){
				for(int h = 0; h < matrise2[0].length; h++){
					for(int i = 0; i < matrise1[0].length; i++){
						multfinal[a][b] += matrise1[x][i]*matrise2[i][h];
					}
					b++;
				}
				b = 0;
				a++;
			}
			return (multfinal);
		}
		else {
			return null;
		}
	}

	public int[][] transposer(){

		int [][] transposertMatrise = new int[3][3];
		for(int i = 0; i < matrise1.length; i++){
			for(int j = 0; j < matrise1[i].length; j++){

				transposertMatrise[j][i] += matrise1[i][j];
			}
		}
		return transposertMatrise;
	}
}

// SE MER PÅ DENNE!