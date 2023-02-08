package DataStructures.SegementTrees;

public class Construct {
	
	static int CST(int ss, int se, int si, int arr[], int tree[]) {
		if(ss==se) {
			tree[si]=arr[ss];
			return arr[ss];
		}
		int mid=(ss+se)/2;
		
		tree[si]=CST(ss, mid, 2* si+1, arr, tree) +CST(mid+1, se, 2* si+2, arr, tree);
		return tree[si];
	}
	
	static int getSumRec(int qs, int qe, int ss, int se, int si, int tree[])
	{
		if(se < qs || ss > qe)
			return 0;
		if(qs <= ss &&  qe >= se)
			return tree[si];

		int mid = (ss + se) / 2;

		return getSumRec(qs, qe, ss, mid, 2 * si + 1, tree)
			   + getSumRec(qs, qe, mid + 1, se, 2 * si + 2, tree);
	}
	
	static void updateRec(int ss, int se, int i, int si, int diff, int tree[])
	{
		if(i<ss || i>se) return;
		tree[si]= tree[si]+diff;
		if(se>ss) {
			int mid=(se+ss)/2;
			updateRec(ss, mid, i, 2*si+1, diff, tree);
			updateRec(mid+1, se, i, 2*si+2, diff, tree);
		}
	}
	
	
	
	
	
	public static void main(String args[]) 
    {

		int arr[] = {10, 20, 30, 40}, n= 4;

		int tree[] = new int[4 * n];

		System.out.println(CST(0, n - 1, 0, arr, tree));
		
		System.out.println(getSumRec(0, 2, 0, 3, 0, tree));
		
		updateRec(0, 3, 1, 0, 5, tree);
        
    } 

}
