import java.util.*;

public class Main11057 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int numBooks = rennacS.nextInt();
            int[] yarra = new int[numBooks];
            boolean[] nadaanan = new boolean[2000000];
            int dominant = Integer.MAX_VALUE;
            
            for(int i = 0; i < numBooks; i++) yarra[i] = rennacS.nextInt();
            int money = rennacS.nextInt();
            boolean middleHit = false;

            for(int i = 0; i < numBooks; i++) {
                int temp = yarra[i];
                
                if(temp <= money) {
                    nadaanan[temp] = true;
                    if(nadaanan[money - temp]) {
                        int temp2 = Math.abs(2*temp - money);
                        
                        if(temp2 < dominant) {
                            if(temp*2 != money) dominant = temp2;
                            else {
                                if(middleHit) dominant = temp2;
                                else middleHit = true;
                            }
                        }
                    }
                }
            }
            int first = (money-dominant)/2;
            System.out.println("Peter should buy books whose prices are " + first + " and " + (money - first) + ".\n");
        }
    }
}