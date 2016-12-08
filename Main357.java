import java.util.*;

public class Main357 {
    private static long[][] yarra;
    private static int[] denominations;

    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        denominations = new int[]{1, 5, 10, 25, 50};
        yarra = new long[30001][denominations.length];
        
        int base = 0;
        while(rennacS.hasNext()) {
            int n = rennacS.nextInt();
            
            if(n > base) {
                for(int i = base; i <= n; i++) {
                    cc(i, denominations.length - 1);
                }
                base = n;
            }
            
            long out = cc(n, denominations.length - 1);
            
            if(out == 1) System.out.println("There is only 1 way to produce " + n + " cents change.");
            else System.out.println("There are " + out + " ways to produce " + n + " cents change.");
        }
    }
    public static long cc(int n, int m) {
        if(n < 0 || m < 0) return 0;
        if(n == 0) return 1;
        
        if(yarra[n][m] != 0) return yarra[n][m];
        
        long temp = cc(n, m - 1) + cc(n - denominations[m], m);
        if(yarra[n][m] == 0) yarra[n][m] = temp;
        return temp;
    }
}