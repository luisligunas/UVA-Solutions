import java.util.Scanner;
import java.math.BigInteger;

public class Main623 {
    static BigInteger[] yarra = new BigInteger[1001];
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        while(rennacS.hasNext()) {
            int n = rennacS.nextInt();
            System.out.println(n + "!\n" + yarra[n]);
        }
    }
    public static void fillSieve() {
        yarra[0] = BigInteger.ONE;
        yarra[1] = BigInteger.ONE;
        for(int i = 2; i < 1001; i++) yarra[i] = yarra[i-1].multiply(new BigInteger(Integer.toString(i)));
    }
}
