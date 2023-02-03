package DataStructures.Graph;

import java.util.ArrayList;

import DataStructures.Graph.Impl.Edge;

public class IsCycleUndirected {

	public static void main(String[] args) {
	 System.out.println(isCycleUndirected(graph, new boolean[V], 0,-1));

	}
	
	
	private static boolean isCycleUndirected(ArrayList<Edge>  graph[], boolean[] vis, int curr, int par) {
		 vis[curr]=true;
          for(int i =0; i<graph[curr].size(); i++) {
      	   Edge e= graph[curr].get(i);
      	   if(vis[e.dest] && e.dest!=par) {
      		   return true;
      	   } else if(!vis[e.dest]) {
      		   if(isCycleUndirected(graph, vis, e.dest, curr)) {
      			   return true;
      		   }
      	   }
         }
  	return false;
}

	}

// in main function, par=-1;
