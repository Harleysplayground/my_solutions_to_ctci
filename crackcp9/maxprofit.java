import java.lang.Math;

public class maxprofit{


	public static int dc(int[] ps, int left, int right, boolean buy){
	
		if(right == left)
			return ps[left];

		int r = ps[left];

		for(int i=left+1; i<=right; i++){
			if(buy){
				if(r > ps[i])
					r = ps[i];
			} else {
				if(r < ps[i])
					r = ps[i];
			}

		}
		
		return r;

	}

	public static int divide_conquer(int[] ps, int left, int right){		
		if(right == left)
			return -1;

		int mid = (right+left)/2;

		int p = dc(ps,mid,right,false) - dc(ps,left,mid,true);
		System.out.println("left is "+left+"right is "+right+"p is "+p);
	
		int m = Math.max(divide_conquer(ps,left,mid), divide_conquer(ps,mid+1,right));
		return Math.max(m,p);
	}

	public static void main(String[] args){
		int[] ps = {310,315,275,295,260,270,290,230,255,250};

		System.out.printf("%d\n",divide_conquer(ps,0,9));
	}
}