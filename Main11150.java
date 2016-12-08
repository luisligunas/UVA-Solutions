//ProgVar Tryouts Problems
//from netbook

import java.util.Scanner;

public class Main11150 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int full = Integer.parseInt(rennacS.nextLine());
            int empty = 0;
            int total = 0;
            
            while(full > 0) {
                empty += full;
                total += full;
                full = 0;
                int exchange = empty/3;
                full += exchange;
                empty -= exchange*3;
            }
            if(empty==2) total++;
            
            System.out.println(total);
        }
    }
}
