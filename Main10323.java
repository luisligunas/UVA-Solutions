import java.util.*;

public class Main10323 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        long[] yarra = new long[14];
        yarra[1] = 1;
        long curr = 2;
        for(int i = 2; i < yarra.length; i++) {
            yarra[i] = yarra[i-1]*curr;
            curr++;
        }
        
        while(rennacS.hasNext()) {
            int num = rennacS.nextInt();
            
            if(num < 0) {
                if(Math.abs(num) % 2 == 1) System.out.println("Overflow!");
                else System.out.println("Underflow!");
            }
            else if(num <= 7) System.out.println("Underflow!");
            else if(num >= 14) System.out.println("Overflow!");
            else System.out.println(yarra[num]);
        }
    }
}
