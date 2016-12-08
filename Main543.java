import java.util.*;

public class Main543 {
    static boolean[] composite;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            for(int i = 2; true; i++) {
                if(!composite[i] && !composite[num - i]) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    break;
                }
            }
        }
    }
    public static void fillSieve() {
        composite = new boolean[1000000];
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