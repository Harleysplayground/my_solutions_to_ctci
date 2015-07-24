public class fibo{


	static int fibonaci_wm(int n, int[] mem){
		if(n < 2) return n;

		if(mem[n] == 0)
			mem[n] = fibonaci_wm(n-1,mem)+fibonaci_wm(n-2,mem);
		return mem[n];
	}


	static int fibonaci(int n){
		if(n < 2) return n;
		return fibonaci(n-1)+fibonaci(n-2);
	}


	public static void main(String[] args){
		long startTime = System.currentTimeMillis();


		int[] mem = new int[30];

		for(int i = 0; i < 30; i++)
			System.out.print(fibonaci_wm(i,mem)+" ");

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("total time is :" +totalTime);
	}
}