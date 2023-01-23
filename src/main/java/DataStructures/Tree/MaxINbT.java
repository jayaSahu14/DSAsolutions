package DataStructures.Tree;

public class MaxINbT {

	 public static int getMax(Node root){
	        if(root==null)
	            return Integer.MIN_VALUE;
	        else
	            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
	    }  
}
