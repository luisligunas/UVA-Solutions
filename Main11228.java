import java.util.*;
import java.io.*;

public class Main11228 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Point[] points;
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        
        for(int z = 0; z < tC; z++) {
            String[] split = br.readLine().split(" ");
            int cities = Integer.parseInt(split[0]);
            int threshold = Integer.parseInt(split[1]);
            
            points = new Point[cities];
            
            for(int i = 0; i < cities; i++) {
                split = br.readLine().split(" ");
                points[i] = new Point(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
            boolean[] passed = new boolean[points.length];
            PriorityQueue<Edge> q = new PriorityQueue<Edge>(new ShortestDistance());
            passed[0] = true;
            for(int i = 1; i < points.length; i++) q.add(new Edge(0, i));
            ArrayList<Edge> mst = new ArrayList<Edge>();
            
            while(!q.isEmpty()) {
                Edge edge = q.poll();
                if(passed[edge.u] && passed[edge.v]) continue;
                mst.add(edge);
                
                int notDone = passed[edge.u] ? edge.v : edge.u;
                passed[notDone] = true;
                for(int i = 0; i < points.length; i++) {
                    if(!passed[i]) q.add(new Edge(notDone, i));
                }
            }
            
            double roads = 0;
            double railroads = 0;
            int states = 1;
            
            for(int i = 0; i < mst.size(); i++) {
                if(mst.get(i).distance <= threshold) roads += mst.get(i).distance;
                else {
                    states++;
                    railroads += mst.get(i).distance;
                }
            }
            
            System.out.println("Case #" + (z + 1) + ": " + states + " " + (int)Math.round(roads) + " " + (int)Math.round(railroads));
        }
    }
    public static class ShortestDistance implements Comparator<Edge> {
        double sigma;
        
        public ShortestDistance() {
            sigma = Math.exp(-20);
        }
        
        @Override
        public int compare(Edge e1, Edge e2) {
            if(Math.abs(e1.distance - e2.distance) <= sigma) return 0;
            if(e1.distance - e2.distance < 0) return -1;
            return 1;
        }
    }
    public static class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static class Edge {
        int u, v;
        double distance;
        
        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
            setDistance();
        }
        public void setDistance() {
            double x = points[u].x - points[v].x;
            double y = points[u].y - points[v].y;
            
            distance = Math.sqrt(x*x + y*y);
        }
    }
}