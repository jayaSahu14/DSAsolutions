package striver.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	 public static void main(String args[])
	    {
	        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
	        int rotting = orangesRotting(arr);
	        System.out.println("Minimum Number of Minutes Required "+rotting);
	    }

	private static int orangesRotting(int[][] grid) {
	
		if(grid==null || grid.length==0) return 0;
		int rows= grid.length;
		int column= grid[0].length;
		
		Queue<Integer> queue= new LinkedList<Integer>();
        int count_fresh = 0;
        
        for(int i=0;i<rows;i++) {
        	for( int j=0; j<column;j++) {
        		if(grid[i][j]==2) {
        			queue.offer(new int[]{i , j});
        			 if(grid[i][j] != 0) {
                         count_fresh++;
                     }
                 }
             }
}
