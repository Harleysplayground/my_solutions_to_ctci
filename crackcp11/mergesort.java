public class mergesort{
	public static void divde(int[] a){
		
		int[] temp = new int[];
		divide(a, temp, 0, a.length-1);


	}

	public static void divide(int[] a, int[] temp, int begin, int end){
		if(end > begin + 1){
			int mid = (end + begin)/2;
			divide(a,temp,0,mid);
			divide(a,temp,mid+1,end);
		}

		merge()
	}

	public static void main(String[] args){
		int[] a = {3,5,1,7,10,20};
		merge(a);

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}