package DataStructures.BST;

 class Node1 {
    int data;
    Node1 left, right;
    int lCount;
    Node1(int x)
    {
        data = x;
        left = right = null;
        lCount = 0;
    }
}

public class KthSmallest {
	
	 public static Node1 insert(Node1 root, int x)
	    {
	        if (root == null)
	            return new Node1(x);
	      
	        if (x < root.data) {
	            root.left = insert(root.left, x);
	            root.lCount++;
	        }
	     
	        else if (x > root.data)
	            root.right = insert(root.right, x);
	        return root;
	    }
	     
	    public static Node1 kthSmallest(Node1 root, int k)
	    {
	        if (root == null)
	            return null;
	     
	        int count = root.lCount + 1;
	        if (count == k)
	            return root;
	     
	        if (count > k)
	            return kthSmallest(root.left, k);
	     
	        return kthSmallest(root.right, k - count);
	    }
	     
	    public static void main(String args[])
	    {
	        Node1 root = null;
	        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
	     
	        for (int x : keys)
	            root = insert(root, x);
	     
	        int k = 4;
	        Node1 res = kthSmallest(root, k);
	        if (res == null)
	            System.out.println("There are less "
	                           + "than k nodes in the BST");
	        else
	            System.out.println("K-th Smallest"
	                    + " Element is " + res.data);
	    }
	    
	    
	    
	    
	    
	    
	    //efficient
	    
	    
	    static int count=0;
	    public static void printKth(Node root, int k){
	        if(root!=null){
	            printKth(root.left,k);
	            count++;
	            if(count==k)
	                {System.out.print(root.key);return;}
	            printKth(root.right,k);
	        }
	    } 

}
