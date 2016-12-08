import java.util.Scanner;

public class Main12602 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            String g = rennacS.next();
            long diHexaDecimal = base26ToBase10(g.substring(0, 3));
            int decimal = Integer.parseInt(g.substring(4));
            
            if(Math.abs(diHexaDecimal - decimal) <= 100) System.out.println("nice");
            else System.out.println("not nice");
        }
    }
    public static long base26ToBase10(String g) {
        long out = 0;
        for(int i = 0; i < g.length(); i++) {
            int digit = g.charAt(i) - 65;
            out += digit*Math.pow(26, g.length() - 1 - i);
        }
        return out;
    }
}
