import java.util.ArrayList;

public class File extends Entry{

	private String content;
	private int size;

	public File(Entry p, String s, int sz){
		super(p,s);
		size = sz;
	}

	public int getSize(){
		return size;
	}
}