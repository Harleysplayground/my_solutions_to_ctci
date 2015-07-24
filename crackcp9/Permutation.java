import java.util.ArrayList;
import java.io.*;

public class Permutation{

	public static ArrayList<String> perm(String s){

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> re = new ArrayList<String>();
		if(s.length()==0){
			re.add("");
			return re;
		} else {
			char first = s.charAt(0);
			String sub = s.substring(1);
			list = perm(sub);
			for(int i = 0; i < list.size(); i++){
				String temp = list.get(i);
				re.add(first+temp);
				for(int j = 1; j <= temp.length()-1; j++){
					re.add(temp.substring(0,j)+first+temp.substring(j));
				}
				if(!temp.equals(""))
					re.add(temp+first);

			}

			return re;

		}



	}

	public static void main(String[] args){
		String s = new String();
		s += "abc";

		ArrayList<String> result = new ArrayList<String>();
		result = perm(s);

		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}

	}
}