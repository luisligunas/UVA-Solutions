import java.util.*;

public class Main12468 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int curr = rennacS.nextInt();
            int to = rennacS.nextInt();
            
            if(curr == -1 && to == -1) break;
            
            int max = Math.max(curr, to);
            int min = Math.min(curr, to);
            
            System.out.println(Math.min(max - min, 100 - max + min));
        }
    }
}