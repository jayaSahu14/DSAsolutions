package main.lambda.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {

    public static void main(String[] args) {
        // 1. Stream of Strings
        String str = "Hello, World!";
        Stream<Object> charStream = str.chars().mapToObj(c -> (char) c);
        charStream.forEach(System.out::print);

        System.out.println("------");

        // 2. Stream of Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::print);

        System.out.println("------");

        // 3. Stream of Lists
        List<String> stringList = Arrays.asList("apple", "banana", "orange");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(System.out::print);

        System.out.println("------");

        // 4. Stream of Maps
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
        entryStream.forEach(entry -> System.out.print(entry.getKey() + ": " + entry.getValue()));
    }
}
