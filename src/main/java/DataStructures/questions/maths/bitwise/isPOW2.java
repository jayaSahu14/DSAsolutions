package DataStructures.questions.maths.bitwise;

public class isPOW2 {
	 
    static boolean iisPow2(int n)
	    {
	        if(n == 0)
	            return true;
	        
	        return ((n & (n - 1)) == 0);
	    }
    
		public static void main (String[] args) {
		    
		    int n = 4;
			System.out.println(iisPow2(n));
		}
}
