import java.io.*;

public class Main12032 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[] yarra;
    static int numRungs;
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        String[] split;
        yarra = new int[100005];
        
        for(int z = 0; z < tC; z++) {
            numRungs = Integer.parseInt(br.readLine());
            
            split = br.readLine().split(" ");
            for(int i = 0; i < numRungs; i++) yarra[i] = Integer.parseInt(split[i]);
            
            int left = 0;
            int right = yarra[numRungs - 1] + 1;
            
            while(right - left >= 2) {
                int mid = (right + left)/2;
                
                if(valid(mid)) right = mid;
                else left = mid;
            }
            pw.println("Case " + (z+1) + ": " + right);
        }
        pw.close();
    }
    public static boolean valid(int jump) {
        int curr = 0;
        
        for(int i = 0; i < numRungs; i++) {
            if(curr + jump >= yarra[i]) {
                if(curr + jump == yarra[i]) jump--;
                curr = yarra[i];
                continue;
            }
            return false;
        }
        return true;
    }
}