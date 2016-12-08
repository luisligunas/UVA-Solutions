import java.io.*;

public class Main11413 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static long[] yarra;
    static int vessels, containers;
    
    public static void main(String[] args) throws IOException {
        String inp;
        String[] split;
        yarra = new long[1005];
        
        while((inp = br.readLine()) != null && !inp.isEmpty()) {
            split = inp.split(" ");
            vessels = Integer.parseInt(split[0]);
            containers = Integer.parseInt(split[1]);
            
            split = br.readLine().split(" ");
            
            long left = 0;
            long right = 1;
            for(int i = 0; i < vessels; i++) {
                yarra[i] = Long.parseLong(split[i]);
                right += yarra[i];
            }
            
            while(right - left >= 2) {
                long mid = (left + right)/2;
                
                if(valid(mid)) right = mid;
                else left = mid;
            }
            pw.println(right);
        }
        
        pw.close();
    }
    public static boolean valid(long limit) {
        long curr = 0;
        long usedUp = 1;
        
        for(int i = 0; i < vessels; i++) {
            if(curr + yarra[i] < limit) curr += yarra[i];
            else if(curr + yarra[i] == limit) {
                if(i < vessels - 1) usedUp++;
                curr = 0;
            }
            else {
                usedUp++;
                curr = yarra[i];
            }
            
            if(usedUp > containers || yarra[i] > limit) return false;
        }
        return usedUp <= containers;
    }
}