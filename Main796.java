import java.io.*;
import java.util.*;

public class Main796 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int n, ID;
	static int[] id, low;
	static ArrayList<ArrayList<Integer>> adj;
	static ArrayList<Pair> bridges;
	static boolean[] art;
	
	public static void main(String[] args) throws IOException {
		String[] split;
		adj = new ArrayList<ArrayList<Integer>>();
		bridges = new ArrayList<Pair>();
		String g;
		
		while((g = br.readLine()) != null) {
			ID = 0;
			
			n = Integer.parseInt(g);
			id = new int[n];
			low = new int[n];
			art = new boolean[n];
			adj.clear();
			
			for(int i = 0; i < n; i++)
				adj.add(new ArrayList<Integer>());
			
			for(int i = 0; i < n; i++) {
				split = br.readLine().split(" ");
				int server = Integer.parseInt(split[0]);
				if(split.length > 2) {
					for(int j = 2; j < split.length; j++) {
						adj.get(server).add(Integer.parseInt(split[j]));
					}
				}
			}
			br.readLine();
			tarjan();
			pw.println(bridges.size() + " critical links");
			Collections.sort(bridges);
			
			for(Pair p : bridges)
				pw.println(p.x + " - " + p.y);
			pw.println();
		}
		
		pw.close();
	}
	
	public static class Pair implements Comparable<Pair> {
		int x, y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Pair p) {
			if(x == p.x)
				return y - p.y;
			return x - p.x;
		}
	}
	
	public static void dfs(int u, int p) {
		id[u] = low[u] = ID++;
		int ch = 0;
		for(int v : adj.get(u)) {
			if(id[v] == -1) {
				++ch;
				dfs(v, u);
				low[u] = Math.min(low[u], low[v]);
				if(id[u] < low[v])
					bridges.add(new Pair(Math.min(u, v), Math.max(u, v)));
				if(id[u] <= low[v] && p != -1)
					art[u] = true;
			}
			else if(v != p)
				low[u] = Math.min(low[u], id[v]);
		}
		if(p == -1)
			art[u] = ch >= 2;
	}
	
	public static void tarjan() {
		Arrays.fill(id, -1);
		Arrays.fill(art, false);
		ID = 0;
		bridges.clear();
		for(int i = 0; i < n; ++i)
			if(id[i] == -1)
				dfs(i, -1);
	}
}
