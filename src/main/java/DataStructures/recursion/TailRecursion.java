package DataStructures.recursion;

public class TailRecursion {

	
		static int fact(int n, int k)
		{
			if(n == 0 || n == 1)
				return k;

			return fact(n - 1, k * n);

		}
		
		static void fun(int n, int k)
		{
			if(n == 0)
				return;

			System.out.print(k+" ");

			fun(n - 1, k + 1);

		}
		
		static void fun(int n)
		{
			if(n == 0)
				return;

			System.out.print(n+" ");

			fun(n - 1);

		}
		
	    public static void main(String [] args) 
	    {

	    	System.out.println(fact(3, 1));
	        
	    }

	}

