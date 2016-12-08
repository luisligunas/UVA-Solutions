import java.util.Scanner;
import java.math.BigInteger;

public class Main10925 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        for(int i = 1; true; i++) {
            int n = rennacS.nextInt();
            String f = rennacS.next();
            if(n + Integer.parseInt(f) == 0) break;

            BigInteger s = BigInteger.ZERO;
            for(int j = 0; j < n; j++) s = s.add(new BigInteger(rennacS.next()));

            System.out.println("Bill #" + i + " costs " + s + ": each friend should pay " + s.divide(new BigInteger(f)) + "\n");
        }
    }
}