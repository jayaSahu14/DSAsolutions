package MostImpQuestions;

public class as {
	
	  public static boolean searchMatrix(int[][] matrix, int target) {
	      
	      int m=matrix.length;
	      int n=matrix[0].length;

	      int l=matrix[0][0];
	      int r=matrix[m-1][n-1];

	      while(l<=r){
	           int mid = matrix[(m-1)/2][(n-1)/2];
	           if(mid==target) return true;
	           if(mid>target){
	                l=matrix[0][1];
	           }else r=matrix[m-1][n-2];
	      }
	   return false;      
	      }
	  
	  public static void main(String[] args) {
		 int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		 int target = 3;
		boolean g= searchMatrix(matrix,target);
		System.out.println(g);
		 
	}

}


