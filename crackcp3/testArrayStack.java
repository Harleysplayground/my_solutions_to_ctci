public class testArrayStack{
	public static void main(String[] args){
		Arraystack stack = new Arraystack();
		stack.push_3(1);
		stack.push_3(2);
		stack.push_3(3);
		stack.push_3(4);
		stack.push_3(5);
		stack.push_3(6);
		stack.push_3(1);
		System.out.println(stack.pop_3());
		System.out.println(stack.pop_3());
		System.out.println(stack.pop_3());
		System.out.println(stack.pop_3());
		System.out.println(stack.pop_3()); 
		System.out.println(stack.pop_3());

	}
}