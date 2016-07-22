package com.mani.gayi.ds.graph;

//Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
public class DFSDetectCycle {
	private int totalvertices; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	DFSDetectCycle(int v) {
		this.totalvertices = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
	}

	// This function is a variation of DFSUytil() in
	// http://www.geeksforgeeks.org/archives/18212
	boolean isCyclicUtil(int v, boolean visited[], boolean recStack[]) {
		
		System.out.println("Recieved the vertex : "+v);
		
				if (visited[v] == false) {
			// Mark the current node as visited and part of recursion stack
			visited[v] = true;
			recStack[v] = true;

			// Recur for all the vertices adjacent to this vertex
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int index = i.next();
				if (!visited[index] && isCyclicUtil(index, visited, recStack)){
					System.out.println("Returning True from annd");
					return true;
				}
				else if (recStack[index]){
				System.out.println("returning from rec stack");
					return true;
				}
			}

		}
		recStack[v] = false; // remove the vertex from recursion stack
		return false;
	}

	// Returns true if the graph contains a cycle, else false.
	// This function is a variation of DFS() in
	// http://www.geeksforgeeks.org/archives/18212
	boolean isCyclic() {
		// Mark all the vertices as not visited and not part of recursion
		// stack
		boolean[] visited = new boolean[totalvertices];
		boolean[] recStack = new boolean[totalvertices];
		for (int i = 0; i < totalvertices; i++) {
			visited[i] = false;
			recStack[i] = false;
		}

		// Call the recursive helper function to detect cycle in different
		// DFS trees
		for (int i = 0; i < totalvertices; i++){
			System.out.println("Called from the vertex "+i);
			if (isCyclicUtil(i, visited, recStack))
			{		return true;
		}
		}
		return false;
	}

	public static void main(String args[]) {
		DFSDetectCycle g = new DFSDetectCycle(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal "
				+ "(starting from vertex 2)");
		boolean result = g.isCyclic();
		
		System.out.println("Cycle : "+result);
	}
}
// This code is contributed by Aakash Hasija
