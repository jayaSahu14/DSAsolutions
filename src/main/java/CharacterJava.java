
public class CharacterJava {


	// Main driver method
	public static void main(String[] args)
	{
		// Initializing a character
		char ch = '3';

		// Printing the character value
		System.out.println("char value: " + ch);//3

		// Converting character to its integer value
		int a = ch - '0';

		// Printing the integer value
		System.out.println("int value: " + a); //3
		
		
		  int a1 = Integer.parseInt(String.valueOf(ch));
		  
		  
		  /*  {String.valueOf(ch) converts a character ch into a string representation. For example, if ch is the character '5', then String.valueOf(ch) would create the string "5".

Integer.parseInt(...) is a method in Java that parses (converts) a string containing a numerical value into an integer. In your code, it takes the string "5" created from the character '5' and converts it into the integer value 5.

So, in summary, the code converts a character ch into its corresponding integer value and stores it in the variable a1.

}*/
		  
	        // Printing the integral value
	        // corresponding to its character value
	        System.out.println("int value: " + a1); //3
		
		
		
		
		
		
		
	}
}
