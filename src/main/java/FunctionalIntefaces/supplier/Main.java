package FunctionalIntefaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
	public static void main(String args[])
	{

		// This function returns a random value.
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		
		 Supplier<LocalDateTime> s = () -> LocalDateTime.now();
	        LocalDateTime time = s.get();
	        System.out.println(time);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
