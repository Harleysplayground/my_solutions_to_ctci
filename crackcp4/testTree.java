public class testTree{





	public static void main(String[] args){
		BSTree tree = new BSTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);	

		tree.insert(12);	
	//	tree.insert(11);
		tree.insert(16);	
		//tree.print();
		System.out.println(tree.isBalanced());

	}
}