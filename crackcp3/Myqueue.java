class Myqueue{
	Stack stack1;
	Stack stack2;

	public Myqueue(){
		stack1 = new Stack();
		stack2 = new Stack();
	}

	void enqueue(int d){
		stack1.push(d);
		}
	
	Object dequeue(){
		if(stack2.isEmpty()){ 
		//	System.out.println("reached");

			if(stack1.isEmpty()) return -1;
	
			while(!stack1.isEmpty()) stack2.push(stack1.pop());}
		else return stack2.pop();

		return stack2.pop();
	}
}