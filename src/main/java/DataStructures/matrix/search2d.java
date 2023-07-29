package DataStructures.matrix;

public class search2d {
	

	    public static boolean searchMatrix(int[][] matrix, int target) {
	        int n = matrix.length;
	        int m = matrix[0].length;
	        int l = 0, r = m * n - 1;
	        while (l != r) {
	            int mid = (l + r - 1) /2;
	            if (matrix[mid / m][mid % m] < target) {
	                l = mid + 1;
	            } else {
	                r = mid;
	            }
	        }
	        return matrix[r / m][r % m] == target;
	    }

	    
	    public boolean searchMatrix1(int[][] matrix, int target) {
	        int i = 0, j = matrix[0].length - 1;
	        while(i < matrix.length && j >= 0) {
	          if(matrix[i][j] == target)
	            return true;
	          else if(matrix[i][j] > target)
	            j --;
	          else if(matrix[i][j] < target)
	            i ++;
	        }
	        return false;
	      }
	    
	    
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
	        int target = 23;
	        System.out.println(searchMatrix(matrix, target));
	    }

	


}
