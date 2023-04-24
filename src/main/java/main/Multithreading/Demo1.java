package main.Multithreading;

public class Demo1 implements Runnable {
   
	public void run(){
        try { 
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {System.out.println("Exception is caught");}
            } 
}
 

			class Multithread {
			    public static void main(String[] args)
			    {
			        int n = 8; // Number of threads
			        for (int i = 0; i < n; i++) {
			            Thread object
			                = new Thread(new Demo1());
			            object.start();
			        }
			    }
}