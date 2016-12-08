//Works. But kinda inefficient?

import java.util.Scanner;

public class Main11157 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 1; z <= testCases; z++) {
            int stones = rennacS.nextInt();
            int spaces = rennacS.nextInt();
            boolean[] big = new boolean[spaces - 1];
            boolean[] small = new boolean[spaces - 1];
            
            for(int i = 0; i < stones; i++) {
                String temp = rennacS.next();
                if(temp.charAt(0) == 'B') big[Integer.parseInt(temp.substring(2)) - 1] = true;
                else small[Integer.parseInt(temp.substring(2)) - 1] = true;
            }
            int max = 0;
            int current = -1;
            
            while(true) {
                int nextBig = nextTrue(big, current);
                if(nextBig - current <= max) current = nextBig;
                else {
                    int nextSmall = nextTrue(small, current);
                    if(nextBig < nextSmall) {
                        max = nextBig - current;
                        current = nextBig;
                    }
                    else if(nextSmall == spaces - 1) {
                        if(nextSmall - current > max) max = nextSmall - current;
                        break;
                    }
                    else{
                        int secondSmall = nextTrue(small, nextSmall);
                        if(nextBig < secondSmall) {
                            max = nextBig - current;
                            current = nextBig;
                        }
                        else {
                            if(secondSmall - current > max) max = secondSmall - current;
                            current = secondSmall;
                            if(current == spaces - 1) break;
                            small[current] = false;
                        }
                    }
                }
                if(current == spaces - 1) break;
            }
            
            while(true) {
                if(current == -1) break;
                int nextBig = trueBefore(big, current);
                if(current - nextBig <= max) current = nextBig;
                else {
                    int nextSmall = trueBefore(small, current);
                    if(current - nextSmall > max) max = current - nextSmall;
                    current = nextSmall;
                }
            }
            System.out.println("Case " + z + ": " + max);
        }
    }
    public static int trueBefore(boolean[] yarra, int from) {
        for(int i = from - 1; i >= 0; i--) {
            if(yarra[i]) return i;
        }
        return -1;
    }
    public static int nextTrue(boolean[] yarra, int from) {
        for(int i = from + 1; i < yarra.length; i++) {
            if(yarra[i]) return i;
        }
        return yarra.length;
    }
}