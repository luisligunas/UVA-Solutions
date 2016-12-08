//May or may not be wrong lol. Output is different for two cases in uDebug.

import java.util.*;
import java.io.*;

public class Main1112 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        PriorityQueue<Node> q = new PriorityQueue<Node>(new DistanceComparator());
        Node[] nodes = new Node[101];
        boolean[] passed = new boolean[101];
        
        for(int z = 0; z < tC; z++) {
            br.readLine();
            int numNodes = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine()) - 1;
            int time = Integer.parseInt(br.readLine());
            int numEdges = Integer.parseInt(br.readLine());

            Edge[] edges = new Edge[numEdges];

            for(int i = 0; i < numNodes; i++) nodes[i] = new Node(i);
            for(int i = 0; i < numEdges; i++) {
                String[] split = br.readLine().split(" ");
                edges[i] = new Edge(Integer.parseInt(split[1]) - 1, Integer.parseInt(split[0]) - 1, Integer.parseInt(split[2]));
                nodes[edges[i].u].add(i);
            }

            q.add(nodes[end]);
            nodes[end].distance = 0;
            
            while(!q.isEmpty()) {
                Node node = q.poll();
                if(passed[node.index]) continue;
                passed[node.index] = true;
                
                for(int i = 0; i < node.edges.size(); i++) {
                    if(!passed[edges[node.edges.get(i)].v]) {
                        q.add(nodes[edges[node.edges.get(i)].v]);
                        
                        nodes[edges[node.edges.get(i)].v].distance = Math.min(nodes[edges[node.edges.get(i)].v].distance, node.distance + edges[node.edges.get(i)].weight);
                    }
                }
            }
            int count = 0;
            for(int i = 0; i < numNodes; i++) {
                if(nodes[i].distance <= time) count++;
            }
            if(z != 0) pw.println("");
            pw.println(count);
            
            q.clear();
            Arrays.fill(nodes, null);
            Arrays.fill(passed, false);
        }
        pw.close();
    }
    public static class DistanceComparator implements Comparator<Node> {
        @Override
        public int compare(Node n1, Node n2) {
            return n1.distance - n2.distance;
        }
        
    }
    public static class Node {
        ArrayList<Integer> edges;
        int distance, index;

        public Node(int index) {
            edges = new ArrayList<Integer>();
            distance = Integer.MAX_VALUE;
            this.index = index;
        }
        public void add(int edge) {
            edges.add(edge);
        }
    }

    public static class Edge {
        int u, v, weight;

        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
}