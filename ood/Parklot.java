import java.util.ArrayList;
import java.util.HashMap;

public class Parklot{
	private ArrayList<Car> myList;
	private HashMap<Integer, Boolean> myLot;
	private int capacity;

	private void initLot(HashMap<Integer, Boolean> lot){
		for(int i=0; i<capacity; i++)
			lot.put(i,false);
	}

	public Parklot(){
		myList = new ArrayList<Car>();
		myLot = new HashMap<Integer, Boolean>();
		capacity = 1;
		initLot(myLot);
	}

	public Parklot(int c){
		myList = new ArrayList<Car>();
		myLot = new HashMap<Integer, Boolean>();
		capacity = c;
		initLot(myLot);
	}



	public int remain(){
		return capacity - myList.size();
	}

	public Boolean park(Car c){
		if(myList.size()>=capacity || myLot.get(c.getPos())==true)
			return false;
		myList.add(c);
		myLot.put(c.getPos(),true);
		return true;
	}

	public Boolean leave(Car c){
		if(myList.remove(c)){
			myLot.put(c.getPos(),false);
			return true;
		}
		return false;
	}

	public static void main(String[] args){

		Parklot pl = new Parklot(50);
		Car one = new Car("AE86","toyota",823472,3);
		pl.park(one);
	}

}