public class permutation13{
public static boolean ispermut(String one, String other){
		if(one.length() != other.length()) return false;

		int[] asitable = new int[256];

		for(int i = 0; i < 256; i++) asitable[i] = 0;

		for(int i = 0; i < one.length(); i++)
		asitable[(int)one.charAt(i)]++;

		for(int i = 0; i < other.length(); i++)
		{asitable[(int)other.charAt(i)]--;
		if(asitable[(int)other.charAt(i)] < 0)
			return false;}

		return true;
}


public static void main(String[] args){
		String one = new String("137");
		String other = new String("371");
		if(ispermut(one,other))
			System.out.println("permutation");
		else
			System.out.println("not permutation");
}
}