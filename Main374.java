import java.util.*;

public class Main374 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            int c = rennacS.nextInt();
            
            a = a%c;
            
            if(b == 0) a = 1;
            if(a == 1) {
                if(c == 1) System.out.println("0");
                else System.out.println("1");
                continue;
            }
            if(a == 0 || c == 1) {
                System.out.println("0");
                continue;
            }
            a %= c;
            
            int[] yarra = new int[31];
            yarra[0] = a;
            for(int i = 1; i < yarra.length; i++) {
                yarra[i] = (yarra[i-1]*yarra[i-1])%c;
            }
            String binary = Integer.toBinaryString(b);
            int out = 1;
            for(int i = 0; i < binary.length(); i++) {
                if(binary.charAt(i) == '1') out = (out*yarra[binary.length() - 1 - i]) % c;
            }
            System.out.println(out);
        }
    }
}