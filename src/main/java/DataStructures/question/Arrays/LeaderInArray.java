package DataStructures.question.Arrays;

public class LeaderInArray {

	public void leader(int arr[]) { 
		int n=arr.length;
		int leader=arr[n-1];
		System.out.println(leader); 
		for(int i=n-2; i>=0; i--) {
			if( i> leader) {
				leader=arr[i];
			System.out.println(leader); 
			}
		}
		
		
	}
}

//traverse from back, if the no. is bigger than prevois one, print it