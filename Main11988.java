import java.util.*;
import java.io.*;

public class Main11988 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String g;
		ArrayDeque<String> deque = new ArrayDeque<String>();
		
		while((g = br.readLine()) != null) {
			deque.clear();
			
			boolean end = true;
			int start = 0;
			
			for(int i = 0; i < g.length(); i++) {
				if(g.charAt(i) == '[' || g.charAt(i) == ']') {
					if(end)
						deque.add(g.substring(start, i));
					else
						deque.addFirst(g.substring(start, i));
					
					start = i + 1;
					end = g.charAt(i) != '[';
				}
				else if(i == g.length() - 1) {
					if(end)
						deque.add(g.substring(start, i + 1));
					else
						deque.addFirst(g.substring(start, i + 1));
				}
			}
			
			while(!deque.isEmpty())
				pw.print(deque.remove());
			
			pw.println();
		}
		
		pw.close();
	}
}