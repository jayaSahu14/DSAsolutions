package DataStructures.Arrays;

public class Merge2Arr {

	public  static void merge(int[]a, int[]b) {
		
		int a1=a.length, b1=b.length;
		int c[]= new int[a1+b1];
		
		for(int i=0;i<a1;i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<b1;i++) {
			c[a1+i]=b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"-");
		}	
		
	}
	
	public static void main(String[] args) {
		int a[]= {4,5,7,8,13,22};
		int b[]= {24,13,28,30,29};
		merge(a,b);

	}
}
