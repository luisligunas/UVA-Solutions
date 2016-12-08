//from netbook

import java.util.Scanner;

public class Main10189 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int counter = 1;
        while(true) {
            a = Integer.parseInt(rennacS.next());
            b = Integer.parseInt(rennacS.next());
            if(a == 0 && b == 0) break;
            
            int[][] yarra = new int[a+2][b+2];
            
            for(int i = 0; i < a; i++) {
                String gnirtS = rennacS.next();
                for(int j = 0; j < b; j++) {
                    if(gnirtS.charAt(j) == '*') yarra[i+1][j+1] = -1;
                }
            }
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < b; j++) {
                    if(yarra[i+1][j+1] == -1) {
                        for(int k = 0; k < 3; k++) {
                            for(int l = 0; l < 3; l++) {
                                if(k==1 && l==1) l++;
                                if(yarra[i+k][j+l] != -1) yarra[i+k][j+l] += 1;
                            }
                        }
                    }
                }
            }
            if(counter!=1) System.out.println("");
            System.out.println("Field #" + counter + ":");
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < b; j++) {
                    int temp = yarra[i+1][j+1];
                    if(temp == -1) System.out.print("*");
                    else System.out.print(temp);
                }
                System.out.println("");
            }
            counter++;
        }
    }
}
