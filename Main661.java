//from netbook

import java.util.Scanner;

public class Main661 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int k = 1; ; k++) {
            int a = Integer.parseInt(rennacS.next());
            int b = Integer.parseInt(rennacS.next());
            int c = Integer.parseInt(rennacS.next());
            if(a==0 & b==0 & c==0) break;
            int[] amp = new int[a];
            boolean yarra[] = new boolean[a];
            int max = 0;
            
            for(int i = 0; i < a; i++) {
                amp[i] = Integer.parseInt(rennacS.next());
            }
            for(int i = 0; i < b; i++) {
                int d = Integer.parseInt(rennacS.next()) - 1;
                if(yarra[d]) yarra[d] = false;
                else yarra[d] = true;
                int temp = 0;
                for(int j = 0; j < a; j++) if(yarra[j]) temp += amp[j];
                if(temp > max) max = temp;
            }
            System.out.println("Sequence " + k);
            if(max > c) System.out.println("Fuse was blown.\n");
            else System.out.println("Fuse was not blown.\nMaximal power consumption was " + max + " amperes.\n");
        }
    }
}
