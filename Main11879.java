import java.util.*;
import java.math.BigInteger;

public class Main11879 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String g = rennacS.next();
            if(g.equals("0")) break;
            
            BigInteger num = new BigInteger(g);
            
            while(g.length() > 17) {
                int dig = Integer.parseInt(g.substring(g.length() - 1));
                num = new BigInteger(g.substring(0, g.length() - 1));
                num = num.subtract(new BigInteger(5*dig + ""));
                g = num.toString();
            }
            long thing = num.longValue();
            if(thing % 17 == 0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
