/* my algorithm uses recursion; while the book's algorithn only contains two while loops */



public class ascending{
	static void sort(Stack stack1, Stack temp){
		if(!stack1.isEmpty() && !temp.isEmpty()){
				if(stack1.peek() < temp.peek()){
					int sth = temp.pop();
					sort(stack1,temp);
					if(temp.isEmpty()) 	temp.push(stack1.pop());
					temp.push(sth);
				}
				else temp.push(stack1.pop());
				
		}
	}

	public static void main(String[] args){
		Stack stack1 = new Stack();
		stack1.push(5);
		stack1.push(1);
		stack1.push(2);
		stack1.push(4);
		stack1.push(3);
		stack1.push(51);
		stack1.push(0);
		stack1.push(7);
		stack1.push(10);
		stack1.push(9);

		Stack temp = new Stack();
		temp.push(stack1.pop());


		
		while(!stack1.isEmpty()) sort(stack1,temp);

		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());
		System.out.println(temp.pop());


	}
}