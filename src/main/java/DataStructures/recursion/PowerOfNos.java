package DataStructures.recursion;

public class PowerOfNos {

	   long power(int N,int R){
	     if(R==0) return 1;

	        long ans=power(N,R/2);

	        ans=ans*ans%1000000007;

	        if(R%2==0) return ans;

	        return ans*N%1000000007;
	        
	    
	    }
	}
	
/*   Given a number and its reverse. Find that number raised to the power of its own reverse. */