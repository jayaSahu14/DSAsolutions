package main.Multithreading;

public class Demo2 extends Thread {
	
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

class Multithread1 {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	Demo2 object = new Demo2();
            object.start();
        }
    }
}
