package main.lambda.stream;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class Employee{
	int id; String name; int salary;
	Employee(int i,String str, int sal){
		id=i;
		name=str;
		salary=sal;
	}
}

public class StreamApis<T> {

	public static Employee[] arrayOfEmps = {
		    new Employee(1, "Jeff Bezos", 100000), 
		    new Employee(2, "Bill Gates", 200000), 
		    new Employee(3, "Mark Zuckerberg", 300000)
		};
	
	Stream<T> s=(Stream<T>) Stream.of(arrayOfEmps);

	private static List<Employee> empList = Arrays.asList(arrayOfEmps);
	
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

	//get count of empty string
	long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
	
//	 Integer[] empIds = { 1, 2, 3, 4 };
//	    
//	    Employee employee = Stream.of(empIds);
//	      employee.filter(e -> e != null)
//	      .filter(e -> e.getSalary() > 100000)
//	      .findFirst()
//	      .orElse(null);
//	
//	
//	
	
	 private static void countFrequencyWithStreams() {
	        List<Integer> ls = Arrays.asList(1,4,2,3,5,3,2,4,2,5,3,1);
	        Map<Integer, Long> mp = ls.stream()
	                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
	        System.out.println(mp);
	    }
	
	 private static void numberStartsWithOne() {
	        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,11,22,334);
	        ls.stream()
	                .map(s -> s + "")
	                .filter(s -> s.startsWith("1"))
	                .forEach(s -> System.out.println(s + " "));
	    }
	
	 private static void m1() {
	  List<String> list = Arrays.asList("Geeks", "for", "gfg",
              "GeeksforGeeks", "GeeksQuiz");
      list.stream().mapToInt(str -> str.length()).forEach(System.out::println);
}
	 private static void m2() {
		 
		  List<String> list = Arrays.asList("Geeks", "for", "gfg",
	              "GeeksforGeeks", "GeeksQuiz");
//		  list.stream().filter(s-> s.length()>6).filter(s->s.length()<8)
		  list.stream().filter(s-> s.length()>6 && s.length()<8)
		  .collect(Collectors.toList());
		 //	  list.stream().filter(s-> s.length()>6 && s.length()<8)
		 
		 
	 }
	 
}

