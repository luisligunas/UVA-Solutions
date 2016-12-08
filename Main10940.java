import java.util.*;

public class Main10940 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            int powTwo;
            
            for(int i = 0; true; i++) {
                if(num <= 1 << i) {
                    powTwo = i;
                    break;
                }
            }
            int diff = (1 << powTwo) - num;
            System.out.println((1 << powTwo) - 2*diff);
        }
    }
}