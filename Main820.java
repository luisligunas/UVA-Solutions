import java.io.*;
import java.util.*;

public class Main820 {
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static Edge[] pre;
	
    public static void main(String[] args) throws IOException {
		for(int z = 1; true; z++) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			pre = new Edge[N];
			adj.clear();
			for(int i = 0; i < N; i++) adj.add(new ArrayList<Edge>());
			
			String[] split = br.readLine().split(" ");
			int s = Integer.parseInt(split[0]) - 1;
			int t = Integer.parseInt(split[1]) - 1;
			int c = Integer.parseInt(split[2]);
			
			for(int i = 0; i < c; i++) {
				split = br.readLine().split(" ");
				addEdge(Integer.parseInt(split[0]) - 1, Integer.parseInt(split[1]) - 1, Integer.parseInt(split[2]));
			}
			
			pw.println("Network " + z);
			pw.println("The bandwidth is " + edmondsKarp(s, t) + ".\n");
		}
		pw.close();
	}
	public static class Edge {
		int u, v, cap, flow;
		Edge reverse;
		
		public Edge(int u, int v, int cap) {
			this.u = u;
			this.v = v;
			this.cap = cap;
			flow = 0;
		}
	}
	public static void addEdge(int u, int v, int cap) {
		Edge uv = new Edge(u, v, cap);
		Edge vu = new Edge(v, u, cap);
		uv.reverse = vu;
		vu.reverse = uv;
		adj.get(u).add(uv);
		adj.get(v).add(vu);
	}
	public static int edmondsKarp(int s, int t) {
		int maxflow = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		
		while(true) {
			q.clear();
			q.add(s);
			
			Arrays.fill(pre, null);
			while(!q.isEmpty() && pre[t] == null) {
				int u = q.remove();
				for(int i = 0; i < adj.get(u).size(); i++) {
					Edge e = adj.get(u).get(i);
					if(e.cap > e.flow && pre[e.v] == null) {
						pre[e.v] = e;
						q.add(e.v);
					}
				}
			}
			if(pre[t] == null) break;
			
			int flow = Integer.MAX_VALUE;
			for(int v = t; v != s; v = pre[v].u)
				flow = Math.min(flow, pre[v].cap - pre[v].flow);
			for(int v = t; v != s; v = pre[v].u) {
				pre[v].flow += flow;
				pre[v].reverse.flow -= flow;
			}
			maxflow += flow;
		}
		return maxflow;
	}
}