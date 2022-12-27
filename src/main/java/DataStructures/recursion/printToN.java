package DataStructures.recursion;

public class printToN {
			
		static void printToNn(int n)
		{
			if(n == 0)
				return;
			
			printToNn(n - 1);

			System.out.print(n+" ");

		}
	    public static void main(String [] args) 
	    {
	    	int n = 4;

	    	printToNn(n);
	        
	    

	}
}
