package DataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWisePrint {
	   public static void printLevel(Node root){
	        if(root==null)return;
	        Queue<Node> q=new LinkedList<>();
	        q.add(root);
	        while(q.isEmpty()==false){
	            Node curr=q.poll();
	            System.out.print(curr.key+" ");
	            if(curr.left!=null)
	                q.add(curr.left);
	            if(curr.right!=null)
	                q.add(curr.right);
	        }
	    }   
	   
	   public static void printLevel1(Node root){
	        if(root==null)return;
	        Queue<Node> q=new LinkedList<>();
	        q.add(root); 
	        q.add(null);  //------
	        while(q.size()>1){
	            Node curr=q.poll();
	            if(curr==null){
	                System.out.println();
	                q.add(null);
	                continue;
	            }
	            System.out.print(curr.key+" ");
	            if(curr.left!=null)
	                q.add(curr.left);
	            if(curr.right!=null)
	                q.add(curr.right);
	        }
	    }
	   
	   
	   public static void printLevel2(Node root){  
	        if(root==null)return;
	        Queue<Node> q=new LinkedList<>();
	        q.add(root);
	        while(q.isEmpty()==false){
	            int count=q.size();
	            for(int i=0;i<count;i++){
	            Node curr=q.poll();
	            System.out.print(curr.key+" ");
	            if(curr.left!=null)
	                q.add(curr.left);
	            if(curr.right!=null)
	                q.add(curr.right);
	            }
	            System.out.println();
	        }
	    }   
	
}
