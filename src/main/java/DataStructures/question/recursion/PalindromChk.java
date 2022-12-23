package DataStructures.question.recursion;

public class PalindromChk {
	
	
	public static  boolean PalindromChk1(String a, int first, int last) {
		
		if(first >= last) return true;
		return ( a.charAt(first)==a.charAt(last) && 
				PalindromChk1(a, first+1, last-1));
	}

	public static void main(String[] args) {
		String str="aabcvbaa";
		System.out.println(PalindromChk1(str, 0, str.length()-1));
		
	}

}
