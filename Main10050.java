import java.util.*;

public class Main10050 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        for(int z = 0; z < tC; z++) {
            int days = rennacS.nextInt() + 1;
            int parties = rennacS.nextInt();
            boolean[] yarra = new boolean[days];
            int out = 0;
            
            for(int i = 0; i < parties; i++) {
                int hartal = rennacS.nextInt();
                for(int j = 1; true; j++) {
                    int date = hartal*j;
                    if(date >= days) break;
                    
                    if(yarra[date]) continue;
                    if((date - 6) % 7 == 0 || date % 7 == 0) {
                        yarra[date] = true;
                        continue;
                    }
                    out++;
                    yarra[date] = true;
                }
            }
            System.out.println(out);
        }
    }
}
