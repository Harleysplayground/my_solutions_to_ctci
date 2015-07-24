public class bubblesort{

	public static void bubble(int[] a){
		for(int i = 1; i < a.length; i++){
			for(int j = 0; j < a.length-1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			}
		}
	}

	public static void main(String[] args){
		int[] a = {3,5,1,7,10,20};
		bubble(a);

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}