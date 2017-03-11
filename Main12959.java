import java.io.*;
import java.util.*;

public class Main12959 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String g;
		String[] split;
		
		while((g = br.readLine()) != null) {
			split = g.split(" ");
			
			int players = Integer.parseInt(split[0]);
			int turns = Integer.parseInt(split[1]);
			
			int[] points = new int[players];
			split = br.readLine().split(" ");
			
			int i = 0;
			while(i < split.length) points[i % players] += Integer.parseInt(split[i++]);
			
			int max = 0;
			for(int j = 0; j < points.length; j++) {
				max = Math.max(max, points[j]);
			}
			for(int j = points.length - 1; j >= 0; j--) {
				if(points[j] == max) {
					pw.println(j + 1);
					break;
				}
			}
		} 
		
		pw.close();
	}
}