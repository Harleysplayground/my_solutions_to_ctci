import java.util.Stack;

public class palindrome{


	public static boolean isPalindrome(Node ptr){
		Stack<Integer> stack = new Stack<Integer>();

		Node slow = ptr;
		Node fast = ptr;
	
		stack.push(slow.data);
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			stack.push(slow.data);
		}

		if(fast.next == null){
			stack.pop();
			slow = slow.next;
			while(slow != null){
				if(stack.pop() != slow.data) return false;

				slow = slow.next;
			}
			return true;
		}

		if(fast.next.next == null){
			slow = slow.next;
			while(slow != null){
				if(stack.pop() != slow.data) return false;
				slow = slow.next;
			}
			return true;
		}
	
		return false;
	}


	public static void main(String[] args){
		
		Node head = new Node(3);
		head.appendToTail(2);
		//head.appendToTail(2);
		head.appendToTail(2);
		head.appendToTail(2);
		head.appendToTail(3);

		System.out.println(isPalindrome(head));
	}
}