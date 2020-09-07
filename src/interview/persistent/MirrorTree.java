package interview.persistent;

class TreeNode2
{
	int data;
	TreeNode2 left = null;
	TreeNode2 right = null;

	TreeNode2(int data) {
		this.data = data;
	}
}

class MirrorTree
{
	// Function to perform preorder traversal of the binary tree
	public static void preorder(TreeNode2 root)
	{
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	// Function to convert given binary Tree to its mirror
	public static void convertToMirror(TreeNode2 root)
	{
		// base case: if tree is empty
		if (root == null) {
			return;
		}

		// convert left subtree
		convertToMirror(root.left);

		// convert right subtree
		convertToMirror(root.right);

		// swap left subtree with right subtree
		TreeNode2 temp = root.left;
		root.left =  root.right;
		root.right = temp;
	}

	public static void main(String[] args)
	{
		/* Construct below tree
	          1
	        /   \
	       /     \
	      2       3
	     / \     / \
	    4   5   6   7   */

		TreeNode2 root = new TreeNode2(1);
		root.left = new TreeNode2(2);
		root.right = new TreeNode2(3);
		root.left.left = new TreeNode2(4);
		root.left.right = new TreeNode2(5);
		root.right.left = new TreeNode2(6);
		root.right.right = new TreeNode2(7);
		preorder(root);
		System.out.println();
		convertToMirror(root);
		preorder(root);
	}
}
