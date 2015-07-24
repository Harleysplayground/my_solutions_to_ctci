public class teststack{
	public static void main(String[] args){
		Queue stack = new Queue();
		stack.enqueue(3);
		stack.enqueue(2);
		stack.enqueue(1);
		stack.enqueue(54);
		stack.enqueue(5);
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());		
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
	}
}