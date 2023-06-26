package DataStructures.Queue.sdd;

import java.util.LinkedList;
import java.util.Queue;

public class Questions {
	
	public static void nonRepeating(String str) {
		
		int freq[]= new int[26];
		Queue<Character> q= new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			q.add(ch);
			freq[ch-'a']++;
			
			while(!q.isEmpty() &&  freq[ch-'a']>1) {
				q.remove();
			}
			
			if(q.isEmpty()) {
				System.out.println(-1+" ");
			}else {
				System.out.println(q.peek());
			}
		}
		System.out.println();
	}

	public static void interVein(Queue<Integer> q) {
		Queue<Integer> firstHalf= new LinkedList<>();
		int size=q.size()/2;
		for(int i=0;i<size;i++) {
			firstHalf.add(q.remove());
		}
		while(!firstHalf.isEmpty()) {
			q.add(firstHalf.remove());
			q.add(q.remove());
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str="aabccxx";
		nonRepeating(str);
	}
	
	
}
