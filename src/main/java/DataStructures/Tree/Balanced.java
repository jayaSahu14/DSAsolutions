package DataStructures.Tree;

public class Balanced {

	 public static boolean isBalanced(Node root){
	        if(root==null)
	            return true;
	        int lh=height(root.left);
	        int rh=height(root.right);
	        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
	    }
	 
	 public static int height(Node root){
	        if(root==null)
	            return 0;
	        else
	            return (1+Math.max(height(root.left),height(root.right)));
	    }
}
