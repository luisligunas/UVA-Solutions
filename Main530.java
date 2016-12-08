import java.util.*;

public class Main530 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int num = rennacS.nextInt();
            int get = rennacS.nextInt();
            if(num == 0 && get == 0) break;
            
            get = Math.min(get, num - get);
            //some ! property
            
            long curr = 1;
            
            for(int i = 1; i <= get; i++) {
                curr = curr*(num - i + 1)/i;
            }
            System.out.println(curr);
        }
    }
}