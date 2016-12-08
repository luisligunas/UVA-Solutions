import java.util.*;

public class Main10003 {
    static int[] yarra;
    static int[][] dp;
    
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int length = rennacS.nextInt();
            if(length == 0) break;
            
            int cuts = rennacS.nextInt();
            yarra = new int[cuts + 2];
            dp = new int[cuts + 2][cuts + 2];
            
            yarra[0] = 0;
            for(int i = 1; i <= cuts; i++) yarra[i] = rennacS.nextInt();
            yarra[cuts + 1] = length;
            
            System.out.println("The minimum cutting is " + cut(0, cuts+1) + ".");
        }
    }
    public static int cut(int start, int end) {
        if(dp[start][end] != 0) return dp[start][end];
        if(end - start == 2) return yarra[end] - yarra[start];
        if(end - start == 1) return 0;
        
        int min = Integer.MAX_VALUE;
        for(int i = start + 1; i < end; i++) {
            min = Math.min(min, cut(start, i) + cut(i, end) + yarra[end] - yarra[start]);
        }
        
        dp[start][end] = min;
        return min;
    }
}