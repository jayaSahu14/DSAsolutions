package main.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student2
{
	String sname;
	int sid;
	char grade;
	
	Student2(String sname,int sid,char grade)
	{
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
	
}


public class Demo3 {

	public static void main(String[] args) {
	
		List<Student2> studentList1=new ArrayList<Student2>();
		studentList1.add(new Student2("Smith",101,'A'));
		studentList1.add(new Student2("John",102,'B'));
		studentList1.add(new Student2("Kenedy",103,'C'));
		
		List<Student2> studentList2=new ArrayList<Student2>();
		studentList1.add(new Student2("Scott",104,'A'));
		studentList1.add(new Student2("Mary",105,'B'));
		studentList1.add(new Student2("Kitty",106,'C'));
		
		List<List<Student2>>studentList=Arrays.asList(studentList1,studentList2);
		
		//using streams/ flatMap()
		List<String> namesList=studentList.stream().
				flatMap(stulist->stulist.stream())
				.map(s->s.sname)
				.collect(Collectors.toList()); 

		System.out.println(namesList);
	}

	
}




