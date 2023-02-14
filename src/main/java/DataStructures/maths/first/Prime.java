package DataStructures.maths.first;

public class Prime {

	static boolean isPrime(int n)
	{

		// Check if number is less than
		// equal to 1
		if (n <= 1)
			return false;

		// Check if number is 2
		else if (n == 2)
			return true;

		// Check if n is a multiple of 2
		else if (n % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime1(int n)
	{
		if (n <= 1)
			return false;

		// Check if n=2 or n=3
		if (n == 2 || n == 3)
			return true;

		// Check whether n is divisible by 2 or 3
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		// Check from 5 to square root of n
		// Iterate i by (i+6)
		for (int i = 5; i <= Math.sqrt(n); i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
	
	
	static void printPrimeFactors(int n)
	{
		if(n <= 1)
			return;

		while(n % 2 == 0)
		{
			System.out.print(2+" ");

			n = n / 2;
		}

		while(n % 3 == 0)
		{
			System.out.print(3+" ");

			n = n / 3;
		}

		for(int i=5; i*i<=n; i=i+6)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}

			while(n % (i + 2) == 0)
			{
				System.out.print((i + 2)+" ");

				n = n / (i + 2);
			}
		}

		if(n > 3)
			System.out.print(n+" ");

		System.out.println();
	}
	
	
	static void printPrimeFactors1(int n)
	{
		if(n <= 1)
			return;

		for(int i=2; i*i<=n; i++)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}
		}

		if(n > 1)
			System.out.print(n+" ");

		System.out.println();
	}
	
	
	// Driver code
	public static void main(String[] args)
	{
		if (isPrime(19))
			System.out.println("true");

		else
			System.out.println("false");
	}
}
