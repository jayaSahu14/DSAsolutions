package DataStructures.String;

public class qq {

	public static void main(String[] args)
	{

		StringBuilder sbf= new StringBuilder("We are geeks ");
		System.out.println(sbf);

		char[] astr= new char[] { 'G', 'E', 'E', 'k', 'S' };

		sbf.append(astr);
		System.out.println("Result after"+ " appending = "+ sbf);

		sbf = new StringBuilder("We are -");
		System.out.println(sbf);

		astr = new char[] { 'a', 'b', 'c', 'd' };

		sbf.append(astr);
		System.out.println("Result after appending = " + sbf);
	}
}
