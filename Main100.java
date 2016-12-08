//from netbook

import java.util.*;

public class Main100 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int[] yarra = new int[999999];
        while(rennacS.hasNext()) {
            int a = Integer.parseInt(rennacS.next());
            int b = Integer.parseInt(rennacS.next());
            boolean boom = a > b;
            int max = 0;
            
            if(a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            
            for(int i = a; i <= b; i++) {
                double c = i;
                int temp = 1;
                
                while(c != 1) {
                    if(c < 1000000) {
                        if(yarra[(int)c-1] != 0) {
                            temp += yarra[(int)c-1];
                            break;
                        }
                    }
                    if(c%2 == 0) c /= 2;
                    else c = 3*c + 1;
                    temp++;
                }
                
                if(yarra[i - 1] == 0) yarra[i - 1] = temp - 1;
                if(temp > max) max = temp;
            }
            if(boom) System.out.println(b + " " + a + " " + max);
            else System.out.println(a + " " + b + " " + max);
        }
    }
}