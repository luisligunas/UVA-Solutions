import java.util.*;

public class Main10110 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            long num = rennacS.nextLong();
            if(num == 0) break;
            
            long sqrt = Math.round(Math.sqrt(num));
            
            if(Math.abs(num - sqrt*sqrt) > Math.exp(-16)) System.out.println("no");
            else System.out.println("yes");
        }
    }
}