public class hanoi{
	
	static void hanoi(Stack a, Stack b, Stack c, int n){
		if(n == 1){
			a.push(c.pop());
			return;}
	
		hanoi(b,a,c,n-1);
		a.push(c.pop());
		hanoi(a,c,b,n-1);
	}


	public static void main(String[] args){
		Stack stack1 = new Stack();
		stack1.push(10);
		stack1.push(9);
		stack1.push(8);
		stack1.push(7);
		stack1.push(6);
		stack1.push(5);
		stack1.push(4);
		stack1.push(3);
		stack1.push(2);
		stack1.push(1);

		Stack stack2 = new Stack();
		Stack stack3 = new Stack();

		hanoi(stack3,stack2,stack1,10);

		while(!stack3.isEmpty()) System.out.println(stack3.pop());
	}
}