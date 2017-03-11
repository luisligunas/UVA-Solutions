import java.io.*;
import java.util.*;

public class Main12918 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int tC = Integer.parseInt(br.readLine());
		String[] split;
		
		for(int z = 0; z < tC; z++) {
			split = br.readLine().split(" ");
			
			int k = Integer.parseInt(split[0]);
			int h = Integer.parseInt(split[1]);
			
			pw.println(k*(h - k) + k*(k - 1)/2);
		} 
		
		pw.close();
	}
}