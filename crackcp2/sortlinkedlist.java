public class sortlinkedlist{
	public static Node partition(Node head, int i){
		Node ptr = head;
		Node temp = head;
		
		while(ptr.next != null)
		{  

			if(ptr != head && ptr.data < i) 
				{
				temp.next = ptr.next;
				ptr.next = head; 
				head = ptr;
				ptr = temp;
				}
			temp = ptr;
			ptr = ptr.next;
		}

		return head;
	}

	public static void main(String[] args){
		Node head = new Node(3);
		head.appendToTail(1);
		head.appendToTail(5);
		head.appendToTail(2);
		head.appendToTail(10);
		head.appendToTail(7);
		head.appendToTail(2);
		head.appendToTail(4);
		head.appendToTail(11);

		

		head = partition(head,10);

		Node ptr = head;
		while(ptr != null){
		System.out.println(ptr.data);
		ptr = ptr.next;}
		
	}
}