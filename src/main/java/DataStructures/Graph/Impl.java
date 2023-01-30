package DataStructures.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Impl {
	
	static class Edge{
	int src, dest; //weight;
	
	Edge(int s, int d){
		this.src=s;
		this.dest=d;
	//	weight=w;
	}
	
	public static void createGraph(ArrayList<Edge> graph[] ) {
		for(int i=0; i<graph.length; i++) {
			graph[i]= new ArrayList<Edge>();	}
		
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,3));
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,2));
	}
	
	public static void printNeighbours(ArrayList<Edge> graph[] ,int num) {
		for(int i=0; i<graph[num].size(); i++) {
			Edge e= graph[num].get(i);
			System.out.print(e.dest + " ");
	}}
		
	public static void bfs(ArrayList<Edge>[] graph, int V, boolean vis[], int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(vis[curr]==false) {
				System.out.print(curr);
				vis[curr]=true;
				
				for(int i=0; i<graph[curr].size(); i++) {
					Edge e=graph[curr].get(i);
					q.add(e.dest);
					
				}
			}
		}
	}
	
	
	public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
		System.out.println(curr);
		vis[curr]=true;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e=graph[curr].get(i);
			if(vis[e.dest]==false) {
			dfs(graph, e.dest, vis);}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		int V=4;
		
		ArrayList<Edge> graph[] = new ArrayList[V];   // array of type Arrlist ---> each element is a arraylist 
		createGraph(graph);
		
		// print  neighbours
		printNeighbours(graph, 1);
		System.out.println("---");
		printNeighbours(graph, 2);
		
		boolean vis[]= new boolean[V]; // if graph is broken
		for(int i=0;i<V; i++) {
			if(vis[i]==false) {
				bfs(graph,V, vis, i);
		//		dfs(graph,0,vis);
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
}