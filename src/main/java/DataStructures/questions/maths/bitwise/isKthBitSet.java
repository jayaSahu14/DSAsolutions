package DataStructures.questions.maths.bitwise;

public class isKthBitSet {
	
	static void isKthBitSet1(int n, int k) //right shift
	{ 
		if (((n >> (k - 1)) & 
				1) == 1) 
			System.out.println("SET"); 
		else
			System.out.println("NOT SET"); 
	} 
	
		public static void isKthBitSet2(int n, int k) //left shift
	{ 
		if ((n & (1 << (k - 1))) == 1) 
		System.out.print("SET"); 
		else
		System.out.print("NOT SET"); 
	} 

	// Driver code 
	public static void main (String[] args) 
	{ 
		int n = 5, k = 1; 
		isKthBitSet1(n, k); 
		isKthBitSet2(n, k); 
	} 
	} 




