import java.util.*;
import java.math.*;

public class Main11489 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int tC = rennacS.nextInt();

        for(int z = 0; z < tC; z++) {
            String g = rennacS.next();
            int divis = 0;
            int plus = 0;
            int minus = 0;

            for(int i = 0; i < g.length(); i++) {
                char digit = g.charAt(i);
                if(digit == '3' || digit == '6' || digit == '9') divis++;
                else if(digit == '1' || digit == '4' || digit == '7') minus++;
                else plus++;
            }
            BigInteger three = new BigInteger("3");
            int mod = new BigInteger(g).mod(three).intValue();

            int ident = 0;

            if(mod == 1) ident--;
            else if(mod == 2) ident++;

            boolean sWins = false;
            if(ident == 0) {
                if(divis % 2 == 1) sWins = true;
            }
            else if(ident == 1) {
                if(plus != 0) {
                        if(divis % 2 == 0) sWins = true;
                }
            }
            else {
                if(minus != 0) {
                    if(divis % 2 == 0) sWins = true;
                }
            }
            System.out.print("Case " + (z+1) + ": ");
            if(sWins) System.out.println("S");
            else System.out.println("T");
        }
    }
}