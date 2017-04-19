import java.io.*;
import java.util.*;

public class Main10480 {
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static Edge[] pre;
	static boolean[] marked;
	
    public static void main(String[] args) throws IOException {
		String[] split;
		for(int z = 1; true; z++) {
			split = br.readLine().split(" ");
			int n = Integer.parseInt(split[0]);
			int m = Integer.parseInt(split[1]);
			
			if(n == 0 && m == 0) break;
			
			pre = new Edge[n];
			adj.clear();
			for(int i = 0; i < n; i++) adj.add(new ArrayList<Edge>());
			
			
			for(int i = 0; i < m; i++) {
				split = br.readLine().split(" ");
				addEdge(Integer.parseInt(split[0]) - 1, Integer.parseInt(split[1]) - 1, Integer.parseInt(split[2]));
			}
			edmondsKarp(0, 1);
			mark();
			
			for(int i = 0; i < adj.size(); i++) {
				for(int j = 0; j < adj.get(i).size(); j++) {
					if(i > adj.get(i).get(j).v) continue;
					if(marked[i] ^ marked[adj.get(i).get(j).v])
						pw.println((i + 1) + " " + (adj.get(i).get(j).v + 1));
				}
			}
			pw.println();
		}
		pw.close();
	}
	public static void mark() {
		marked = new boolean[pre.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		
		while(!q.isEmpty()) {
			int num = q.remove();
			
			if(marked[num]) continue;
			marked[num] = true;
			
			for(int i = 0; i < adj.get(num).size(); i++) {
				if(marked[adj.get(num).get(i).v]) continue;
				if(adj.get(num).get(i).flow == adj.get(num).get(i).cap) continue;
				
				q.add(adj.get(num).get(i).v);
			}
		}
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
	public static void edmondsKarp(int s, int t) {
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
		}
	}
}