import java.util.LinkedList;


public class allinone{
	static void rmduplicate(Node list){
		if(list.next == null) return;

		Node current = list;
		Node runner = list;
		Node slowrunner = list;

		while(current != null){
			while(runner != null && runner.next != null){
				slowrunner = runner;
				runner = runner.next;
				if(runner.data == current.data) 
					{slowrunner.next = runner.next;
					runner = slowrunner;}
				
			}
			current = current.next;
			runner = current;
			
		}

	}

	static int findkth(Node list, int k){


		Node current = list;
		for(int i = 0; i < k; i++){
			if(current == null) return -1;
			current = current.next;
		}

		Node kth = list;
		while(current != null){
			current = current.next;
			kth = kth.next;
		}

		return kth.data;

	}

	static void partition(Node list, int value){
		Node tail = list;
		Node current = list;
		Node prev = list;
		int length = 1;
		while(tail.next != null) {	
			tail = tail.next;
			length++;
		}
		
		if(current.data > value){
			list = list.next;
			tail.next = current;
			tail = tail.next;
			current = list;
		}

		//current = current.next;

		for(int i = 0; i < length-2; i++){
			
		//	prev = prev;
			current = prev.next;
			
			if(current.data > value) {
				prev.next = current.next;
				tail.next = current;
				tail = current;
				current.next =null;
		//		current = prev.next;
			}
			else{
				prev = prev.next;
			}
		//	prev = prev.next;
		
		}

		return;
	}


	static boolean ispalindrome(Node list){
		Node slow = list;
		Node fast = list;
		Node current = list;
		int count = 0;


		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			//System.out.println(slow.data);
		}

		LinkedList<Integer> stack = new LinkedList<Integer>();
		//if(count%2 == 1) 

		slow = slow.next;
	//	System.out.println(slow.data);

		while(slow != null){
			stack.push(slow.data);
			slow = slow.next;
			count++;
		}
		//System.out.println(stack.size());
		for(int i = 0; i < count; i++){
			if(stack.pop() != current.data) return false;
			current = current.next;
			//System.out.println(stack.pop());
		}
		return true;

	}

	public static void main(String[] args){

		Node list = new Node(4);
		list.append(1);
		list.append(5);
		//list.append(8);
		list.append(5);		
		list.append(1);
		list.append(4);

		


	//	rmduplicate(list);

	//	partition(list, 4);
	//	Node current = list;
		System.out.println(ispalindrome(list));
	/*	while(current!=null) 
			{System.out.print(current.data);
			current = current.next;}*/
	}
}