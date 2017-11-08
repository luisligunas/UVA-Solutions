import java.io.*;
import java.util.*;

public class Main315 {
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
		
		while(true) {
			ID = 0;
			n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			id = new int[n];
			low = new int[n];
			art = new boolean[n];
			adj.clear();
			
			for(int i = 0; i < n; i++)
				adj.add(new ArrayList<Integer>());
			
			while(true) {
				String inp = br.readLine();
				if(inp.equals("0"))
					break;
				split = inp.split(" ");
				int[] yarra = new int[split.length];
				for(int i = 0; i < yarra.length; i++)
					yarra[i] = Integer.parseInt(split[i]) - 1;
				
				for(int i = 1; i < yarra.length; i++) {
					adj.get(yarra[0]).add(yarra[i]);
					adj.get(yarra[i]).add(yarra[0]);
				}
			}
			tarjan();
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(art[i])
					count++;
			}
			pw.println(count);
		}
		
		pw.close();
	}
	
	public static class Pair {
		int x, y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
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
