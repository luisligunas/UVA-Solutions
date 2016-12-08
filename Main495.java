import java.util.*;
import java.math.BigInteger;

public class Main495 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        BigInteger[] memo = new BigInteger[5100];
        memo[0] = BigInteger.ZERO;
        memo[1] = BigInteger.ONE;
        int walaPa = 2;
        
        while(rennacS.hasNext()) {
            int a = rennacS.nextInt();
            while(a >= walaPa) {
                memo[walaPa] = memo[walaPa - 2].add(memo[walaPa - 1]);
                walaPa++;
            }
            System.out.println("The Fibonacci number for " + a + " is " + memo[a]);
        }
    }
}