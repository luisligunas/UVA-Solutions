import java.util.Scanner;

public class Main12149 {
    static long[] yarra = new long[100];
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        while(true) {
            int n = rennacS.nextInt();
            if(n == 0) break;
            
            System.out.println(yarra[n-1]);
        }
    }
    public static void fillSieve() {
        yarra[0] = 1;
        for(int i = 1; i < 100; i++) yarra[i] = yarra[i-1] + (i+1)*(i+1);
    }
}