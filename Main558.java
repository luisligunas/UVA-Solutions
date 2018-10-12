import java.util.*;
import java.io.*;

public class Main558 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int tC = Integer.parseInt(br.readLine());
		String[] split;
		
		int[] dist = new int[1000];
		ArrayList<Edge> edges = new ArrayList<>();
		
		while(tC-- > 0) {
			split = br.readLine().split(" ");
			int n = Integer.parseInt(split[0]);
			int m = Integer.parseInt(split[1]);
			
			edges.clear();
			for(int i = 0; i < n; i++)
				dist[i] = Integer.MAX_VALUE;
			dist[0] = 0;
			
			for(int i = 0; i < m; i++) {
				split = br.readLine().split(" ");
				
				int u = Integer.parseInt(split[0]);
				int v = Integer.parseInt(split[1]);
				int w = Integer.parseInt(split[2]);
				edges.add(new Edge(u, v, w));
			}
			
			for(int i = 0; i < n - 1; i++) {
				for(Edge e : edges)
					dist[e.v] = Math.min(dist[e.v], dist[e.u] + e.w);
			}
			
			boolean possible = false;
			for(Edge e : edges) {
				if(dist[e.u] + e.w < dist[e.v]) {
					possible = true;
					break;
				}
			}
			
			if(possible)
				pw.println("possible");
			else
				pw.println("not possible");
		}
		
		pw.close();
	}
	
	public static class Edge {
		int u, v, w;
		
		public Edge(int a, int b, int c) {
			u = a;
			v = b;
			w = c;
		}
	}
}
