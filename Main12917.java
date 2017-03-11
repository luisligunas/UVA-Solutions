import java.io.*;
import java.util.*;

public class Main12917 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String g;
		String[] split;
		
		while((g = br.readLine()) != null) {
			split = g.split(" ");
			
			int p = Integer.parseInt(split[0]);
			int h = Integer.parseInt(split[1]);
			int o = Integer.parseInt(split[2]);
			
			if(o - p >= h) pw.println("Props win!");
			else pw.println("Hunters win!");
		} 
		
		pw.close();
	}
}