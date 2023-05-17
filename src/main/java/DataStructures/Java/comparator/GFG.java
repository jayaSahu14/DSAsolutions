package DataStructures.Java.comparator;

import java.io.*;
import java.lang.*;
import java.util.*;

class Student3 {

	int rollno;
	String name, address;


	public Student3(int rollno, String name, String address)
	{

		// This keyword refers to current instance itself
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Method of Student class
	// To print student details in main()
	public String toString()
	{

		// Returning attributes of Student
		return this.rollno + " " + this.name + " "
			+ this.address;
	}
}

class Sortbyroll implements Comparator<Student> {

	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student> {

	public int compare(Student a, Student b)
	{
		return a.name.compareTo(b.name);
	}
}

class GFG {

	public static void main(String[] args)
	{

		
		ArrayList<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
	//	ar.add(111, "Mayank", "london");
		ar.add(new Student3(131, "Anshul", "nyc"));
		ar.add(new Student3(121, "Solanki", "jaipur"));
		ar.add(new Student3(101, "Aggarwal", "Hongkong"));


		System.out.println("Unsorted");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		// Display message on console for better readability
		System.out.println("\nSorted by rollno");

		// Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by name
		Collections.sort(ar, new Sortbyname());

		// Display message on console for better readability
		System.out.println("\nSorted by name");

		// // Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
