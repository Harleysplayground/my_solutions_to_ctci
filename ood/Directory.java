import java.util.ArrayList;

public class Directory extends Entry{
	
	private ArrayList<Entry> list;

	public Directory(Entry p, String s){
		super(p,s);
		list = new ArrayList<Entry>();
	}

	public Boolean addEntry(Entry e){
		list.add(e);
		return true;
	}

	public Boolean removeEntry(Entry e){
		if(!list.contains(e))
			return false;
		list.remove(e);
		return true;
	}

	public int numFiles(){
		int count = 0;
		for(Entry l : list){
			if(l instanceof Directory){
				count++;
				count += l.numFiles();
			} else {
				count++;
			}
		}
		return count;
	}

	public int size(){
		int size = 0;
		
		for(Entry l : list){
			if(l instanceof File){
				size += l.getSize();
			} else {
				size += l.size();
			}
		}
		return size;
	}


}