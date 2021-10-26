class prissam {
  public static void main(String[] args){
	// Merke A

	int vektA = 450;
	double prisA = 35.90;

	// Merke B

	int vektB = 500;
	double prisB = 39.50;

    double vektprisA = (35.90/450);
    double vektprisB = (39.50/500);

     if(vektprisA <= vektprisB){
       System.out.println(" Merke A er billigere enn Merke B ");
     }else{
	   System.out.println(" Merke A er dyrere enn Merke B ");
     }
  }
}
