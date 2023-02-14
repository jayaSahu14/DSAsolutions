package DataStructures.maths.first;

public class tz {
	static int countTrailingZeros(int n)
	{
		int res = 0;

		for(int i=5; i<=n; i=i*5)
		{
			res = res + (n / i);
		}

		return res;
	}

	public static void main (String[] args) {
		
		int number = 100;

		System.out.println(countTrailingZeros(number));

	}
}
