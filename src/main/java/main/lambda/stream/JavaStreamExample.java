package main.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Aenevo Laptop",28000f));  
        productsList.add(new Product(4,"Aony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
      
        
      //  productsList=
        		productsList.stream()  
                    .filter(product->product.price<30000)  
                    .filter(s->s.name.startsWith("A")).forEach(System.out::println);
               //     collect(Collectors.toList());
        for (Product name : productsList) {
        	System.out.println("Names Start with a: " + name.name);}
        
        long count = productsList.stream()  
                .filter(product->product.price<30000)  
                .count();  
        System.out.println(count);  
     
    //---------------------------------------------------
   
    List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Sam", "Smith");
    names = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
     for (String name : names) {
	System.out.println("Names Start with S: " + name);}
    
//  names.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);
 
    Stream<Integer>stream=Stream.of(1,2,3,4,5);
    Integer[]val= new Integer[]{1,2,3,4,5,6};
    Stream<Integer>stream1=Arrays.stream(val);
    	
    List<Integer> a= Arrays.asList(1, 2, 3, 4, 5);
   
    Optional<Integer> a1=a.stream().reduce((b1,b2)->(b1+b2));
    System.out.println("-------------------------------");
    System.out.println(a1);
    
  //--------------------------------------------------------------------------------------------------------  
    
//    
//    int a[]= {1,2,3,4,5};
//    OptionalInt a1=Arrays.stream(a).reduce((b1,b2)->(b1+b2));
//    System.out.println(a1);
//    
//    Optional<String> String_combine = Arrays.stream()
//                                       .reduce( (str1, str2) -> str1 + "-" + str2  );
//    if (String_combine.isPresent()) {
//        System.out.println(String_combine.get());
//    }
//    
//     }
//     
    }
}  