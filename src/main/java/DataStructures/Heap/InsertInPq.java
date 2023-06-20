package DataStructures.Heap;

import java.util.ArrayList;

public class InsertInPq {
	
	ArrayList<Integer> arr= new ArrayList<>(); 
	
	public void insert(int data) {
		arr.add(data);
		int x=arr.size()-1; // --- x is child idx
		int par=(x-1)/2;  //---parent idx
		
		while(arr.get(x) < arr.get(par)) {
			int temp=arr.get(x);
			arr.set(x, arr.get(par));
			arr.set(par, temp);
		}
		
		// add at last place of arr, and swap with parent
	}
	

	public void delete(int data) {
		
	}
	// swap first n last idx, dlt last idx
	//heapify

	

}
