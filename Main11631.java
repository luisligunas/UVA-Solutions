import java.io.*;
import java.util.*;

public class Main11631 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        
        while(true) {
            String[] split = br.readLine().split(" ");
            int numNodes = Integer.parseInt(split[0]);
            int numEdges = Integer.parseInt(split[1]);
            if(numNodes == 0 && numEdges == 0) break;
            
            int totalEdgeLength = 0;
            Edge[] edges = new Edge[numEdges];
            Node[] nodes = new Node[numNodes];
            for(int i = 0; i < numNodes; i++) nodes[i] = new Node();
            
            for(int i = 0; i < numEdges; i++) {
                split = br.readLine().split(" ");
                edges[i] = new Edge(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                nodes[edges[i].u].add(i);
                nodes[edges[i].v].add(i);
                totalEdgeLength += edges[i].distance;
            }
            PriorityQueue<Edge> q = new PriorityQueue<Edge>(new DistanceComparator());
            int mstLength = 0;
            boolean[] passed = new boolean[numNodes];
            passed[0] = true;
            for(int i = 0; i < nodes[0].edges.size(); i++) q.add(edges[nodes[0].edges.get(i)]);
            
            while(!q.isEmpty()) {
                Edge edge = q.poll();
                if(passed[edge.u] && passed[edge.v]) continue;
                mstLength += edge.distance;
                
                int notDone = passed[edge.u] ? edge.v : edge.u;
                passed[notDone] = true;
                for(int i = 0; i < nodes[notDone].edges.size(); i++) q.add(edges[nodes[notDone].edges.get(i)]);
            }
            pw.println(totalEdgeLength - mstLength);
        }
        pw.close();
    }
    public static class Node {
        ArrayList<Integer> edges;
        
        public Node() {
            edges = new ArrayList<Integer>();
        }
        public void add(int edge) {
            edges.add(edge);
        }
    }
    public static class DistanceComparator implements Comparator<Edge> {
        @Override
        public int compare(Edge e1, Edge e2) {
            return e1.distance - e2.distance;
        }
        
    }
    public static class Edge {
        int u, v, distance;
        
        public Edge(int u, int v, int distance) {
            this.u = u;
            this.v = v;
            this.distance = distance;
        }
    }
}