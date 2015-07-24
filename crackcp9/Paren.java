import java.util.HashMap;
import java.util.ArrayList;


public class Paren{

	public static ArrayList<String> ap(int N){
		ArrayList<String> list = new ArrayList<String>();

		if(N==0){
			list.add("");
			return list;
		} else {
			ArrayList<String> temp = new ArrayList<String>();
			HashMap<String,Boolean> map = new HashMap<String,Boolean>();
			temp = ap(N-1);
			for(int i=0; i<temp.size(); i++){
				int length = temp.get(i).length();
				String s = new String();
				String p = new String(temp.get(i));
				s = "()"+p;
				if(!map.containsKey(s)){
					map.put(s,true);
					list.add(s);
				}


				for(int j=1; j<length; j++){
					
					s = p.substring(0,j)+"()"+p.substring(j);
					if(!map.containsKey(s)){
						map.put(s,true);
						list.add(s);
					}
				}

				s = p+"()";
				if(!map.containsKey(s)){
					map.put(s,true);
					list.add(s);
				}
			}

			return list;
		}


	}


	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list = ap(10);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}


}