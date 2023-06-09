package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxChain {
public static void main(String[] args) {
	
	int[][] pairs= { {5,24},{39,60},{5,28},{50,60},{27,40}};
	
	Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sort 2d arr wrt 2nd element
	
	int chainLen=1;
	int chainEnd= pairs[0][1];
	for(int i=1;i<pairs.length;i++) {
		if(pairs[i][0] > chainEnd ) {
			chainLen++;
			chainEnd=pairs[i][1];
		}
	} System.out.println("max length"+ chainLen);
	
}
}
