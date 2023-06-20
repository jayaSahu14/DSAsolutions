package DataStructures.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq= new PriorityQueue<>();
//    PriorityQueue <Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()); -- for reverse sort		
		pq.add(3);
		pq.add(2);
		pq.add(5);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
		
	}
}

// max heap: max val max priority