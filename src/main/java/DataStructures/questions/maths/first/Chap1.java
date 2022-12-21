package DataStructures.questions.maths.first;

public class Chap1 {

	public static int countTrailingZero(int n){
		int res =0;
		for(int i=5;i<=n;i=i*5) {
			res=res+(n/i);	}
		return res;
		
	}

	public static void main(String[] args) {
		
		int a=countTrailingZero(123000000);
		System.out.println(a);
		
	}
}
