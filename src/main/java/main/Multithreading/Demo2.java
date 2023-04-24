package main.Multithreading;

 class Multithread1 extends Thread {
	
    public void run()
    {
        try {
               System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

 public class Demo2 {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	Multithread1 object = new Multithread1();
            object.start();
         
        }
    }
}
