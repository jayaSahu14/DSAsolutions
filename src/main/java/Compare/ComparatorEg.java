package Compare;
import java.util.*;  

class ComparatoreEg implements Comparator<Studente>{  
	public int compare(Studente s1,Studente s2){  
	if(s1.age==s2.age)  
	return 0;  
	else if(s1.age>s2.age)  
	return 1;  
	else  
	return -1;  
	}  
	}

class TestComparator{  
public static void main(String args[]){  
//Creating a list of students  
ArrayList<Studente> al=new ArrayList<Studente>();  
al.add(new Studente(101,"Vijay",23));  
al.add(new Studente(106,"Ajay",27));  
al.add(new Studente(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
//Using NameComparator to sort the elements  
Collections.sort(al,new ComparatoreEg());  
//Traversing the elements of list  
for(Studente st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by Age");  
//Using AgeComparator to sort the elements  
Collections.sort(al,new ComparatoreEg());  
//Travering the list again  
for(Studente st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  



class Studente{  
int rollno;  
String name;  
int age;  
Studente(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  