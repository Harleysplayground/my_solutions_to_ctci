public class findidentical{
	public static int getHeight(Node root){
		if(root == null)
			return 0;

		if(getHeight(root.left) < getHeight(root.right))
			return getHeight(root.right)+1;
		else 
			return getHeight(root.left)+1;

	}

	public static boolean findRootInLarge(Node a, Node b){
		if(b == null) return false;
		if(a == null) return false;
		if(getHeight(a) == getHeight(b) && a.data == b.data) {	
			return compare(a,b);
		}
		return findRootInLarge(a.left,b) || findRootInLarge(a.right,b);

	}

	public static boolean compare(Node a, Node b){
		if(a == null && b == null) return true; 
		if(a.data == b.data) return true && compare(a.left, b.left) && compare(a.right, b.right);
		else return false;
	}

	public static void main(String[] args){


	BSTree large = new BSTree();
	BSTree small = new BSTree();

		Node a = new Node(10);
		Node b = new Node(3);
		Node c = new Node(15);
		Node d = new Node(1);
		Node e = new Node(4);
		Node f = new Node(13);
		Node g = new Node(20);
		Node h = new Node(9);
		Node i = new Node(5);

	//	Node u = new Node(4);
		Node v = new Node(3);
		Node w = new Node(1);
		Node x = new Node(4);
		Node y = new Node(9);
		Node z = new Node(5);


		large.insertNode(a);
		large.insertNode(b);
		large.insertNode(c);
		large.insertNode(d);
		large.insertNode(e);
		large.insertNode(f);
		large.insertNode(g);
		large.insertNode(h);
		large.insertNode(i);

	//	small.insertNode(x);
	//			small.insertNode(z);
		small.insertNode(v);
		small.insertNode(w );
		small.insertNode(x);
		small.insertNode(y);
		small.insertNode(z);

		System.out.println(findRootInLarge(a,v));


	}
}
