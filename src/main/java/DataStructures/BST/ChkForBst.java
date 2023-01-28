package DataStructures.BST;

public class ChkForBst {
	
	
	// 1-------ineff
	
	  public static int maxValue(Node root){
	        if (root == null) 
	            return Integer.MIN_VALUE; 
	      
	        int res = root.key; 
	        int lres = maxValue(root.left); 
	        int rres = maxValue(root.right); 
	        if (lres > res) 
	            res = lres; 
	        if (rres > res) 
	            res = rres; 
	        return res; 
	    }
	    
	    public static int minValue(Node root) 
	    { 
	        if (root == null) 
	          return Integer.MAX_VALUE; 
	      
	        int res = root.key; 
	        int lres = minValue(root.left); 
	        int rres = minValue(root.right); 
	        if (lres < res) 
	          res = lres; 
	        if (rres < res) 
	          res = rres; 
	        return res; 
	    }
	    
	    public static int isBST1(Node root)  
	    {  
	      if (root == null)  
	        return 1;  
	          
	      if (root.left!=null && maxValue(root.left) > root.key)  
	        return 0;  
	          
	      if (root.right!=null && minValue(root.right) < root.key)  
	        return 0;  
	        
	      if (isBST1(root.left)==0 || isBST1(root.right)==0)  
	        return 0;  
	          
	      return 1;  
	    } 
	    
	    //2----eff
	    
	    public static boolean isBST1(Node root, int min, int max)  
	    {  
	      if (root == null)  
	        return true;  
	          
	      return ( root.key>min && root.key<max && 
	                isBST1(root.left,min,root.key) && isBST1(root.right,root.key,max));  
	    }
	    
	    
	    // inorder
	    
	    static int prev=Integer.MIN_VALUE;
	    public static boolean isBST(Node root)  
	    {  
	        if (root == null)  
	            return true;  
	        
	        if(isBST(root.left)==false)return false;
	        
	        if(root.key<=prev)return false;
	        prev=root.key;
	        
	        return isBST(root.right);
	    }
	    
	    public static void main(String args[])
	    {
	        Node root = new Node(4);  
	        root.left = new Node(2);  
	        root.right = new Node(5);  
	        root.left.left = new Node(1);  
	        root.left.right = new Node(3);  
	          
	        if (isBST1(root)==1) 
	            System.out.println("IS BST"); 
	        else
	            System.out.println("Not a BST");
	    }
	    

}
