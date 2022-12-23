package DataStructures.question.recursion;

public class SumOfNnaturalNos {

	public static void main(String[] args) {
		System.out.println(getSum(9));
	}

	private static int getSum(int n) {
		if(n==0)
			return 0;
		 return n +getSum(n-1);
	}

}
