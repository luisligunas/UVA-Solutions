import java.util.Scanner;
import java.math.BigInteger;

public class Main10929 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String g = rennacS.next();
            if(g.equals("0")) break;
            BigInteger n = new BigInteger(g);
            if(n.mod(new BigInteger("11")) == BigInteger.ZERO) System.out.println(g + " is a multiple of 11.");
            else System.out.println(g + " is not a multiple of 11.");
        }
    }
}
