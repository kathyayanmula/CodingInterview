package recursion;

public class Inorder {
	
	
	public void Inorder(Node root){
		if(root == null)
			return;
		Inorder(root.left);
		System.out.println(root.val);
		Inorder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node{
	int val;
	Node left;
	Node right;
	public Node(int val){
		this.val = val;
		left = null;
		right = null;
	}
}
