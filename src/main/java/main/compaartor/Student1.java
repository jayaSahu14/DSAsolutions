package main.compaartor;
import java.util.*;


class Student1 implements Comparable<Student1> {
	
	Integer marks;
	Student1(Integer marks) { this.marks = marks; }
	public String toString() { return (" " + this.marks); }

	
	public int compareTo(Student1 stu)
	{
		return stu.marks.compareTo(this.marks);
	}

	public static void main(String[] args){
		
		LinkedHashSet<Student1> set = new LinkedHashSet<>();

		set.add(new Student1(500));
		set.add(new Student1(300));
		set.add(new Student1(400));
		set.add(new Student1(100));
		set.add(new Student1(200));

		System.out.println("Before sort elements in descending order : "+ set);

		// TreeSet to sort LinkedHashSet using comparable
		TreeSet<Student1> tree_set = new TreeSet<>(set);

		System.out.println(
			"After sort elements in descending order : "
			+ tree_set);
	}
}
