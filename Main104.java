import java.io.*;
import java.util.*;

public class Main104 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String str;
        String[] split;
        double[][][] dp = new double[20][20][21];
        double[][] yarra = new double[20][20];
        Queue<State> q = new LinkedList<State>();
        
        while((str = br.readLine()) != null) {
            int dimensions = Integer.parseInt(str.split("\\s+")[0]);
            
            for(int i = 0; i < dimensions; i++) {
                split = br.readLine().split("\\s+");
                for(int j = 0; j < dimensions; j++) {
                    if(i == j) yarra[i][j] = 1;
                    else yarra[i][j] = Double.parseDouble(split[(j > i) ? j-1:j]);
                }
            }
            for(int i = 0; i < dimensions; i++) {
                for(int j = 0; j < dimensions; j++) {
                    Arrays.fill(dp[i][j], -1);
                }
            }
            q.clear();
            for(int i = 0; i < dimensions; i++) q.add(new State(i, 0, i, 1, (i+1) + ""));
            
            boolean exists = false;
            
            while(!q.isEmpty()) {
                State s = q.remove();
                
                if(dp[s.start][s.currCurrency][s.conversions] >= s.value) continue;
                dp[s.start][s.currCurrency][s.conversions] = s.value;
                
                if(s.currCurrency == s.start) {
                    if(s.value > 1.01) {
                        pw.println(s.seq);
                        exists = true;
                        break;
                    }
                    if(s.conversions + 1 >= dimensions) continue;
                }
                else if(s.conversions + 1 == dimensions) {
                    double temp = s.value*yarra[s.currCurrency][s.start];
                    if(temp > dp[s.start][s.start][dimensions]) 
                        q.add(new State(s.start, dimensions, s.start, temp, s.seq + " " + (s.start + 1)));
                    continue;
                }
                
                for(int i = 0; i < dimensions; i++) {
                    if(i == s.currCurrency) continue;
                    double temp = s.value*yarra[s.currCurrency][i];
                    if(temp > dp[s.start][i][s.conversions + 1])
                        q.add(new State(s.start, s.conversions + 1, i, temp, s.seq + " " + (i + 1)));
                }
            }
            if(!exists) pw.println("no arbitrage sequence exists");
        }
        pw.close();
    }
    public static class State {
        int start, conversions, currCurrency;
        double value;
        String seq;
        
        public State(int start, int conversions, int currCurrency, double value, String seq) {
            this.start = start;
            this.conversions = conversions;
            this.currCurrency = currCurrency;
            this.value = value;
            this.seq = seq;
        }
    }
}