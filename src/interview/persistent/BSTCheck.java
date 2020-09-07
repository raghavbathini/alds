package interview.persistent;

class TreeNode1 {
	  TreeNode1 left;
	  TreeNode1 right;
	  int data;
	}

	class BinaryTree {

	  TreeNode1 prev = null;

	  public boolean isTreeBST(TreeNode1 node) {
	    if (node == null) {
	      return true;
	    }

	    if (!isTreeBST(node.left)) {
	      return false;
	    }

	    if (prev != null && node.data < prev.data) {
	      return false;
	    }

	    prev = node;
	    
	    return isTreeBST(node.right);
	  }

	  public TreeNode1 createNewTreeNode1(int val) {
	    TreeNode1 newTreeNode1 = new TreeNode1();
	    newTreeNode1.data = val;
	    newTreeNode1.left = null;
	    newTreeNode1.right = null;
	    return newTreeNode1;
	  }
	}

	public class BSTCheck {

	  public static void main(String[] args) {

	    BinaryTree a = new BinaryTree();

	    TreeNode1 root = a.createNewTreeNode1(12);
	    root.left = a.createNewTreeNode1(7);
	    root.left.left = a.createNewTreeNode1(6);
	    root.left.left.left = a.createNewTreeNode1(2);
	    root.left.right = a.createNewTreeNode1(9);
	    root.left.right.left = a.createNewTreeNode1(8);
	    root.right = a.createNewTreeNode1(24);

	    System.out.println(a.isTreeBST(root));

	  }
	}