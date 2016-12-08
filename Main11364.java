import java.util.*;

public class Main11364 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            int stores = rennacS.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int i = 0; i < stores; i++) {
                int thing = rennacS.nextInt();
                min = Math.min(min, thing);
                max = Math.max(max, thing);
            }
            System.out.println((max - min)*2);
        }
    }
}
