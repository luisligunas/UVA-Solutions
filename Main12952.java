import java.util.*;

public class Main12952 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            
            if(a >= b) System.out.println(a);
            else System.out.println(b);
        }
    }
}
