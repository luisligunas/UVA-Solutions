//I figured out the math of the squares and the 2D rectangles, but I couldn't figure out the 3D and 4D rectangles. They can be pregenerated though since N <= 100.

/*
import java.util.*;
import java.io.*;

public class Rawr {
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		long[] yarra = new long[101];
		
		
		for(int ind = 0; ind < 101; ind++) {
			long total = 0;
			for(int i = 1; i <= ind; i++) {
				for(int j = 1; j <= ind; j++) {
					for(int k = 1; k <= ind; k++) {
						if(i == j && j == k) continue;
						
						long a = (ind - i + 1);
						long b = (ind - j + 1);
						long c = (ind - k + 1);
						long add = a*b*c;
						total += add;
					}
				}
			}
			yarra[ind] = total;
		}
		
		pw.print("{");
		for(int i = 0; i < yarra.length; i++) {
			pw.print(yarra[i] + "L, ");
		}
		pw.println("}");
		
		for(int ind = 0; ind < 101; ind++) {
			long total = 0;
			for(int i = 1; i <= ind; i++) {
				for(int j = 1; j <= ind; j++) {
					for(int k = 1; k <= ind; k++) {
						for(int l = 1; l <= ind; l++) {
							if(i == j && j == k && k == l) continue;
							
							long a = (ind - i + 1);
							long b = (ind - j + 1);
							long c = (ind - k + 1);
							long d = (ind - l + 1);
							long add = a*b*c*d;
							total += add;
						}
					}
				}
			}
			yarra[ind] = total;
		}
		
		pw.print("{");
		for(int i = 0; i < yarra.length; i++) {
			pw.print(yarra[i] + "L, ");
		}
		pw.println("}");
		
		pw.close();
	}
}
*/


import java.util.*;
import java.io.*;

public class Main10177 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static long[][] s = new long[3][101];
	static long[][] r = new long[3][101];
	
	
	public static void main(String[] args) throws IOException {
		pregenSquares();
		pregenRectangles();
		
		String g;
		while((g = br.readLine()) != null) {
			int n = Integer.parseInt(g);
			
			pw.println(s[0][n] + " " + r[0][n] + " " + s[1][n] + " " + r[1][n] + " " + s[2][n] + " " + r[2][n]);
		}
		
		pw.close();
	}
	public static void pregenRectangles() {
		for(int i = 2; i < 101; i++) {
			r[0][i] = r[0][i-1] + i*i*(i-1);
		}
		r[1] = new long[] {0L, 0L, 18L, 180L, 900L, 3150L, 8820L, 21168L, 45360L, 89100L, 163350L, 283140L, 468468L, 745290L, 1146600L, 1713600L, 2496960L, 3558168L, 4970970L, 6822900L, 9216900L, 12273030L, 16130268L, 20948400L, 26910000L, 34222500L, 43120350L, 53867268L, 66758580L, 82123650L, 100328400L, 121777920L, 146919168L, 176243760L, 210290850L, 249650100L, 294964740L, 346934718L, 406319940L, 473943600L, 550695600L, 637536060L, 735498918L, 845695620L, 969318900L, 1107646650L, 1262045880L, 1433976768L, 1624996800L, 1836765000L, 2071046250L, 2329715700L, 2614763268L, 2928298230L, 3272553900L, 3649892400L, 4062809520L, 4513939668L, 5006060910L, 5542100100L, 6125138100L, 6758415090L, 7445335968L, 8189475840L, 8994585600L, 9864597600L, 10803631410L, 11815999668L, 12906214020L, 14078991150L, 15339258900L, 16692162480L, 18143070768L, 19697582700L, 21361533750L, 23141002500L, 25042317300L, 27072063018L, 29237087880L, 31544510400L, 34001726400L, 36616416120L, 39396551418L, 42350403060L, 45486548100L, 48813877350L, 52341602940L, 56079265968L, 60036744240L, 64224260100L, 68652388350L, 73332064260L, 78274591668L, 83491651170L, 88995308400L, 94798022400L, 100912654080L, 107352474768L, 114131174850L, 121262872500L, 128762122500L};
		r[2] = new long[] {0L, 0L, 64L, 1198L, 9646L, 49646L, 192206L, 609980L, 1670844L, 4085292L, 9125292L, 18934762L, 36954346L, 68485690L, 121422938L, 207181688L, 341858168L, 547653912L, 854603736L, 1302647334L, 1944087334L, 2846479174L, 4096000678L, 5801351732L, 8098236980L, 11154486980L, 15175875780L, 20412695394L, 27167150178L, 35801636626L, 46747976626L, 60517674736L, 77713272560L, 99040875824L, 125323932272L, 157518341022L, 196728976542L, 244227712926L, 301473036670L, 370131338668L, 452099978668L, 549532217948L, 664864118492L, 800843509466L, 960561124314L, 1147484014314L, 1365491346954L, 1618912700008L, 1912568964712L, 2251815973960L, 2642590973960L, 3091462060310L, 3605680701974L, 4193237479158L, 4862921163606L, 5624381272356L, 6488194228516L, 7465933265140L, 8570242210804L, 9814913298002L, 11214969138002L, 12786749008322L, 14547999601506L, 16517970386400L, 18717513735648L, 21169189975648L, 23897377517728L, 26928388231822L, 30290588226446L, 34014524201294L, 38133055541294L, 42681492323484L, 47697739410588L, 53222446807692L, 59299166460940L, 65974515679690L, 73298347366090L, 81323927238554L, 90108118238138L, 99711572309336L, 110198929749336L, 121639026322296L, 134105108337720L, 147675055894534L, 162431614494982L, 178462635234982L, 195861323780102L, 214726498338836L, 235162856847380L, 257281253582628L, 281198985422628L, 307040087976258L, 334935641806402L, 365024088973426L, 397451560128274L, 432372212387024L, 469948578221264L, 510351925601168L, 553762629630672L, 600370555916670L, 650375455916670L};
	}
	
	
	public static void pregenSquares() {
		for(int dim = 2; dim <= 4; dim++) {
			for(int i = 1; i < s[0].length; i++) {
				long pow = pow(i, dim);
				
				s[dim - 2][i] = s[dim - 2][i-1] + pow;
			}
		}
	}
	public static long pow(long b, long e) {
		long num = 1;
		while(e-- > 0) num *= b;
		
		return num;
	}
}