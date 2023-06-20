import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
	
		// print distinct char present in string
		
		String str="Capgemini";
		Map<Character,Integer> hm= new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			hm.put( str.charAt(i), hm.getOrDefault(str.charAt(i),0)+1);
		}
		System.out.println(hm);
		
		System.out.println("-------------");
		
		
       String s1 = "geeksforgeeks";
		
		for(int i=0;i<s1.length();i++){
			  String str1=s1.substring(i);
			 	System.out.println(str1);}
		
	}

}
