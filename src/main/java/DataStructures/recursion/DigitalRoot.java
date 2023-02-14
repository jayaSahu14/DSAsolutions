package DataStructures.recursion;

public class DigitalRoot {

	  public static int digitalRoot(int n)
	    {
	       if(n/10==0)
	       return n;
	       else 
	       return digitalRoot(sumDigits(n));
	       
	    }
	    public static int sumDigits(int n)
	    {
	        if(n<10)
	        return n;
	        else
	        return n%10 + sumDigits(n/10);
	    }}
