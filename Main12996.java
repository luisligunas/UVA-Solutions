import java.io.*;
import java.util.*;

public class Main12996 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int tC = Integer.parseInt(br.readLine());
		String[] split;
		
		for(int z = 0; z < tC; z++) {
			split = br.readLine().split(" ");
			int plates = Integer.parseInt(split[0]);
			int limit = Integer.parseInt(split[1]);
			
			int[] onPlate = new int[plates];
			int[] plateLimits = new int[plates];
			
			split = br.readLine().split(" ");
			for(int i = 0; i < plates; i++) {
				onPlate[i] = Integer.parseInt(split[i]);
			}
			
			split = br.readLine().split(" ");
			for(int i = 0; i < plates; i++) {
				plateLimits[i] = Integer.parseInt(split[i]);
			}
			
			int sum = sum(onPlate);
			
			pw.print("Case " + (z + 1) + ": ");
			if(sum <= limit && allLessOrEqual(onPlate, plateLimits)) pw.println("Yes");
			else pw.println("No");
		}
		
		pw.close();
	}
	public static boolean allLessOrEqual(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] > b[i]) return false;
		}
		return true;
	}
	public static int sum(int[] yarra) {
		int sum = 0;
		for(int i = 0; i < yarra.length; i++) {
			sum += yarra[i];
		}
		return sum;
	}
}