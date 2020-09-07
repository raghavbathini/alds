package interview.persistent;

class TreeNode {
	  TreeNode left;
	  TreeNode right;
	  int data;
	}

	class BST {
	  
	  public TreeNode insert(TreeNode node, int val) {
	    if(node == null) {
	      return createNewTreeNode(val);
	    }
	    
	    if(val < node.data) {
	      node.left = insert(node.left, val);
	    } else if((val > node.data)) {
	      node.right = insert(node.right, val);
	    }
	    
	    return node;
	  }
	  
	  public TreeNode createNewTreeNode(int k) {
	    TreeNode a = new TreeNode();
	    a.data = k;
	    a.left = null;
	    a.right = null;
	    return a;
	  }
	}

	public class BSTApp {

	  public static void main(String[] args) {
	    BST a = new BST();
	    TreeNode root = null;
	    
	    root = a.insert(root, 8);
	    root = a.insert(root, 3);
	    root = a.insert(root, 6);
	    root = a.insert(root, 10);
	    root = a.insert(root, 4);
	    root = a.insert(root, 7);
	    root = a.insert(root, 1);
	    root = a.insert(root, 14);
	    root = a.insert(root, 13);
	    
	  }

	}
