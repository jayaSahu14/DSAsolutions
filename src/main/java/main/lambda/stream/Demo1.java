package main.lambda.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Demo1 {
	//Non-terminal/processing methods
	//distinct()
	//limit()

	//terminal
	//count()
	//forEach()

		public static void main(String[] args) {
			
			List<String>vehiclesList=Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
			
			//distinct
			
			List<String> distinctVehicles=vehiclesList.stream().distinct().collect(Collectors.toList());
			System.out.println(distinctVehicles); //[bus, car, bycle, bike]
			
			vehiclesList.stream().distinct().forEach(value->System.out.println(value));
			
			//count
			long count=vehiclesList.stream().distinct().count();
			System.out.println(count); //4
			
			//limit()
			List<String> limitedVehicleslist=vehiclesList.stream().limit(3).collect(Collectors.toList());
			System.out.println("Limited Vehicles:"+limitedVehicleslist);
			
			vehiclesList.stream().limit(3).forEach(value->System.out.println(value));
		
			List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

			// count()
			long numberOfEvenNumbers = numbersList.stream().filter(num -> num % 2 == 0).count();
			System.out.println(numberOfEvenNumbers);

			// min()
			Optional <Integer>min=numbersList.stream()
					.min((val1,val2)->{return val1.compareTo(val2);});

			System.out.println(min.get());
			
			//max()
			
			Optional <Integer>max=numbersList.stream()
					.max((val1,val2)->{return val1.compareTo(val2);
				});
			
			System.out.println(max.get());
	
			//------------------------------------------------------------------------
			List<String> stringList = Arrays.asList("A","B","C","1","2","3");
	
			Optional<String>reduced=stringList.stream().reduce((a,b)->
									{
										return a+b;   
								
										});
			
			System.out.println(reduced.get());
			
//------------------------------------------------------------------------
			
			List<String> stringList1 = Arrays.asList("A","B","C","1","2","3");
			
			Object arr[]=stringList.stream().toArray();
			
			System.out.println(arr.length);
			
			for(Object v:arr)
			{
				System.out.println(v);
			}

//------------------------------------------------------------------------		
		
			List<String> animalsList=Arrays.asList("Dog","Cat","Elephant");
			List<String> birdsList=Arrays.asList("peackock","parrot","Crow");
			
			
			Stream <String>stream1=animalsList.stream();
			Stream <String>stream2=birdsList.stream();
			
			List<String> finallist=Stream.concat(stream1, stream2).collect(Collectors.toList());
			
			
			for(String item:finallist)
			{
				System.out.println(item);
			
		}
			
//------------------------------------------------------------------------		
			System.out.println("--------find any------");
		
			List<String> stringList3 = Arrays.asList("abc","one","two","three","one","two", "uu");
			Optional<String> ele=stringList3.stream().findAny();
			System.out.println(ele.get());
			
			List<String> stringList2 = Arrays.asList("one","two","three","one");
			Optional<String> ele1=stringList2.stream().findFirst();
			System.out.println("------find first----");
			System.out.println(ele1.get());
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
