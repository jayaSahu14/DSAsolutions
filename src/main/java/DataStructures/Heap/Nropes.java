package DataStructures.Heap;

import java.util.PriorityQueue;

public class Nropes {
	public static void main(String[] args) {
	
	int r[]= {2,3,3,4,6};
	
	PriorityQueue<Integer> pq= new PriorityQueue<>();
	for(int a:r) {
		pq.add(a);}
	System.out.println(pq);
	
	int cost=0;
	while(pq.size()>1) {
		int min=pq.remove();
		int min2=pq.remove();
		cost+= min+min2;
		pq.add(min+min2);
		}
	System.out.println(cost);
	
}
}