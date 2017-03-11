import java.io.*;
import java.util.*;

public class Main12992 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int tC = Integer.parseInt(br.readLine());
		
		for(int z = 1; z <= tC; z++) {
			int n = Integer.parseInt(br.readLine());
			
			pw.println("Case #" + z + ": " + (2*n - 1));
		}
		
		pw.close();
	}
}