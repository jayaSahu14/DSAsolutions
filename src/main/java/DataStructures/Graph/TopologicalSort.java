package DataStructures.Graph;

import java.util.ArrayList;
import java.util.Stack;

import DataStructures.Graph.Impl.Edge;

public class TopologicalSort {

	private static void topSortUtil(ArrayList<Edge> graph[], boolean[] vis, int curr, Stack<Integer> stack) {
		vis[curr]=true;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e=graph[curr].get(i);
			if(vis[e.dest]==false) {
				topSortUtil(graph, vis, e.dest,stack);}
		} stack.push(curr);
		}
	
	
	
	private static void topSort(ArrayList<Edge> graph[], int V) {
		
		boolean vis[]=new boolean[V];
		Stack<Integer> stack= new Stack<>();
		for(int i=0;i<V;i++) {
			if(!vis[i]) {
				topSortUtil(graph, vis, i, stack);
			}
		}while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" ");
		}
		
		
	}
	
	//main ---
// topSort(graph,V)
	
	
	
	
	
	
	
	
	
	
	
}
