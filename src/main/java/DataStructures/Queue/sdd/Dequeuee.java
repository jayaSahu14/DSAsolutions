package DataStructures.Queue.sdd;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeuee {
	public static void main(String[] args) {
		
	Deque<Integer> dq= new LinkedList<>();
	dq.addFirst(1);
	dq.addFirst(2);
	System.out.println(dq); //2,1
	dq.addLast(3);
	dq.addLast(4);
	System.out.println(dq); // 2,1,3,4
	dq.removeFirst();
	dq.removeLast();
	System.out.println(dq);
}
}

//getFirst--getLast: peek
//addfirst-addLast
//removeFirst--removeLast