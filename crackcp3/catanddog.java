class Animals{
 
	private int order;

	public void setOrder(int d){
		order = d;
	}

	public int getOrder(){
		return this.order;
	}
}

class Cats extends Animals{
	private int catsorder;

	public void setOrder(int d){
		catsorder = d;
	}

	public int getOrder(){
		return this.catsorder;
	}

}

class Dogs extends Animals{
	private int dogsorder;


	public void setOrder(int d){
		dogsorder = d;
	}

	public int getOrder(){
		return this.dogsorder;
	}

}