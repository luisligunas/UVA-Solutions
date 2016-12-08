import java.io.*;

public class Main12043 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static long[] sum, num;
    static int SIZE;
    
    public static void main(String[] args) throws IOException {
        fillSieve();
        
        int tC = Integer.parseInt(br.readLine());
        String[] split;
        
        for(int z = 0; z < tC; z++) {
            split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);
            
            if(a % c != 0) a += (c - (a%c));
            
            long totalSum = 0;
            long totalNum = 0;
            
            for(; a <= b; a += c) {
                totalSum += sum[a];
                totalNum += num[a];
            }
            pw.println(totalNum + " " + totalSum);
        }
        
        pw.close();
    }
    public static void fillSieve() {
        SIZE = 100001;
        sum = new long[SIZE];
        num = new long[SIZE];
        
        for(int i = 1; i < SIZE; i++) {
            for(int j = 1; i*j < SIZE; j++) {
                sum[i*j] += i;
                num[i*j]++;
            }
        }
    }
}
