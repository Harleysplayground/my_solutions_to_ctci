public class matrixzero{
	public static void setzero(int[][] matrix){
		int[] arrayi = new int[5];
		int[] arrayj = new int[5];
		int counti = 0; 
		int countj = 0;

		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
			{
				if(matrix[i][j]==0){
					arrayi[counti] = i;
					arrayj[countj] = j;
					counti++;
					countj++;
				}
			}

		for(int i = 0; i < counti; i++)
		{
			for(int x = 0; x < 5; x++)
				matrix[x][arrayi[i]] = 0;
			for(int y = 0; y < 5; y++)
				matrix[arrayj[i]][y] = 0;
		}


	}


	public static void main(String[] args){
		int[][] matrix = new int[][]
		{{0,2,3,4,5},
		{6,7,8,9,10},
		{11,12,0,14,15},
		{16,17,18,19,20},
		{1,2,3,6,0}};
		setzero(matrix);

		for(int i = 0; i <5; i++)
		{	for(int j=0; j<5; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(' ');

			}
		System.out.println();
		}
	}
}