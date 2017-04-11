package binaryTree;
 
public class BinaryTree {   

	// prints in level order  
	TreeNode root;
	
	public BinaryTree(){
		root = null;
	}
	
	public void insert(int val){
		root = insert(root, val);	
	}
	
	public TreeNode insert(TreeNode root, int val){
		if(root == null){
			root = new TreeNode(val);
			return root;
		}
		if(root.val >= val)
			root.left = insert(root.left, val);
		else
			root.right = insert(root.right, val);
		return root;
	}
	
	public TreeNode search(TreeNode root, int val){

		if(root == null || root.val == val)
			return root;
		if(val < root.val)
			return search(root.left, val);
		else
			return search(root.right,val);	
	}
}  



