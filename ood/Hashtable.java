import java.util.LinkedList;

public class Hashtable{
	private LinkedList<Cell>[] mlist;
	private int msize;

	public Hashtable(int size){
		msize = size;
		mlist = new LinkedList<Cell>[msize];
	}

	private int HashCode(String k){
		return k.length() % msize;
	}

	public void put(String k, int v){
		int realvalue = HashCode(k);

		Cell c = new Cell(k, realvalue);
		mlist[realvalue].add(c);
	}

	public int get(String k){
		int realvalue = HashCode(k);
		if(mlist[realvalue].size()==0)
			return -1;

		for(Cell c:mlist[realvalue])
			if(c.getKey().equals(k))
				return c.getValue();
			
/*
DO NOT USE THIS
		int i=0;
		while(mlist[realvalue].get(++i)){
			if(mlist[realvalue].get(i).getKey().equals(k))
				return mlist[realvalue].get(i).getValue();
		}
		return -1;
*/
	}
}