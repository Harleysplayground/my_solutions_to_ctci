public class testmyqueue{
	public static void main(String[] args){
		Myqueue q = new Myqueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(5);
		q.enqueue(3);
		q.enqueue(5);

		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}