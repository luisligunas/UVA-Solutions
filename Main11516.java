import java.util.*;
import java.io.*;

public class Main11516 {
    static int routers, houses;
    static double[] yarra;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        
        int tC = Integer.parseInt(br.readLine());
        yarra = new double[100000];
        Arrays.fill(yarra, Double.MAX_VALUE);
        houses = 0;
        
        for(int z = 0; z < tC; z++) {
            String[] thing = br.readLine().split(" ");
            routers = Integer.parseInt(thing[0]);
            houses = Integer.parseInt(thing[1]);
            
            Arrays.fill(yarra, Double.MAX_VALUE);
            
            for(int i = 0; i < houses; i++) yarra[i] = Double.parseDouble(br.readLine());
            if(routers >= houses) {
                pw.println("0.0");
                continue;
            }
            Arrays.sort(yarra);
            
            double left = 0;
            double right = yarra[houses - 1] + 1;
            
            while(right - left > 0.01) {
                double mid = (left + right)/2;
                
                if(pweds(mid)) right = mid;
                else left = mid;
            }
            pw.printf("%.1f\n", right);
        }
        pw.close();
    }
    public static boolean pweds(double strength) {
        int used = 0;
        double currLeft = yarra[0];
        
        for(int i = 1; i < houses; i++) {
            if(currLeft + strength*2 < yarra[i]) {
                currLeft = yarra[i];
                used++;
            }
        }
        return used < routers;
    }
}