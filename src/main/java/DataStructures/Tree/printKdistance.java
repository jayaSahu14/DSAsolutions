package DataStructures.Tree;

public class printKdistance {
	
	  public static void printKDist(Node root,int k){
	        if(root==null)return;
	        
	        if(k==0){System.out.print(root.key+" ");}
	        else{
	        printKDist(root.left,k-1);
	        printKDist(root.right,k-1);
	        }
	    } 

}
//Nodes at distance k from the root are basically the nodes at (k+1)th level of the Binary Tree.