public class bitMan{
	public static void main(String[] args){
		int binary = 0b10101010;
		System.out.println("binary is: " + binary);
		int mask1 = (1 << 3) - 1;
		System.out.println("mask1: " + mask1);

		int result1 = binary&mask1;
		System.out.println("clear i-1th to 3rd bit: " + result1);

		int mask2 = mask1 ^ 0b11111111;
		int result2 = binary&mask2;
		System.out.println("clear 3rd to first bit: " + result2);
	}
}