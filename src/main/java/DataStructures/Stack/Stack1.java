package DataStructures.Stack;

import java.io.*;
import java.util.*;

class MyStack2{
    
    ArrayList<Integer> al=new ArrayList<>();
    void push(int x){
        al.add(x);
    }
    
    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    
    int peek(){
        return al.get(al.size()-1);
    }
    
    int size(){
        return al.size();
    }
    
    boolean isEmpty(){
        return al.isEmpty();
    }
}

class Stack1{

public static void main (String[] args)
{
	MyStack2 s=new MyStack2();
    s.push(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
}
}