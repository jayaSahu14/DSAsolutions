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
    Integer price;  
    public Product(int id, String name, int price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP",25000));  
        productsList.add(new Product(2,"Dell ",30000));  
        productsList.add(new Product(3,"Aenevo ",28000));  
        productsList.add(new Product(4,"Aony ",28000));  
        productsList.add(new Product(5,"Apple ",90000));  
      
        List<Integer> v= new ArrayList<>();
        v.add(1);
        v.add(2);
        List<Integer> v1= Arrays.asList(1,2,3,4,5);

        
        
      //  productsList=
        		productsList.stream()  
                    .filter(product->product.price<30000)  
                    .filter(s->s.name.startsWith("A")).forEach(System.out::println);
               //     collect(Collectors.toList());s
        for (Product name : productsList) {
        	System.out.println("Names Start with a: " + name.name);}
        System.out.println("sorting---------------------------------");
       List<Product> abc =productsList.stream()
        .sorted((s1,s2)->s1.price.compareTo(s2.price)).collect(Collectors.toList());
       for (Product name : abc) {
       	System.out.println("cost sorting " + name.name+ name.price);}
       
        
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
   
   a.stream().filter(s->s==5).forEach(System.out::println); 
   a.stream().map(s->s*5).forEach(System.out::println); 
    Optional<Integer> a1=a.stream().reduce((b1,b2)->(b1+b2));
    System.out.println("-------------------------------");
    System.out.println(a1);
    
  //--------------------------------------------------------------------------------------------------------  
    
//    
//    int a[]= {1,2,3,4,5};
//    OptionalInt a1=Arrays.stream(a).reduce((b1,b2)->(b1+b2));
//    System.out.println(a1);
//    
//    Optional<String> z = Arrays.stream()
//                                       .reduce( (str1, str2) -> str1 + "-" + str2  );
//    if (z.isPresent()) {
//        System.out.println(z.get());
//    }
//    
//     }
//     
    }
}  