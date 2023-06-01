import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
	
	public  static void merge(int[]a, int[]b) {
			
		int a1=a.length, a2=b.length; 	int c[]= new int[a1+a2];
		int i=0,j=0,k=0;
		while(i<a1 && j<a2) {
			
			if(a[i]<b[j]) {
				c[k++]=a[i]; i++;
			} else  if(a[i]>b[j]) {
				c[k++]=b[i]; i++;
			}else c[k++]=a[i]; i++;j++;
		}
		for(int i1=0;i1<c.length;i1++) {
		System.out.println(c[i1]);}
	}

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]= {2,3,4,5};
		
//merge(a,b);
   //   removeDups(a,a.length);
      add3(a, b);

	}
	
	public  static void removeDups(int[]a, int n) {
		
		boolean flag[]= new boolean[n];
		for(int i=0;i<n;i++) {flag[i]=false;}
	
		int k=0; 
		int c[] = new int[n]; 
		for(int i=0;i<n;i++) { 
			if(flag[i]==false) {
			   for(int j=i;j<n;j++) {
			        	if(a[i]!=a[j]  ) {
				    	c[k++]=a[i]; flag[j]=true;
				}
			}
			   }
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);}
		}
	
	
	   public static void add3(int arr[], int arr2[]) {
	    	
	    	HashMap<Integer,Integer> hm= new HashMap<>();
	    	int i=0,j=0;
	    	while( i< arr.length && j<arr2.length) {
	    		hm.put(arr[i], arr[j]); i++;j++;
	    	}  System.out.println(hm);}
		
	}
	