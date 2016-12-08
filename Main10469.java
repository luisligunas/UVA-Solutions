import java.util.Scanner;

public class Main10469 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String a = baseTenToBinary(rennacS.nextLong());
            String b = baseTenToBinary(rennacS.nextLong());
            while(a.length() < 32) a = "0" + a;
            while(b.length() < 32) b = "0" + b;
            
            int[] yarra = new int[32];
            for(int i = 31; i >= 0; i--) {
                if(a.charAt(i) == '1' && b.charAt(i) == '1') yarra[i] = 0;
                else {
                    if(a.charAt(i) == '1' || b.charAt(i) == '1') yarra[i] = 1;
                    else yarra[i] = 0;
                }
            }
            
            String temp = "";
            for(int i = 0; i < 32; i++) temp += yarra[i];
            System.out.println(binaryToBaseTen(temp));
        }
    }
    public static String baseTenToBinary(long l) {
        if(l == 0) return "0";
        String out = "";
        while(true) {
            if(l == 0) break;
            out = (l%2) + out;
            l /= 2;
        }
        return out;
    }
    public static long binaryToBaseTen(String g) {
        long out = 0;
        for(int i = 0; i < g.length(); i++) {
            int digit = g.charAt(i) - 48;
            out += digit*Math.pow(2, g.length() - 1 - i);
        }
        return out;
    }
}
