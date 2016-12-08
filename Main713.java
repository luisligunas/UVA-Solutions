import java.util.Scanner;
import java.math.BigInteger;

public class Main713 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            BigInteger a = new BigInteger(reverseString(rennacS.next()));
            BigInteger b = new BigInteger(reverseString(rennacS.next()));
            a = new BigInteger(reverseString(a.add(b).toString()));
            
            System.out.println(a);
        }
    }
    public static String reverseString(String g) {
        String out = "";
        for(int i = 0; i < g.length(); i++) {
            out += g.substring(g.length() - i - 1, g.length() - i);
        }
        return out;
    }
}
