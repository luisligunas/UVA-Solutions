import java.util.*;
import java.io.*;

public class Main929 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int rows, cols;
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        
        int[][] weight = new int[1000][1000];
        boolean[][] visited = new boolean[1000][1000];
        PriorityQueue<Edge> q = new PriorityQueue<Edge>(new CompareBruh());
        
        for(int z = 0; z < tC; z++) {
            rows = Integer.parseInt(br.readLine());
            cols = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < rows; i++) {
                String[] split = br.readLine().split(" ");
                for(int j = 0; j < cols; j++) {
                    weight[i][j] = Integer.parseInt(split[j]);
                    visited[i][j] = false;
                }
            }
            
            q.add(new Edge(0, 0, weight[0][0]));
            
            Edge edge = null;
            while(true) {
                edge = q.poll();
                if(edge.x == rows - 1 && edge.y == cols - 1) break;
                if(visited[edge.x][edge.y]) continue;
                
                visited[edge.x][edge.y] = true;
                
                if(validCoords(edge.x - 1, edge.y) && !visited[edge.x - 1][edge.y]) q.add(new Edge(edge.x - 1, edge.y, edge.weight + weight[edge.x - 1][edge.y]));
                if(validCoords(edge.x + 1, edge.y) && !visited[edge.x + 1][edge.y]) q.add(new Edge(edge.x + 1, edge.y, edge.weight + weight[edge.x + 1][edge.y]));
                if(validCoords(edge.x, edge.y - 1) && !visited[edge.x][edge.y - 1]) q.add(new Edge(edge.x, edge.y - 1, edge.weight + weight[edge.x][edge.y - 1]));
                if(validCoords(edge.x, edge.y + 1) && !visited[edge.x][edge.y + 1]) q.add(new Edge(edge.x, edge.y + 1, edge.weight + weight[edge.x][edge.y + 1]));
            }
            q.clear();
            pw.println(edge.weight);
        }
        
        pw.close();
    }
    public static boolean validCoords(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
    public static class Edge {
        int x, y, weight;
        
        public Edge(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }
    }
    public static class CompareBruh implements Comparator<Edge> {
        @Override
        public int compare(Edge e1, Edge e2) {
            return e1.weight - e2.weight;
        }
    }
}