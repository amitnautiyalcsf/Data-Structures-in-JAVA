package graphDataStructure;

import java.util.ArrayList;

public class Graph {
	
	int vCount; // no of vertices 
	int eCount;// no of edges
	private ArrayList[] adjacents;// array of Integer List
	
	public Graph(int vCount)
	{
		this.vCount=vCount;
		this.eCount=0;
		adjacents= new ArrayList[vCount];
	for(int i=0;i<vCount;i++)
	{
		
		adjacents[i]=new ArrayList();
		
	}
	
	}
	
	public int getVertexCount()
	{
		return vCount;
		
		
	}
	
	public int getEdgeCount()
	{
		
		return eCount;
		
	}
	
	public void addEdge(int src, int dest)
	{
		adjacents[src].add(dest);
		eCount++;
		
		
	}
	
	public Object[] adj(int src)
	{
		
		return adjacents[src].toArray();
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(3, 5);
	 Object[] value = g.adj(3);
	 for(Object o : value)
	 {
		 System.out.print(o);
		 
	 }
		
	}
	
	
	
	
	
	
	
	

}
