import java.util.Scanner;
import java.math.BigInteger;

public class Main10494 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            BigInteger a = new BigInteger(rennacS.next());
            char operation = rennacS.next().charAt(0);
            BigInteger b = new BigInteger(rennacS.next());
            
            if(operation == '/') System.out.println(a.divide(b));
            else System.out.println(a.mod(b));
        }
    }
}
