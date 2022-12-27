package DataStructures.recursion;

public class Questions {
	
	//count no. of digits in an integer--------------------------------------------
	
	public static int countDigits(int n)
    {   if (n/10 == 0)
            return 1;
        return 1 + countDigits(n / 10);
    }	
	
	//digital root--------------------------------------------------------------------------

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
	    }
	
	
	//fibonacci--------------------------------------------------------
	    static int fibonacci(int n)
	    {
	       if(n==0) return 0;
	       if(n==1) return 1;
	       if(n==2) return 1;
	       return fibonacci(n-2)+ fibonacci(n-1);
	       
	    }
	    
	    /* s=0; p=0, n=1
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;    
	    */
	
	    
//lucky number -------------------------------------------------------------------
	    

	     public static boolean check(int n,int counter)
	    {
	        if(counter<=n){
	            if(n%counter==0)
	                return false;
			    // calculate next position of input number
			    n=n-n/counter;
			    counter++;
			    // make recursive call with updated counter 
			    // and position return check(n, counter);
			    return check(n, counter);
	        }    
	       	else
	       		return true;
	    }
	    
	    
	    public static boolean isLucky(int n)
	    {
	        return check(n,2);
	    }
	
	//power using recursion--------------------------------------------------------------------------------
	    static int RecursivePower(int n,int p)
	    {
	        if(p==0) return 1;
	        return n* RecursivePower(n,p-1);
	    }
	   
// power if power is toooo big
	    long power(int N,int R){
	        if(R==0) return 1;

	           long ans=power(N,R/2);

	           ans=ans*ans%1000000007;

	           if(R%2==0) return ans;

	           return ans*N%1000000007;
	           
	       
	       }
	    
	    
	    
	
	public static void main(String[] args) {
		

	}

}
