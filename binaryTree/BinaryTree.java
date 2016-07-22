package binaryTree;


import java.util.Queue;  
import java.util.LinkedList;  
<<<<<<< HEAD
import java.util.Stack;
public class BinaryTree {  
  
   
 public static class TreeNode  
 {  
  int data;  
  TreeNode left;  
  TreeNode right;  
  TreeNode(int data)  
  {  
   this.data=data;  
  }  
 }  
   
// prints in level order  
 public static void levelOrderTraversal(TreeNode startNode) {  
  Queue<TreeNode> queue=new LinkedList<TreeNode>();  
  queue.add(startNode);  
  int levelSize = 0;
  while(!queue.isEmpty())  
  {  levelSize = queue.size();
	  while(levelSize > 0){
   TreeNode tempNode=queue.poll();  
   System.out.printf("%d ",tempNode.data);
   if(tempNode.left!=null)  
    queue.add(tempNode.left);  
   if(tempNode.right!=null)  
    queue.add(tempNode.right);
   levelSize--;
	  }
	  System.out.println();
  }  
 }  
 public static void main(String[] args)  
 {  
  BinaryTree bi=new BinaryTree();  
  // Creating a binary tree  
  TreeNode rootNode=createBinaryTree();  
  System.out.println("Level Order traversal of binary tree will be:");  
  levelOrderTraversal(rootNode);  
 }  
   
 public static TreeNode createBinaryTree()  
 {  
    
  TreeNode rootNode =new TreeNode(40);  
  TreeNode node20=new TreeNode(20);  
  TreeNode node10=new TreeNode(10);  
  TreeNode node30=new TreeNode(30);  
  TreeNode node60=new TreeNode(60);  
  TreeNode node50=new TreeNode(50);  
  TreeNode node70=new TreeNode(70);  
    
  rootNode.left=node20;  
  rootNode.right=node60;  
    
  node20.left=node10;  
  node20.right=node30;  
    
  node60.left=node50;  
  node60.right=node70;  
    
  return rootNode;  
 }  
=======
public class BinaryTree {  


	public static class TreeNode  
	{  
		int data;  
		TreeNode left;  
		TreeNode right;  
		TreeNode(int data)  
		{  
			this.data=data;  
		}  
	}  

	// prints in level order  
	public static void levelOrderTraversal(TreeNode startNode) {  
		Queue<TreeNode> queue=new LinkedList<TreeNode>();  
		queue.add(startNode);  
		int levelSize = 0;
		while(!queue.isEmpty())  
		{  levelSize = queue.size();
		while(levelSize > 0){
			TreeNode tempNode=queue.poll();  
			System.out.printf("%d ",tempNode.data);
			if(tempNode.left!=null)  
				queue.add(tempNode.left);  
			if(tempNode.right!=null)  
				queue.add(tempNode.right);
			levelSize--;
		}
		System.out.println();
		}  
	}  
	public static void main(String[] args)  
	{  
		//BinaryTree bi=new BinaryTree();  
		// Creating a binary tree  
		TreeNode rootNode=createBinaryTree();  
		System.out.println("Level Order traversal of binary tree will be:");  
		levelOrderTraversal(rootNode);  
	}  

	public static TreeNode createBinaryTree()  
	{  

		TreeNode rootNode =new TreeNode(40);  
		TreeNode node20=new TreeNode(20);  
		TreeNode node10=new TreeNode(10);  
		TreeNode node30=new TreeNode(30);  
		TreeNode node60=new TreeNode(60);  
		TreeNode node50=new TreeNode(50);  
		TreeNode node70=new TreeNode(70);  

		rootNode.left=node20;  
		rootNode.right=node60;  

		node20.left=node10;  
		node20.right=node30;  

		node60.left=node50;  
		node60.right=node70;  

		return rootNode;  
	}  
>>>>>>> 1a488dda4e60c597a8ed368c8ab560aa87173cef
}  


