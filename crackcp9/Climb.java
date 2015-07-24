public class Climb{
	public static int climb(int n){
		if(n<=1) return 1;
		if(n==2) return 2; 
		if(n==3) return 4;

		return climb(n-1)+climb(n-2)+climb(n-3);
	}

	public static int climb_dp(int n, int[] numStep){
		if(numStep[n]==0) 
			numStep[n] = climb_dp(n-1,numStep)+climb_dp(n-2,numStep)+climb_dp(n-3,numStep);
		return numStep[n];
	}

	public static void main(String[] args){
		int N = 34;
		//System.out.println(climb(N));

		int[] numStep = new int[N+1];
		numStep[1]=1;
		numStep[2]=2;
		numStep[3]=4;
		System.out.println(climb_dp(N,numStep));
	}
}