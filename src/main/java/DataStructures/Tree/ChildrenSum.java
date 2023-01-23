package DataStructures.Tree;

public class ChildrenSum {

	 public static boolean isCSum(Node root){
	        if(root==null)
	            return true;
	        if(root.left==null && root.right==null)
	            return true;
	        int sum=0;
	        if(root.left!=null)sum+=root.left.key;
	        if(root.right!=null)sum+=root.right.key;
	        
	        return (root.key==sum && isCSum(root.left) && isCSum(root.right));
	    }
}

//Children Sum Property is a property in which the sum of values of the left child 
//and right child should be equal to the value of their node if both children are present. 
//Else if only one child is present then the value of the child should be equal to its node value.