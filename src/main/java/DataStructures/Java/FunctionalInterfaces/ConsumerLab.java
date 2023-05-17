package DataStructures.Java.FunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import DataStructures.Java.comparator.Student;

public class ConsumerLab {

	private static final String StudentDatabase = null;
	static Consumer<Student> c2 = (s) -> System.out.println(s);
	static Consumer<Student> c3 = (s) -> System.out.print(s.getStudentName() + " ");
	static Consumer<Student> c4 = (s) -> System.out.println(s.getGpa());
	static List<Student> studentList = StudentDatabase.getStudentList();

	public static void printStudents() {
	studentList.forEach(c2);
	}

	public static void printStudentNameAndGpa() {
	studentList.forEach(c3.andThen(c4));
	}

	public static void printNameAndGpaFilteredByAge() {
	studentList.forEach((student) -> {
	if(student.getAge() >= 19)
	c3.andThen(c4).accept(student);
	});
	}

	public static void main(String[] args) {

	// Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
	//
	// c1.accept("hello");
	//
	// printStudents();

	// printStudentNameAndGpa();

	printNameAndGpaFilteredByAge();

	}
	
}
