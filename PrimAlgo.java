import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class PrimAlgo { 
    private static final int vertex = 5; 
  
    int minKey(int key[], Boolean mstSet[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < vertex; v++) 
            if (mstSet[v] == false && key[v] < min) { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
    void printPrim(int parent[], int graph[][]) 
    { 
        System.out.println("Edge \t\t Weight"); 
        for (int i = 1; i < vertex; i++) 
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]); 
    } 
  
    

    void prim(int graph[][]) 
    { 
        int parent[] = new int[vertex]; 
  
        // Key values used to pick minimum weight edge in cut 
        int key[] = new int[vertex]; 
  
        // To represent set of vertices
        Boolean mstSet[] = new Boolean[vertex]; 
  
        // Initialize all keys as INFINITE 
        for (int i = 0; i < vertex; i++) { 
            key[i] = Integer.MAX_VALUE; 
            mstSet[i] = false; 
        } 
  
        // Always include first 1st vertex 
        key[0] = 0; // Make key 0 so that this vertex is 
        // picked as first vertex 
        parent[0] = -1; // First node is always root of MST 
  
        for (int count = 0; count < vertex - 1; count++) { 
            int u = minKey(key, mstSet); 
  
            mstSet[u] = true; 
  
            for (int v = 0; v < vertex; v++) 
  
              
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  
        // print the constructed 
        printPrim(parent, graph); 
    } 
  
    public static void main(String[] args) 
    { 
       
          
        PrimAlgo t = new PrimAlgo(); 
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
                                      { 2, 0, 3, 8, 5 }, 
                                      { 0, 3, 0, 0, 7 }, 
                                      { 6, 8, 0, 0, 9 }, 
                                      { 0, 5, 7, 9, 0 } }; 
   
        t.prim(graph); 
    } 
} 