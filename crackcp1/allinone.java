public class allinone{
	static boolean isUnique(String str){
		int ascii[] = new int[256];
		int i = 0;
		for(i = 0; i < str.length(); i++){
			if(ascii[str.charAt(i)] == 1) return false;

			ascii[str.charAt(i)] = 1;
		}
		return true;
	}

	static boolean isPermutation(String str, String otherstr){
		
		if(str.length() != otherstr.length()) return false;
		int i;
		int ascii[] = new int[256];
		for(i = 0; i < str.length(); i++)
		{	
			ascii[str.charAt(i)]++;
			ascii[otherstr.charAt(i)]--;
		}
		for(i = 0; i < 256; i++){
			if(ascii[i] != 0) return false;

		}
		return true;
	}

	static void replacespace(char[] string, int length){
		int leng;
		int spacecount = 0;
		int i;
		for(i = 0; i < length; i++)
			if(string[i] == ' ') spacecount++;

		System.out.println(spacecount);
		int newlength = length + 2*spacecount - 1;
		System.out.println(newlength);
		for(leng = length - 1 ; leng>-1; leng--){
			if(string[leng] == ' '){
				string[newlength] = '0';
				string[newlength-1] = '2';
				string[newlength-2] = '%';
				newlength -= 3;
			//	leng -= 1;
			}
			else{
				string[newlength] = string[leng];
				newlength = newlength-1;
			//	leng = leng-1;

			}

		}

	}



	static String compress(String str){
		StringBuffer buffer = new StringBuffer();
		char prev = str.charAt(0);
		int count = 1;
		int i;


		for(i = 1; i < str.length(); i++){
			if(str.charAt(i) =='\0'){
				buffer.append(prev);
				buffer.append(count);
				break;
			}

			if(str.charAt(i) != prev){
				buffer.append(prev);
				buffer.append(count);
				prev = str.charAt(i);
				count = 0;
			} 

			count++;
		}

		if(buffer.length() > str.length()-1)
			return str;
		else{
			return buffer.toString();
		}
	}

	static void rotate2d(int[][] array){


	}

	public static void main(String[] args){
		String str = "a\0";
		String str2= "ashleyharlea";
		
		String  newstr = "harley is a   genius               ";
		char[] string = newstr.toCharArray();

		int[][] matrix = {{1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5}};

		rotate2d(matrix);
		//replacespace(string,20);
		//isUnique(str);

		//compress(str);
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(matrix[i][j]);
			}	
			System.out.println();
		}
		
	}
}