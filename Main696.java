//from netbook

import java.util.Scanner;

public class Main696 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int a = Integer.parseInt(rennacS.next());
            int b = Integer.parseInt(rennacS.next());
            if(a == 0 & b == 0) break;
            
            if(a == 1) System.out.print(b);
            else if(b == 1) System.out.print(a);
            else if(a == 2 || b == 2) {
                int notTwo = 0;
                if(a==2) notTwo = b;
                else notTwo = a;
                
                if((notTwo - 1) % 4 == 0) System.out.print(notTwo + 1);
                else {
                    while(true) {
                        if(notTwo % 4 == 0) {
                            System.out.print(notTwo);
                            break;
                        }
                        notTwo++;
                    }
                }
            }
            else System.out.print(((a*b)+1)/2);
            System.out.println(" knights may be placed on a " + a + " row " + b + " column board.");
            
        }
    }
}
