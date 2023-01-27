package DataStructures.Tree;

public class KthDistance {
	
	public static void kthDistance(Node root, int k) {
		if(root==null) {return;}
		else if(k==0) {System.out.println(root.key);}
		else { 
			kthDistance(root.left, k-1);
			kthDistance(root.right, k-1);
			}
		} 
	}


