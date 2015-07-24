public class uniquechar1{

	public boolean hasUn(String input){

		int[] array = new int[256];
		for(int i=0; i<input.length(); i++){
			if(array[input.charAt(i)]==1)
				return false;
			array[input.charAt(i)]=1;
		}
		return true;

	}

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	//b: checkout:00000010
	//c: checkout:00000110
	//d-a=3: 


	public static void main(String[] a){
		String input1 = new String("this is harley");
		String input2 = new String("this nou");

		System.out.println(isUniqueChars(input1));
		System.out.println(isUniqueChars(input2));

		System.out.println(isUniqueChars("bcd"));	

		System.out.println(1<<3);	
	}
}