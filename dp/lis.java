public class lis{
	static int lis(int[] array, int ind, int prev){
		if(ind >= array.length) return 0;



		if(array[ind] > prev){
			return Math.max(1+lis(array,ind+1,array[ind]),lis(array,ind+1,prev));
		}
		else 
			return lis(array,ind+1,prev);



	}


	static 
	int dp(int[] array){
		int[] mem = new int[array.length];
		for(int i = array.length-1; i >=0; i--){
			mem[i] = 1;
			for(int j = array.length-1; j >= i; j--){
				if(array[j]>array[i]&&mem[j]+1>mem[i]) mem[i] = mem[j]+1;

			}
		}

		int max = -1;
		for(int i = 0; i < array.length;i++){
			if(mem[i] > max) max = mem[i];
		}

		return max;
	}


	public static void main(String[] args){
		int[] array = {6,1,4,2,9,3,11,14,4,50,6,7,10};
		System.out.println(dp(array));
	}
}