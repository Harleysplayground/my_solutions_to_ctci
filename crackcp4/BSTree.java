import java.util.LinkedList;
import java.util.ArrayList;

class BSTree{
	public Node root;


	public int getRootVal(){
		return root.data;
	}

	protected void print(Node root){
		if(root != null){
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}



	protected Node insert(int d, Node root){
		if(root == null)
			root = new Node(d);

		else if(d < root.data){
			root.left = insert(d,root.left);
			root.left.parent = root;}

		else{
			root.right = insert(d,root.right);
			root.right.parent = root;}

		return root;
	}


	protected int isBalanced(Node root){
		if(root == null) return 1;
			
		int def = getHeight(root.left) - getHeight(root.right);
	
		if(def > 1 || def < -1) return 0;
		else return isBalanced(root.left)*isBalanced(root.right);	
	}

	protected int getHeight(Node root){
		if(root == null)
			return 0;

		if(getHeight(root.left) < getHeight(root.right))
			return getHeight(root.right)+1;
		else 
			return getHeight(root.left)+1;

	}

	protected void createList(Node root, ArrayList<LinkedList<Integer>> lists, int depth){
		if(root == null) return;
	//	System.out.println(depth);
		lists.get(depth).addLast(root.data);
		createList(root.left, lists, depth+1);
		createList(root.right, lists, depth+1);
	}

	protected Node falseBST(Node root){
		root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(50);
	//	root.right.left = new Node(5);
		root.left.right = new Node(30);
		return root;
	}
	
	public static int lastInt = -1;


	protected boolean checkBST(Node root){
		if(root == null) return true;
		
		if(!checkBST(root.left)) return false;

		if(lastInt!=-1 && lastInt >= root.data)
			return false;
		lastInt = root.data;

		if(!checkBST(root.right)) return false;

		return true;


/*


		if(root == null) return true;

		if(root.left == null && root.right == null) return true;
				
		if(root.left == null) return root.data<root.right.data && checkBST(root.right);
			
		if(root.right == null) return root.left.data<root.data && checkBST(root.left);
				
		return checkBST(root.left) && checkBST(root.right);

*/
	}


	protected Node insertNode(Node d, Node root){
		if(root == null)
			root = d;

		else if(d.data < root.data){
			root.left = insertNode(d,root.left);
			root.left.parent = root;}

		else{
			root.right = insertNode(d,root.right);
			root.right.parent = root;}

		return root;
	}

	public boolean checkBST(){
		return checkBST(root);
	}

	public void createList(ArrayList<LinkedList<Integer>> lists, int depth){
		createList(root, lists, depth);	
	}

	public void print(){
		print(root);
	}

	public void insert(int d){
		root = insert(d,root);
	}

	public void insertNode(Node d){
		root = insertNode(d,root);
	}

	public Node getSuccessor(Node a){
		if(a.left != null)

		return getSuccessor(a.left);
		return a;
	

	}

	public Node returnnext(Node a){
		if(a.right == null) return null;
		return getSuccessor(a.right);
	}


	public void falseBST(){
		root = falseBST(root);
	}


	public boolean isBalanced(){
		if(isBalanced(root) == 1) return true;
		else return false;
	}

	public int getHeight(){
		return getHeight(root);
	}
}