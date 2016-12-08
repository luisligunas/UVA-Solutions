//from netbook

import java.util.Scanner;

public class Main11799 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = Integer.parseInt(rennacS.next());
        for(int i = 0; i < testCases; i++) {
            int a = Integer.parseInt(rennacS.next());
            int max = 0;
            
            for(int j = 0; j < a; j++) {
                int temp = Integer.parseInt(rennacS.next());
                if(temp > max) max = temp;
            }
            System.out.println("Case " + (i+1) + ": " + max);
        }
    }
}

