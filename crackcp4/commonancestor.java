public class commonancestor{

	public static boolean covers(Node a, Node p){
		if(a == null) return false;
		if(a == p) 	return true;

		return covers(a.left,p) || covers(a.right,p);
	}

	public static Node ancestor(Node a, Node p, Node q){
		if(a == p && a == q) return a;


		if(covers(a.left,p) == true && covers(a.left,q) == true)
			return ancestor(a.left,p,q);
		else if(covers(a.right,p) == true && covers(a.right,q) == true)
			return ancestor(a.right,p,q);
		else if(covers(a.left,p) == true && covers(a.right,q) == true)
			return a;

		else return null;

	}

	public static void main(String[] args){
		BSTree tree = new BSTree();
		Node a = new Node(10);
		Node b = new Node(3);
		Node c = new Node(15);
		Node d = new Node(1);
		Node e = new Node(4);
		Node f = new Node(13);
		Node g = new Node(20);
		Node h = new Node(9);
		Node i = new Node(5);


		tree.insertNode(a);
		tree.insertNode(b);
		tree.insertNode(c);
		tree.insertNode(d);
		tree.insertNode(e);
		tree.insertNode(f);
		tree.insertNode(g);
		tree.insertNode(h);
		tree.insertNode(i);
		//tree.insertNode(j);
		//tree.insertNode(k);


		System.out.println(ancestor(a,d,i).data);
	}
}