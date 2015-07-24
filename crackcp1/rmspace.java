/* remove space from a string and replace all the spaces 
*  between two characters by %20 */

public class rmspace{
	public static char[] remove(char[] chr, int length){
		
		
		int countspace = 0;
		int newlength;

		for(int i = 0; i < length; i++)
			if(chr[i] == ' ') countspace++;
		
		newlength = length + countspace * 2;
		
		chr[newlength] = '\0';

		for (int a = length-1; a > 0; a--) 
		{	
			if(chr[a] == ' ') 
				{chr[newlength - 1] = '0';
				 chr[newlength - 2] = '2';
				 chr[newlength - 3] = '%';
				 newlength = newlength - 3;
				}
			else
				{chr[newlength - 1] = chr[a];
				 newlength--;	}
		}
		return chr;
	}



	public static void main(String[] args){
		char[] chr = {'h','a','r',' ',' ','l','e','y',' ',' ',' ',' ',' ',' '};	
		remove(chr,8);
		System.out.println(chr);
	}
}