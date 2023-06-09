
public class t3 {
	
	private static void removeDup12(int[] c) {
		
		int res=1;
		for(int i=1;i<c.length;i++) {
			if(c[res-1]!=c[i]) {
				c[res]=c[i]; 
				res++;
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6,6,7,7};
		removeDup12(a);

}}
