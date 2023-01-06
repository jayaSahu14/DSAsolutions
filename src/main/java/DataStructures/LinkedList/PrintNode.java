package DataStructures.LinkedList;

import java.util.*;
import java.io.*;
import java.lang.*;


public class PrintNode {
    
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	printlist(head);  	
    } 
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    }
    
    public static void printlistRecursion(Node head){
           if(head==null) 
        	   return;
        	System.out.println(head.data+"->"); 
        	printlistRecursion(head.next);
        	//bigOn aux space
           }
    
    public static void InsertatBegin(Node head){
    	
    	
    }



    
    
    
    
    
} 