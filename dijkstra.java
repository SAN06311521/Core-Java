import java.util.*;
import java.lang.*;
import java.io.*;

//This is the program for finding shortest path via adjacency matrix representation of graph

class DijkstraAlgorithm {
	static final int vertex = 9;
	int minDis(int dist[], Boolean sptSet[]) {
		
		//initialization of min value
		int min = Integer.MAX_VALUE, min_index = -1;
		
		for(int v = 0; v < vertex; v++) 
			if(sptSet[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}	
	
	//function to print constructed distance
	void printSolution(int dist[]) {
		System.out.println("Vertex \t \t Distance from Source");
		for(int i = 0; i < vertex; i++) {
			System.out.println(i + "\t\t" + dist[i]);
		}
	}

	//representation
	void dijkstra(int graph[][], int src) {
		int dist[] = new int[vertex];
		Boolean sptSet[] = new Boolean[vertex];
		
		//initializing ditance infinite
		for(int i = 0; i < vertex; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		dist[src] = 0; //distance to itself is always zero
		
		//finding the shortest path
		for(int count = 0; count < vertex - 1; count++) {
			int u = minDis(dist, sptSet);
			sptSet[u] = true;
			for(int v = 0; v < vertex; v++) 
				if(!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
					dist[v] = dist[u] + graph[u][v];
				}
		}
		printSolution(dist);
	}

		public static void main(String args[]) {
			int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      			{ 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      			{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      			{ 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      			{ 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      			{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      			{ 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      			{ 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      			{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
			DijkstraAlgorithm t = new DijkstraAlgorithm();
			t.dijkstra(graph, 0);
		}
}