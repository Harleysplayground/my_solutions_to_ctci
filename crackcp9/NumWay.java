public class NumWay{

	public static int makeChange(int n, int o, int p, int q){

		if(n>0&&n<25)
			if(n<10)
				if(n<5)
					return makeChange(0,0,0,n);
				else 
					return makeChange(0,0,n,0);
			else 
				return makeChange(0,n,0,0);	

		if(o>0&&o<10)
				if(o<5)
					return makeChange(0,0,0,o);
				else 
					return makeChange(0,0,o,0);
			
		if(p>0&&p<5)
					return makeChange(0,0,0,p);
				

		if(n+o+p==0)
			return 1;

		int numQuarter=0;
		int numDime=0;
		int numCinq=0;
		int numCent=0;
		int sum=0;

		if(n>0)
			numQuarter = n/25;
		if(o>0)
			numDime = o/10;
		if(p>0)
			numCinq = p/5;
		if(q>0)
			numCent = q;


		if(numQuarter>0)
			for(int i=0; i<=numQuarter; i++){
				sum+=makeChange(0,n-25*i,0,0);
			}
		else if(numDime>0)
			for(int i=0; i<=numDime; i++){
				sum+=makeChange(0,0,o-10*i,0);
			}	
		else if(numCinq>0)
			for(int i=0; i<=numCinq; i++){
				sum+=makeChange(0,0,0,p-5*i);
			}	
		else if(numCent>0)
			for(int i=0; i<=numCent; i++){
				sum=numCent;
			}	
		else sum = 0;

		return sum;
	}

	public static void main(String[] args){
		for(int i=0; i<100; i++)
		System.out.println(i+" value is: "+makeChange(i,0,0,0));
	}
}