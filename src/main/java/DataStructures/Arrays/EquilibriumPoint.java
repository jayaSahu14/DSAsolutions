package DataStructures.Arrays;

public class EquilibriumPoint {
	
	boolean equibPoint(int arr[], int n) {
		int rs=0;
		for(int i=0;i<n; i++) {
			rs+= arr[i];}
		int ls=0;
		for(int i=0;i<n; i++) {
			rs-= arr[i];
			if(ls==rs) 
			    return true;
		ls+= arr[i];	}
			
	 return false;
	}
	
}
	
	
	

/* point in arr, where its before elements sum, n after lements sum 
both are equal
*/

/* naive solution, for every element, compute its lsum n rsum
 * for( i =0; i< arr.length; i++)
 * for(int j=0;j<i;j++)
 */
 
