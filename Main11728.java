import java.io.*;
import java.util.Arrays;

public class Main11728 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Sum[] yarra;
    
    public static void main(String[] args) throws IOException {
        fillYarra();
        
        String inp;
        for(int z = 1; (inp = br.readLine()) != null; z++) {
            int sum = Integer.parseInt(inp);
            if(sum == 0) break;
            pw.print("Case " + z + ": ");
            
            int left = 0;
            int right = 999;
            
            if(sum == yarra[left].sum) {
                pw.println(yarra[left].num);
                continue;
            }
            if(sum == yarra[right].sum) {
                pw.println(yarra[right].num);
                continue;
            }
            
            boolean done = false;
            while(right - left >= 2) {
                int mid = (left + right)/2;
                
                if(yarra[mid].sum == sum) {
                    while(yarra[mid + 1].sum == sum) mid++;
                    pw.println(yarra[mid].num);
                    done = true;
                    break;
                }
                if(yarra[mid].sum < sum) left = mid;
                else right = mid;
            }
            if(!done) pw.println(-1);
        }
        
        pw.close();
    }
    public static void fillYarra() {
        yarra = new Sum[1000];
        yarra[0] = new Sum(1, 1);
        yarra[1] = new Sum(2, 3);
        
        for(int i = 3; i < 1001; i++) {
            int fact = 0;
            for(int j = 1; j < Math.sqrt(i); j++) {
                if(i % j == 0) fact += j + i/j;
            }
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i) fact += (int)Math.sqrt(i);
            yarra[i - 1] = new Sum(i, fact);
        }
        Arrays.sort(yarra);
    }
    public static class Sum implements Comparable<Sum> {
        int num, sum;
        
        public Sum(int num, int sum) {
            this.num = num;
            this.sum = sum;
        }
        
        @Override
        public int compareTo(Sum s) {
            if(sum == s.sum) return num - s.num;
            return sum - s.sum;
        }
    }
}
