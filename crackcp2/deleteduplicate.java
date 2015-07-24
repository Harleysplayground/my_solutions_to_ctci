public class deleteduplicate{
	public static void main(String args[]){

		Node first = new Node(1);
		Node ptr;
		ptr = first;
		first.appendToTail(2);
		first.appendToTail(3);
		first.appendToTail(4);
		first.appendToTail(5);

		while(ptr != null){
		System.out.println(ptr.data);
		ptr = ptr.next;
		}
		}



}