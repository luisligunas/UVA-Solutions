import java.util.*;
import java.math.BigInteger;

public class Main424 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        BigInteger sum = BigInteger.ZERO;
        
        while(true) {
            String num = rennacS.next();
            if(num.equals("0")) break;
            sum = sum.add(new BigInteger(num));
        }
        
        System.out.println(sum);
    }
}