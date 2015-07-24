public class Subset{
	public static String printsub(String s,int x){
		if(x>s.length()-1)
			return "";
		String s1 = new String();
		String s2 = new String();
		s1 += printsub(s,x+1);
		s2 += printsub(s,x+1)+s.charAt(x);
		System.out.print(s1);	
		System.out.print(s2);

		return s1;

	}

	public static void main(String[] args){
		String s = new String("harley");
		printsub(s,0);
	}
}