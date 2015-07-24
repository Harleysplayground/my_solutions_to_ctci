class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int d){
		left = null;
		right = null;
		data = d;

	}

	void insert(int d){
		if(this == null)
			this = TreeNode(d);

		else if(d < this.data)
			this.left = new TreeNode(d);

		else
			this.right = new TreeNode(d);
	}
}