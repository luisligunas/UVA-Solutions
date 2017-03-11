import java.io.*;
import java.util.*;

public class Main12955 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int[] factorial;
	
	public static void main(String[] args) throws IOException {
		fillFact();
		
		String g;
		while((g = br.readLine()) != null) {
			int n = Integer.parseInt(g);
			
			int count = 0;
			int i = factorial.length - 1;
			while(n > 0) {
				int temp = n/factorial[i];
				count += temp;
				n -= temp*factorial[i];
				i--;
			}
			pw.println(count);
		}
		
		pw.close();
	}
	public static void fillFact() {
		factorial = new int[9];
		factorial[0] = 1;
		
		for(int i = 1; i < factorial.length; i++) {
			factorial[i] = factorial[i-1]*i;
		}
	}
}