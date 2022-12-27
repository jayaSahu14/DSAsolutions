package DataStructures.recursion;

public class NtoOne {
	
	public static void printNto1(int n) {
		
		if (n==0)return;
		System.out.println(n+" ");
		printNto1(n-1);
	}

	public static void main(String[] args) {
		printNto1(6);
	}

}

//aux space theta(n)