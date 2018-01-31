import java.util.*;
import java.io.*;

public class Main978 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] blue = new int[102];
		int[] green = new int[102];
		String[] split;
		
		int[] blueFighter = new int[100001];
		int[] greenFighter = new int[100001];
		
		for(int z = 0; z < n; z++) {
			Arrays.fill(blue, 0);
			Arrays.fill(green, 0);
			
			split = br.readLine().split(" ");
			int rounds = Integer.parseInt(split[0]);
			int numGreen = Integer.parseInt(split[1]);
			int numBlue = Integer.parseInt(split[2]);
			
			for(int i = 0; i < numGreen; i++)
				green[Integer.parseInt(br.readLine())]++;
			
			for(int i = 0; i < numBlue; i++)
				blue[Integer.parseInt(br.readLine())]++;
			
			//NOW FIGHT.
			
			while(true) {
				int fightsNow = Math.min(Math.min(numGreen, numBlue), rounds);
				if(fightsNow == 0)
					break;
				
				int maxGreen = 101;
				int maxBlue = 101;
				
				for(int times = 0; times < fightsNow;) {
					if(green[maxGreen] > 0) {
						greenFighter[times++] = maxGreen;
						green[maxGreen]--;
					}
					else
						maxGreen--;
				}
				
				for(int times = 0; times < fightsNow;) {
					if(blue[maxBlue] > 0) {
						blueFighter[times++] = maxBlue;
						blue[maxBlue]--;
					}
					else
						maxBlue--;
				}
				
				for(int i = 0; i < fightsNow; i++) {
					if(blueFighter[i] > greenFighter[i]) {
						numGreen--;
						blue[blueFighter[i] - greenFighter[i]]++;
					}
					else if(blueFighter[i] == greenFighter[i]) {
						numGreen--;
						numBlue--;
					}
					else {
						numBlue--;
						green[greenFighter[i] - blueFighter[i]]++;
					}
				}
			}
			int maxGreen = 101;
			int maxBlue = 101;
			
			if(numGreen > numBlue) {
				pw.println("green wins");
				while(maxGreen > 0) {
					if(green[maxGreen] > 0) {
						pw.println(maxGreen);
						green[maxGreen]--;
					}
					else
						maxGreen--;
				}
			}
			else if(numGreen < numBlue) {
				pw.println("blue wins");
				while(maxBlue > 0) {
					if(blue[maxBlue] > 0) {
						pw.println(maxBlue);
						blue[maxBlue]--;
					}
					else
						maxBlue--;
				}
			}
			else
				pw.println("green and blue died");
			
			if(z < n-1)
				pw.println();
		}
		
		pw.close();
	}
}
