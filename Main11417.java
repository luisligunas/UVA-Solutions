import java.util.*;

public class Main11417 {
    static int[][] yarra;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        yarra = new int[501][501];
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            int out = 0;
            for(int i = 1; i < num; i++) {
                for(int j = i + 1; j <= num; j++) {
                    out += gcd(i, j);
                }
            }
            System.out.println(out);
        }
    }
    public static int gcd(int a, int b) {
        if(yarra[a][b] != 0) return yarra[a][b];
        if(a*b == 0) return a+b;
        yarra[a][b] = gcd(b, a%b);
        return yarra[a][b];
    }
}
