//kinda stupid. Pweds naman na (n(n+1)/2)^2 lang yung gamitin but whatevs. Not sure which would be faster.

import java.util.Scanner;
import java.math.BigInteger;

public class Main10302 {
    static BigInteger[] yarra = new BigInteger[50000];
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        while(rennacS.hasNext()) {
            System.out.println(yarra[rennacS.nextInt() - 1]);
        }
    }
    public static void fillSieve() {
        yarra[0] = BigInteger.ONE;
        for(int i = 1; i < yarra.length; i++) {
            yarra[i] = yarra[i-1].add(new BigInteger(Integer.toString(i+1)).pow(3));
        }
    }
}
