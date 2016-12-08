import java.util.Scanner;

public class Main389 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String num = rennacS.next();
            while(true) {
                if(num.length() == 1) break;
                else if(num.charAt(0) == '0') num = num.substring(1);
                else break;
            }
            int currBase = rennacS.nextInt();
            int newBase = rennacS.nextInt();
            
            String temp = baseTenToBaseN(convertToBaseTen(num, currBase), newBase);
            if(temp.length() > 7) System.out.println("  ERROR");
            else if(temp.length() == 1) System.out.println("      " + temp);
            else if(temp.length() == 2) System.out.println("     " + temp);
            else if(temp.length() == 3) System.out.println("    " + temp);
            else if(temp.length() == 4) System.out.println("   " + temp);
            else if(temp.length() == 5) System.out.println("  " + temp);
            else if(temp.length() == 6) System.out.println(" " + temp);
            else System.out.println(temp);
        }
    }
    public static long convertToBaseTen(String g, int base) {
        long out = 0;
        for(int i = 0; i < g.length(); i++) {
            int digit = g.charAt(i);
            if(digit > 64) digit -= 55;
            else digit -= 48;
            out += digit*Math.pow(base, g.length() - 1 - i);
        }
        return out;
    }
    public static String baseTenToBaseN(long l, int n) {
        if(l == 0) return "0";
        String out = "";
        while(true) {
            if(l == 0) break;
            long temp = l%n;
            if(temp == 10) out = "A" + out;
            else if(temp == 11) out = "B" + out;
            else if(temp == 12) out = "C" + out;
            else if(temp == 13) out = "D" + out;
            else if(temp == 14) out = "E" + out;
            else if(temp == 15) out = "F" + out;
            else out = temp + out;
            l /= n;
        }
        return out;
    }
}
