package DataStructures.question.recursion;

public class SumofDigits { 

		static int fun(int n) //recursive
		{
			if(n < 10)
				return n;

			return fun(n / 10) + n % 10;
		}//time: theta(n), aux: theta(n)
		
		
		//------------------------------
		
		
		static int fun1(int n) //iterative
		{
			int res=0;
		while(n>=0) {
			res=res+n%10;
			n=n/10;}
			return res;
		} //time: theta(n), aux: theta(1)
		
	    public static void main(String [] args) 
	    {
	    	
	    	System.out.println(fun(253));
	        
	    }

	}
	

