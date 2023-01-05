package DataStructures.String;

public class Palindrome {
	
	
	boolean isPalindrom(String str) {
		StringBuilder str2= new StringBuilder();
		str2.reverse();
		if (str.equals(str2)) return true;
		return false;
	}
	
	boolean isPalindrom2(String str) {
		int s=0, e=str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
			return false;
			}else 	s++;e--;
		}return true;
	}

}