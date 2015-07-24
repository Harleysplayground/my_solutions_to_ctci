public class aaaa{
    static int getsum(int rolls, int sum){
        if(rolls == 0) return 0;
        
        for(int i = 1; i < 7; i++)
            return getsum(rolls-1,sum)+i;
 		return 0;
    }


	public static void main(String[] args){

	System.out.println(getsum(2,0));
	//System.out.println(a/b);
}}