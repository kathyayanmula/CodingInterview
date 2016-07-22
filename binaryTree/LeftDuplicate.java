package binaryTree;

public class LeftDuplicate {

	
	public Node duplicate(Node root){
		if(root == null)
			return null;
		duplicate(root.left);
		duplicate(root.right);
		
		Node temp = root.left;
		root.left = new Node(root.data);
		root.left.left = temp;
		
		return root;
	}
	
}
