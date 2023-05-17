package DataStructures.Java;

public class Polym {

	class Bike{  
		  void run(){System.out.println("running");}  
		}  
		class Splendor extends Bike{  
		  void run(){System.out.println("running safely with 60km");}  
		  
		  public static void main(String args[]){  
		    Bike b = new Splendor(); //upcasting  
		    b.run();  
		  }  
		}   // running safely with 60km.
		
		
		public static void main(String args[])
		{
			String a="abc";
			String b="bc";
			System.out.println(a.compareTo(b));
			
			
		}
}
