import java.util.Scanner;
import java.math.BigInteger;

public class Main10106 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            System.out.println(new BigInteger(rennacS.next()).multiply(new BigInteger(rennacS.next())));
        }
    }
}
