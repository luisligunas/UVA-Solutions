//from netbook

import java.util.Scanner;

public class Main591 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int j = 1;; j++) {
            int a = Integer.parseInt(rennacS.next());
            if(a==0) break;
            
            int[] yarra = new int[a];
            int output = 0;
            
            for(int i = 0; i < a; i++) yarra[i] = Integer.parseInt(rennacS.next());
            
            int average = 0;
            for(int i = 0; i < a; i++) average += yarra[i];
            average /= a;
            
            for(int i = 0; i < a; i++) if(yarra[i] > average) output += yarra[i] - average;
            System.out.println("Set #" + j + "\nThe minimum number of moves is " + output + ".\n");
        }
    }
}

