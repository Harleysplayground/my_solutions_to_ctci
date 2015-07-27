import java.lang.Math;

public class binaryrep{

	public static String getRep(double num){
		int prevstart=0;
		int start;
		double dbstart;
		double result = 0;
		String bin = "0.";
		
		do{
			dbstart = (Math.log(num-result)/Math.log(2));
			if(dbstart == 0) 
				break;
			start = (int)dbstart;
			start--;

			result += Math.pow(2,start);

			for(int i=1;i<prevstart-start;i++){
				bin+='0';
			}
			bin+='1';
			prevstart = start;

		} while(start >= -32 && num != result);

		return bin;
	}


	public static void main(String[] args){

		String s = getRep(0.0075);
		System.out.println(s);

	}
}