package Compare;

import java.util.*;  
import java.io.*;  

class Studentt implements Comparable<Studentt>{  
	int rollno;  
	String name;  
	int age;  
	Studentt(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	public int compareTo(Studentt st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}  
//Creating a test class to sort the elements  
public class comparableEg{  

	public static void main(String args[]){  
		ArrayList<Studentt> al=new ArrayList<Studentt>();  
		al.add(new Studentt(101,"Vijay",23));  
		al.add(new Studentt(106,"Ajay",27));  
		al.add(new Studentt(105,"Jai",21));  

		Collections.sort(al);  
		for(Studentt st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}  
}  