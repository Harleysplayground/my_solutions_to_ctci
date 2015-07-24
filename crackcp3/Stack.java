class Stack{
	Node top;

	void push(int data){
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
	}

	int pop(){
		if(top != null){
			Node temp = top;
			top = top.next;
			return temp.data;}
		return -2;}

	int peek(){
		return top.data;
	}

	boolean isEmpty(){
		if(top != null) return false;
		else return true;
	}

}