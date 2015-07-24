import java.util.*;

public class path{
	public static void main(String[] args){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(3);
		queue.add(5);
		queue.add(7);

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		
	}
}