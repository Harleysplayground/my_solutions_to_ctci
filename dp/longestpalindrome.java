public class longestpalindrome{


	static int lp(int[] a, int left, int right){
		if(left == right) return 1;
		if(left == right-1 && a[left] == a[right]) 
			return 2;

		if(a[left] == a[right]) return 2+lp(a,left+1,right-1);
		else return java.lang.Math.max(lp(a,left,right-1),lp(a,left+1,right));


	}


	public static void main(String[] args){
		int[] array = {6,5,3,4,7,2,8,43,2,5,6,19};  //6 5 2 8 2 5 6

		System.out.println("The length is "+lp(array,0,array.length-1));

	}
}