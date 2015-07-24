class Stackwmin{
	Node top;
	int min;

	void push(int d){
		if(top == null) min = d;
		else if(d < min) min = d;


		Node temp = new Node(d);
		temp.next = top;
		top = temp;

	}
}