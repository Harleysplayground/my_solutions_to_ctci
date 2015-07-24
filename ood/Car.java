public class Car{
	private String name;
	private String type;
	private int plateNum;
	private int position;

	public Car(String n, String t, int p, int pos){
		name = n;
		type = t;
		plateNum = p;
		position = pos;
	}

	public int getPos(){
		return position;
	}
}