//import java.util.Scanner;
//
//public class UMain674 {
//    public static void main(String[] args) {
//        Scanner rennacS = new Scanner(System.in);
//
//        int[] yarra = new int[7490];
//        
//        while(rennacS.hasNext()) {
//            int inp = rennacS.nextInt();
//            if(yarra[inp] != 0) System.out.println(yarra[inp]);
//            else {
//                int fifty = inp/50;
//                int twentyfive = inp/25;
//                int ten = inp/10;
//                int out = 0;
//
//                for(int i = 0; i <= fifty; i++) {
//                    for(int j = 0; j <= twentyfive; j++) {
//                        int temp2 = i*50 + j*25;
//                        if(temp2 > inp) break;
//
//                        for(int k = 0; k <= ten; k++) {
//                            int temp = (i*50) + (j*25) + (k*10);
//
//                            if(temp <= inp) {
//                                out += ((inp-temp)/5) + 1;
//                            }
//                            else break;
//                        }
//                    }
//                }
//                int mod = inp/5;
//                for(int i = 0; i < 5; i++) {
//                    yarra[mod + i] = out;
//                }
//                System.out.println(out);
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class UMain674 {
//    public static void main(String[] args) {
//        Scanner rennacS = new Scanner(System.in);
//
//        int[] yarra = new int[7490];
//        
//        while(rennacS.hasNext()) {
//            int inp = rennacS.nextInt();
//            if(yarra[inp] != 0) System.out.println(yarra[inp]);
//            else {
//                int fifty = inp/50;
//                int twentyfive = inp/25;
//                int ten = inp/10;
//                int out = 0;
//
//                for(int i = 0; i <= fifty; i++) {
//                    for(int j = 0; j <= twentyfive; j++) {
//                        int temp2 = i*50 + j*25;
//                        if(temp2 > inp) break;
//                        
////                        out += ((inp-temp)/5) + 1;
//                        //from temp2 + 0   to temp2 + (inp-temp2)/10;
//                        
//                        
////                        for(int k = 0; k <= ten; k++) {
////                            int temp = (i*50) + (j*25) + (k*10);
////
////                            if(temp <= inp) {
////                                out += ((inp-temp)/5) + 1;
////                            }
////                            else break;
////                        }
//                    }
//                }
//                int mod = inp/5;
//                for(int i = 0; i < 5; i++) {
//                    yarra[mod + i] = out;
//                }
//                System.out.println(out);
//            }
//        }
//    }
//}

import java.util.*;

public class Main674 {
    static int[][] yarra;
    static int[] coins;
    
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        yarra = new int[7490][5];
        coins = new int[] {1, 5, 10, 25, 50};
        yarra[1][0] = 1;
        
        while(rennacS.hasNext()) {
            System.out.println(recurse(rennacS.nextInt(), 0));
        }
    }
    public static int recurse(int n, int index) {
        if(yarra[n][index] != 0) return yarra[n][index];
        if(n == 0) return 1;
        if(n < coins[index] && index == 0) return 1;
        if(n < coins[index]) return 0;
        
        for(int i = index; i < coins.length; i++) {
            if(coins[i] > n) break;
            if(i == 0 || n % 5 == 0) yarra[n][index] += recurse(n - coins[i], i);
            else if(n % 5 != 0) break;
        }
        return yarra[n][index];
    }
}