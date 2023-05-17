package DataStructures.Tree.BST;

import java.util.Map;

public class HorizontalDist {

	
	 public static void vSumR(Node root,int hd, TreeMap<Integer,Integer> mp){
	        if(root==null)return;
	        vSumR(root.left,hd-1,mp);
	        int pSum=(mp.get(hd)==null)?0:mp.get(hd);
	        mp.put(hd,pSum+root.key);
	        vSumR(root.right,hd+1,mp);
	    }  
	    
	    public static void vSum(Node root){
	        TreeMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
	        vSumR(root,0,mp);
	        for(Map.Entry sum: mp.entrySet())
	            System.out.print(sum.getValue()+" ");
	    }
}
