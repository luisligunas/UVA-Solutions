import java.math.BigInteger;
import java.util.Scanner;

public class Main113 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int exp = rennacS.nextInt();
            BigInteger out = new BigInteger(rennacS.next());
            
            int left = 0;
            int right = 1000000001;
            
            while(true) {
                int now = (left + right)/2;
                if(right - left == 1) now = left + 1;
                
                BigInteger idk = new BigInteger(Integer.toString(now)).pow(exp);
                int leg = idk.compareTo(out);
                if(leg == 0) {
                    System.out.println(now);
                    break;
                }
                else if(leg < 0) left = now;
                else right = now;
            }
        }
    }
}