public class nextNode{
	public static void main(String[] args){
		BSTree tree = new BSTree();
		Node a = new Node(7);
		Node b = new Node(4);
		tree.insert(10);
/*		tree.insert(20);
		tree.insert(16);
		tree.insert(12);
		tree.insert(14);
		tree.insert(13);
		tree.insert(18);
	*/		
		tree.insertNode(a);
		tree.insertNode(b);


		System.out.println(tree.returnnext(a).data);
	}
}