//from netbook

import java.util.Scanner;

public class Main10346 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int cig = Integer.parseInt(rennacS.next());
            int buttRef = Integer.parseInt(rennacS.next());
            int butt = 0;
            int total = 0;
            
            while(cig != 0) {
                butt += cig;
                total += cig;
                cig = butt/buttRef;
                butt -= cig*buttRef;
            }
            System.out.println(total);
        }
    }
}

