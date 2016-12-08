import java.util.*;

public class Main10079 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            long n = rennacS.nextInt();
            if(n < 0) break;
            
            System.out.println((n*(n+1)/2) + 1);
        }
    }
}
