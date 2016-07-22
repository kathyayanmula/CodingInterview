package binaryTree;

public class MirrorTree {
	
	public void mirrorImage(Node root){
		if(root == null)
			return;
		
		mirror(root);
		
	}
	
	public Node mirror(Node root){	
		if(root == null)
			return null;
		Node left = mirror(root.left);
		Node right = mirror(root.right);
		
		Node temp = left;
		root.left = right;
		root.right = temp;
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
