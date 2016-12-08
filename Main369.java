import java.util.*;
import java.math.BigInteger;

public class Main369 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int nah = rennacS.nextInt();
            int mah = rennacS.nextInt();
            if(nah + mah == 0) break;
            
            BigInteger n = new BigInteger(nah + "");
            BigInteger m = new BigInteger(mah + "");
            BigInteger up = BigInteger.ONE;
            BigInteger down = BigInteger.ONE;
            
            for(BigInteger i = BigInteger.ONE; i.compareTo(m) <= 0; i = i.add(BigInteger.ONE)) {
                up = up.multiply((n.subtract(m)).add(i));
                down = down.multiply(i);
            }
            up = up.divide(down);
            
            System.out.println(n + " things taken " + m + " at a time is " + up.toString() + " exactly.");
        }
    }
}
