package FunctionalIntefaces.consumer;

import java.util.ArrayList;  
import java.util.List;  
import java.util.function.Consumer;  
public class ConsumerInterfaceExample1 {  
    static void addList(List<Integer> list){  
       
        int result = list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
        System.out.println("Sum of list values: "+result);  
    }  
    public static void main(String[] args) {  
     
                List<Integer> list = new ArrayList<Integer>();  
                list.add(10);  
                list.add(20);  
                list.add(30);  
                list.add(40);  
        // Referring method to String type Consumer interface   
        Consumer<List<Integer>> consumer = ConsumerInterfaceExample1::addList;  
        consumer.accept(list);  // Calling Consumer method  
          
    }  
}  