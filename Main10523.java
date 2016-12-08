import java.util.Scanner;
import java.math.BigInteger;

public class Main10523 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
             int N = rennacS.nextInt();
             BigInteger A = new BigInteger(rennacS.next());
             
             BigInteger b = BigInteger.ZERO;
             for(int i = 1; i <= N; i++) {
                 BigInteger temp = A.pow(i).multiply(new BigInteger(Integer.toString(i)));
                 b = b.add(temp);
             }
             System.out.println(b);
        }
    }
}
