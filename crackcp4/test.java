public class test{
	public static void main(String[] args){
		TreeNode tree = new TreeNode(5);
		tree.insert(4, tree);


	}



	public static class TreeNode{
		public int data;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int d){
			left = null;
			right = null;
			data = d;
		}

		public void insert(int t, TreeNode root){
			if(root == null){
				root = new TreeNode(t);
			}

			if(t <= root.data) insert(t,root.left);
			else root.right.insert(t,root.right);

		}
	}

}

