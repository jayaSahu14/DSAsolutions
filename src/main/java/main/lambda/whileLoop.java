package main.lambda;

public final class whileLoop {

	public static void main(String[] args) {
	
		int a=10;
		while(a!=0) {
			System.out.println(a);
			a--;
		} System.out.println("finish");
		
	  	
	    String s1 = new String("example"); // new ref in pool
	    String s2 = new String("example");
	    String s3="gg";  // old ref in pool
	    String s4="gg";
   
     System.out.println(s1==s2); // f
     System.out.println(s1.equals(s2)); //t 
     System.out.println(s3.equals(s4));//t
     System.out.println(s3==s4);//t
	}

}
