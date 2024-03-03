package main.lambda.stream;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
class HelloWorld {
 public static void main(String[] args) {
     String s = "Jaya Sahu";

     String result = s.chars()
             .mapToObj(c -> (char) c)
             .filter(c -> s.indexOf(c) == s.lastIndexOf(c)) // Filter non-duplicate characters
             .collect(Collectors.toCollection(LinkedHashSet::new))
             .stream()
             .map(String::valueOf)
             .collect(Collectors.joining());

     System.out.println("Non-duplicate characters: " + result);
     
   
     
     
     
     
     
     
     
 }
}

//Non-duplicate characters: Jy Shu


/* import java.util.stream.IntStream;

public class IntStreamToStringExample {
    public static void main(String[] args) {
        String testString = "String";

        // Create an IntStream from the characters of the String
        IntStream intStream = testString.chars();

        // Convert IntStream back to String using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        intStream.forEach(stringBuilder::appendCodePoint);

        // Obtain the resulting String
        String convertedString = stringBuilder.toString();

        // Print the result
        System.out.println("Original String: " + testString);
        System.out.println("Converted String: " + convertedString);
    }
}
*/



