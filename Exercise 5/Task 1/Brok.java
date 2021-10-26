class Brok {

	int teller;
	int nevner;

	public Brok(int teller, int nevner){
		if(nevner == 0){
			throw new IllegalArgumentException( "nevner kan ikke være lik null. ");
		}
		else {
			this.teller = teller;
			this.nevner = nevner;
		}
	}

	public Brok(int teller){
		this.teller = teller;
		this.nevner = 1;
	}

	public int getTeller(){
		return teller;
	}
	public int getNevner(){
		return nevner;
	}
	public void multiplikasjon(Brok brok){
		this.teller = this.teller * brok.getTeller();
		this.nevner = this.nevner * brok.getNevner();
	}
	public void divisjon(Brok brok){
		this.teller = this.teller * brok.getNevner();
		this.nevner = this.nevner * brok.getTeller();
	}
	public void addisjon(Brok brok){

		if(this.nevner == brok.getNevner()){
			this.teller = this.teller + brok.getTeller();
			this.nevner = this.nevner;
		}
		else{
			this.teller = ((this.teller * brok.getNevner()) + (brok.getTeller() * this.nevner));
			this.nevner = this.nevner * brok.getNevner();
		}
	}
	public void subtraksjon(Brok brok){

		if(this.nevner == brok.getNevner()){
			this.teller = this.teller - brok.getTeller();
			this.nevner = this.nevner;
		}
		else{
			this.teller = ((this.teller * brok.getNevner()) - (brok.getTeller() * this.nevner));
			this.nevner = this.nevner * brok.getNevner();
		}
	}
}


