/*
Crack 1.1 Determine if a string has all unique characters
Runtime: n^3
*/

public class uniquechar{
public static boolean isunique(String string){

	int length = string.length();
	boolean unique = true;
	for(int i = 0; i < length; i++)
		for(int j = i+1; j < length; j++)
			if(string.charAt(i) == string.charAt(j)) {
				unique = false;
				break;}

	return unique;
}

public static void main(String[] args){
	String s = new String("1234567890abcdefghjiklmnopqrstuvwxyzASD");



	if(isunique(s))
		System.out.println("The string is unique");
	else 
		System.out.println("Not unique");

	System.out.println((int)s.charAt(0));
	System.out.println((int)s.charAt(1));
	System.out.println((int)s.charAt(2));
	System.out.println((int)s.charAt(3));

}
}
