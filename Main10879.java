//ProgVar Tryouts Problems
//from netbook

import java.util.Scanner;

public class Main10879 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        int testCases = Integer.parseInt(rennacS.nextLine());
        int counter = 0;
        
        while(counter < testCases) {
            int dividend = Integer.parseInt(rennacS.nextLine());
            int divisor = 2;
            int cases = 0;
            
            System.out.print("Case #" + (counter + 1) + ": " + dividend);
            
            while(divisor < dividend/2) {
                if(dividend % divisor == 0 && divisor != (dividend/divisor)) {
                    System.out.print(" = " + divisor + " * " + (dividend/divisor));
                    cases++;
                }
                divisor++;
                if(cases == 2) break;
            }
            counter++;
            System.out.println("");
        }
    }
}
