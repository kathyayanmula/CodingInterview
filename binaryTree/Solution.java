package binaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	static int index = 0;
	
	class TreeNode {
	    int value;
		int count;
		TreeNode left;
		TreeNode right;
		

		public TreeNode(int value, int count){
			this.value = value;
			this.count = count;
			left = null;
			right = null;
		}

		
		public TreeNode getleft() {
			return left;
		}

		public void setleft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getright() {
			return right;
		}

		public void setright(TreeNode right) {
			this.right = right;
		}
		
		public void insert(int val, int count){
			if(val < this.value){
				if(this.left == null)
					this.setleft(new TreeNode(val, count));
				else
					this.left.insert(val, count);
			}
				
			else if(val > this.value){
				if(this.right == null)
					this.setright(new TreeNode(val, count));
				else
					this.right.insert(val, count);
			}
		}
	}
	
	class BinaryTree {
		
		private TreeNode root;
		
		public BinaryTree(int value, int count){
			root = new TreeNode(value, count);
		}
		
		public void insert(int value, int count){
			
			if(root!=null)
				root.insert(value, count);
			else
				root = new TreeNode(value,  count);
			
		}
		
		public String levelOrder(){
			StringBuilder output = new StringBuilder();
	 		Queue<TreeNode> q = new LinkedList<TreeNode>();
	 		int levelNodes = 0; 
			if(root==null) return "";
	 		q.add(root);
	 		while(!q.isEmpty()){
	 			levelNodes = q.size();
	 			while(levelNodes>0){
					TreeNode n = (TreeNode)q.remove();
					output.append(n.value);output.append(":");output.append(n.count);output.append(",");
					if(n.left!=null) 
						q.add(n.left);
					if(n.right!=null) 
						q.add(n.right);
					if(n.right ==null && n.left == null) 
						output.append(",,");
					levelNodes--;
				}
			}
	 		return output.toString().substring(0, output.length() - 3);
		}
		
	}
	
	static String gatherScores(int[] scores) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Solution sol = new Solution();
        if(scores.length == 0)
        	return ",";
        BinaryTree root = sol.new BinaryTree(scores[index], count(scores[index], scores, index));
//        for(int score: scores){
//        	if(!map.containsKey(score))
//        		map.put(score, 1);
//        	else
//        		map.put(score,map.get(score)+1);
//        }
        
        while(index < scores.length){
        	int count = count(scores[index], scores, index);
        	root.insert(scores[index], count);
        	index++;
        }
        String output = root.levelOrder();
        return output;
    }
	
	static int count(int val, int[] a, int index){
		int i = 0;
		while(index < a.length){
			if(a[index] == val)
				i++;
			index++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,2,5,5,6,1,4};
		System.out.println(Solution.gatherScores(input));
	}

}
