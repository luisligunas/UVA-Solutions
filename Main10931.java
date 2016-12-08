import java.util.*;

public class Main10931 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int n = rennacS.nextInt();
            if(n == 0) break;
            
            System.out.println("The parity of " + Integer.toBinaryString(n) + " is " + Integer.bitCount(n) + " (mod 2).");
        }
    }
}
