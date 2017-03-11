import java.io.*;
import java.util.*;

public class Main12908 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		long maxN = (long)((Math.sqrt(800000001) - 1)/2) + 2;
		
		while(true) {
			long num = Long.parseLong(br.readLine());
			if(num == 0) break;
			
			long left = 0, right = maxN, mid = 0;
			
			while(right - left >= 2) {
				mid = (left + right)/2;
				
				if(mid*(mid + 1)/2 > num && mid*(mid - 1)/2 <= num) break;
				if(mid*(mid + 1)/2 <= num) left = mid;
				else right = mid;
			}
			
			long missingPage = mid*(mid + 1)/2 - num;
			
			pw.println(missingPage + " " + mid);
		}
		
		pw.close();
	}
}