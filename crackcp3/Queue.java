class Queue{
	Node first;
	Node last;

	Object dequeue(){
		if(last != null){
			Node temp = first;
			first = first.next;
			return temp.data;}
		return null;
	}

	void enqueue(int d){
		if(last == null)
			{last = new Node(d);
			 first = last;}
		else{
		last.next = new Node(d);
		last = last.next;}
	}
}