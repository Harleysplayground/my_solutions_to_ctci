public class checkBST{
	public static void main(String[] args){

		BSTree tree = new BSTree();

/*
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);*/

		tree.falseBST();

		System.out.println(tree.checkBST());
	}
}