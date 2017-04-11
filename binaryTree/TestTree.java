package binaryTree;

import java.util.Random;

public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		
		Random rand = new Random();
		for(int i = 1; i<= 10; i++){
			int num = rand.nextInt(20);
			System.out.print("number " + num + " ");
			tree.insert(num);
		}
		System.out.println();
		LevelOrderTraversal levelOrder = new LevelOrderTraversal();
		levelOrder.levelOrder(tree.root);
		
	}

}
