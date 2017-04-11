package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public void levelOrder(TreeNode startNode) {  
		Queue<TreeNode> queue=new LinkedList<TreeNode>();  
		queue.add(startNode);  
		int levelSize = 0;
		while(!queue.isEmpty())  
		{  levelSize = queue.size();
		while(levelSize > 0){
			TreeNode tempNode=queue.poll();  
			System.out.printf("%d ",tempNode.val);
			if(tempNode.left!=null)  
				queue.add(tempNode.left);  
			if(tempNode.right!=null)  
				queue.add(tempNode.right);
			levelSize--;
		}
		System.out.println();
		}  
	}  
	public static void main (String[] args) throws java.lang.Exception
	{
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.right.left = new TreeNode(30);
		root.right.right = new TreeNode(35);
		
		LevelOrderTraversal i  = new LevelOrderTraversal();
		System.out.println(" Output by Better Approach : ");
		i.levelOrder(root);
	}
}

