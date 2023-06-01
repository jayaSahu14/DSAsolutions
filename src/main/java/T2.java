import java.util.ArrayList;

public class T2 {

	public static void removedups(int []a, int []b) {
		
		int a1=a.length, b1=b.length;
		int[]c= new int[a1+b1];
		
		for(int i=0;i<a1;i++) {
			c[i]=a[i];			
		}
		
		for(int i=0;i<b1;i++) {
			c[a1+i]=b[i];			
		}
		
		removeDup1(c);
		
	}

	private static void removeDup1(int[] c) {
	
		int res=1;
		for(int i=1;i<c.length;i++) {
			if(c[res-1]!=c[i]) {
				c[res]=c[i]; res++;
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {2,13,14,15};
		removedups(a,b);
	//	removedups1(a,b);
	}
	
	
	public static void removedups1(int []a, int []b) {
		ArrayList<Integer> c= new ArrayList<Integer>();
		int a1=a.length; int b1=b.length;
		int i=0,j=0;
		while(i<a1 && j<b1) {
			if(a[i]>b[j]) {c.add( b[j]  ); j++;}
			else 	if(a[i]<b[j]) {c.add( a[i]  ); i++;}
			else c.add(a[i]); i++;j++;
	}
		
		System.out.println(c);
	}

}

//nsert into c, remove all dups ...and sort, 



// 2 point...if i>j, put j, else i, if == 