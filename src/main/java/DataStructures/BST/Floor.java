package DataStructures.BST;

public class Floor {
	
	// floor == closedt smaller value
	 public static Node floor( Node root, int x) {
		 Node res=null;
		 while(root!=null) {
			 if(root.key==x) {
				 return root;
			 }
			 if(root.key > x) {
				 root=root.left;
			 }
			 else
				 res=root; //reference of root
				 root= root.right;
		 }
		return res;
	 }

	 // closest bigger value
	 
	  public static Node ceil(Node root, int x){
	        Node res=null;
	        while(root!=null){
	            if(root.key==x)
	                return root;
	            else if(root.key<x)
	                root=root.right;
	            else{
	                res=root;
	                root=root.left;
	            }
	        }
	        return res;
	    } 
}
