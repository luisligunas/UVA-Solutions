import java.io.*;
import java.util.*;

public class Main10235 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static boolean[] prime = new boolean[1000000];
	
	public static void main(String[] args) throws IOException {
		fillSieve();
		
		String g;
		int num, num2;
		
		while((g = br.readLine()) != null) {
			g = g.split("\\s+")[0];
			num = Integer.parseInt(g);
			num2 = Integer.parseInt(palindrome(g));
			
			if(!prime[num]) pw.println(num + " is not prime.");
			else if(!prime[num2]) pw.println(num + " is prime.");
			else if(num != num2) pw.println(num + " is emirp.");
			else pw.println(num + " is prime.");
		}
		
		pw.close();
	}
	public static String palindrome(String g) {
		StringBuilder newString = new StringBuilder();
		for(int i = g.length() - 1; i >= 0; i--) {
			newString.append(g.charAt(i));
		}
		return newString.toString();
	}
	public static void fillSieve() {
		Arrays.fill(prime, true);
		for(int i = 2; i < prime.length; i++) {
			for(int j = 2; i*j < prime.length; j++) {
				prime[i*j] = false;
			}
		}
	}
}