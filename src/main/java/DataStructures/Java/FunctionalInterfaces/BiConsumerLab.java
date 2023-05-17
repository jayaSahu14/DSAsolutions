package DataStructures.Java.FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerLab {

	private static final String StudentDatabase = null;


	static BiConsumer<String, String> bc2 = (a, b) -> {
		System.out.println("Name : " + a + ", Gender : " + b);
		};


		static List<Student> studentList = StudentDatabase.getStudentList();

		public static void printNameAndGender() {
		studentList.forEach((student) -> {bc2.accept(student.getStudentName(), student.getGender());});
		}

		public static void main(String[] args) {

		BiConsumer<String, String> bc1 = (a, b) -> {
		System.out.println("a : " + a + " b : " + b);
		};

		bc1.accept("Hello", "World");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
		System.out.println("Multiply : " + (a*b));
		};

		BiConsumer<Integer, Integer> division = (a, b) -> {
		System.out.println("Divide : " + (a/b));
		};

		multiply.andThen(division).accept(100, 50);

		printNameAndGender();
		}
	
}
