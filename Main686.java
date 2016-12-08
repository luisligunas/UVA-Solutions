import java.util.*;

public class Main686 {
    static boolean[] composite;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            int count = 0;
            for(int i = 2; i <= num/2; i++) {
                if(!composite[i] && !composite[num - i]) count++;
            }
            System.out.println(count);
        }
    }
    public static void fillSieve() {
        composite = new boolean[33000];
        composite[1] = true;
        for(int i = 2; i < composite.length; i++) {
            if(!composite[i]) {
                for(int j = 2; i*j < composite.length; j++) {
                    composite[i*j] = true;
                }
            }
        }
    }
}