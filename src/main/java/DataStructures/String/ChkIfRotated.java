package DataStructures.String;

public class ChkIfRotated {
	
	boolean chk(String s1, String s2) { 
		if(s1.length()!=s2.length()) return false;
		return (s1+s2).indexOf(s2) >0;
	}

}
//The indexOf() method returns the position of the first
//occurrence of specified character(s) in a string.