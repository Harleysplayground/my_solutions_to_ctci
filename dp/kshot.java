public class kshot{

// 0 1 2 3 4 5 6  7 8 9
// 5 6 2 3 8 9 1 10 2 5
//1656
//mar 24

//   0 1 2 3 4 5 6 7 8 9
// 0 X - 3 2 - - 4 - 3 0
// 1   X 4 3 - - 5 - 4 1
// 2     X - - - 1 - 0 -
// 3       X - - 2 - 1 -
// 4    	 X - 7 - 6 3
// 5		   X 8 - 7 4
// 6			 X - - -
// 7			   X 8 5
// 8				 X -
// 9				   X
//	

	static int kshot(int[] array, int n, int k, int i, int j){
		
		if(i >= n-2) return 0;
		if(k==0) return 0;
		if(j > n-1) return kshot(array, n, k, i+1, i+2);


		if(array[j] - array[i] > 0) 
			return Math.max(array[j] - array[i]+kshot(array, n, k-1, j+1, j+2), kshot(array, n, k, i, j+1));
		return kshot(array, n, k, i, j+1);
	}




	public static void main(String[] args){
		int k = 4;
		int n = 10;

		int[] array = {1,2,3,4,5,6,1,10,6,1};

		int result = kshot(array,n,k,0,1);
		System.out.println(result*1000);

	}
}