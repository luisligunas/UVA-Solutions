import java.util.*;

public class Main11805 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            int players = rennacS.nextInt();
            int start = rennacS.nextInt();
            int passes = rennacS.nextInt();
            
            int out = (start + passes)%players;
            if(out == 0) out = players;
            
            System.out.println("Case " + (z+1) + ": " + out);
        }
    }
}