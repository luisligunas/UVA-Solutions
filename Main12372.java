import java.util.*;

public class Main12372 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            boolean rekt = false;
            for(int i = 0; i < 3; i++) {
                if(rennacS.nextInt() > 20) rekt = true;
            }
            System.out.print("Case " + (z+1) + ": ");
            if(rekt) System.out.println("bad");
            else System.out.println("good");
        }
    }
}
