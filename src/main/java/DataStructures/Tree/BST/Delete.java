package DataStructures.Tree.BST;

public class Delete {

	 public static Node delNode(Node root, int x){
	        if(root==null)
	            return root;
	        if(root.key>x)
	            root.left=delNode(root.left,x);
	        else if(root.key<x)
	            root.right=delNode(root.right,x);
	        else{
	            if(root.left==null){
	                return root.right;
	            }
	            else if(root.right==null){
	                return root.left;
	            }
	            else{
	                Node succ=getSuccessor(root);
	                root.key=succ.key;
	                root.right=delNode(root.right,succ.key);
	            }
	        }
	        return root;
	    } 

	  public static Node getSuccessor(Node curr){
	        curr=curr.right;
	        while(curr!=null && curr.left!=null)
	            curr=curr.left;
	        return curr;
	    }
	    
}
