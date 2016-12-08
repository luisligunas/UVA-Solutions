//from netbook

import java.util.Scanner;

public class Main573 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int h = Integer.parseInt(rennacS.next());
            double u = Integer.parseInt(rennacS.next());
            int d = Integer.parseInt(rennacS.next());
            int f = Integer.parseInt(rennacS.next());
            double pos = 0;
            if(h==0) break;
            
            for(int i = 0; true; i++) {
                double temp = u - (i*u*f/100);
                if(temp > 0) pos += temp;
                if(pos > h) {
                    System.out.println("success on day " + (i+1));
                    break;
                }
                pos -= d;
                if(pos < 0) {
                    System.out.println("failure on day " + (i+1));
                    break;
                }
            }
        }
    }
}

