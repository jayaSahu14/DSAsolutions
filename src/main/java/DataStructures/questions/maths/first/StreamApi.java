package DataStructures.questions.maths.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	
	public static void main(String[] args) {
		
		List<Integer> list1= List.of(9,8,7,6,1,2,3,4,5,6,7);
		List<Integer> list2= Arrays.asList(1,2,3,4,5,6,7);
	
		Stream<Integer>  stream=list1.stream();
		List<Integer> list3=	stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list3);
		
		System.out.println("---------------");
		
			List<Integer> newList=list1.stream().filter(i -> i>3).collect(Collectors.toList());
			System.out.println(newList);
			list1.stream().forEach(System.out::println);
			System.out.println(".......");
			list1.stream().sorted().forEach(System.out::println);
			
			System.out.println("---------------");
	  	
	    Stream<Object> emptyStream = Stream.empty();
		String names[]= {"jaya","sita","ram","rob","hina"};
		Stream<String> stream1 =Stream.of(names);
		stream1.forEach(e -> System.out.print(e+","));
	
		
		
		
		
	}
	
}
