package DataStructures.Graph;

import java.util.ArrayList;

import DataStructures.Graph.Impl.Edge;

public class IsCycleDirected {
	
	
	public static void main(String args[]) {
		int V;
		boolean vis[]= new boolean[V];
		boolean rec[]= new boolean[V];
		for(int i=0;i<V;i++) {
			if(!vis[i]) {				
				boolean isCycle= isCycleDirected1(graph, vis,0, rec);
				if(isCycle) {
					System.out.println(isCycle);
					break;
				}
			}
		}
		
		
	}

	private static boolean isCycleDirected1(ArrayList<Edge>  graph[], boolean[] vis, int curr, boolean[] rec) {
               vis[curr]=true;
               rec[curr]= true;
               
               for(int i =0; i<graph[curr].size(); i++) {
            	   Edge e= graph[curr].get(i);
            	   if(rec[e.dest]) {
            		   return true;
            	   } else if(!vis[e.dest]) {
            		   if(isCycleDirected1(graph, vis, e.dest, rec)) {
            			   return true;
            		   }
            	   }
               }
            rec[curr]   = false;
               

		return false;
	}

}
