public class compressstring{
	public String compress(String origin){
		int count = 0;
		char temp = origin.charAt(0);
		for(int a = 1; a < origin.length(); a++)
		{	if(temp == origin.charAt(a))
			{
				count++;
			}
			else{
				
			}



		}

	}




	public static void main(String[] args){
		String origin = new String("hhhhhhhaaaaaaarrrrrrrlleyyyy");
		compress(origin);
		System.out.println(origin);
	}


}