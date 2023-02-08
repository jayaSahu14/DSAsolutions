package DataStructures.DisjointSet;

public class Impl {
	
	static int parent[];
	
	static void initialize() {
	for(int i=0;i<parent.length;i++) {
		parent[i]=i;
	}
	}
	

	static int find(int x)
	{
	    if(parent[x]==x)
	        return x;
	    else
	        return find(parent[x]);    
	}
	
	
	static int find1(int x) //path compression
	{
	     if(parent[x]==x)
            return x;
    
        parent[x] = find1(parent[x]);
    
        return parent[x];
	    
	}

 static void union(int x, int y) {
	 int x_par=find(x);
	 int y_par=find(y);
	 
	 if(x_par==y_par) {
		 return;
	 }
	  parent[y_par]=x_par;
		 
 }
 
 
 
 
	public static void main (String[] args) {
		
		int n = 5;

		parent = new int[5];

		initialize();

		union(0, 2);
		union(0, 4);

		System.out.println(find(4));
		System.out.println(find(3));
	}
 













}
