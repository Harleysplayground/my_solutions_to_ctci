public class Addition{
	public static int Add(Node head, Node tail)
	{
		if(head == null && tail == null)
			return 0;
		return Add(head.next,tail.next)+head.data+tail.data;

	}



	public static void main(String[] args)
	{
		Node head = new Node(6);
		head.append(1);
		head.append(7);

		Node tail = new Node(2);
		tail.append(9);
		tail.append(5);

		int sum = Add(head, tail);
		System.out.println(sum);
	}
}


