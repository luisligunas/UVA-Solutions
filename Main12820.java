import java.util.*;

public class Main12820 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int z = 1; rennacS.hasNext(); z++) {
            int num = rennacS.nextInt();
            
            int count = 0;
            for(int i = 0; i < num; i++) {
                if(isCool(rennacS.next())) count++;
            }
            System.out.println("Case " + z + ": " + count);
        }
    }
    public static boolean isCool(String g) {
        int[] yarra = new int[26];
        int diff = 0;
        
        for(int i = 0; i < g.length(); i++) {
            int ind = (int)g.charAt(i) - 'a';
            if(yarra[ind] == 0) diff++;
            yarra[ind]++;
        }
        if(diff < 2) return false;
        
        boolean[] exists = new boolean[31];
        
        for(int i = 0; i < yarra.length; i++) {
            if(yarra[i] == 0) continue;
            if(exists[yarra[i]]) return false;
            exists[yarra[i]] = true;
        }
        
        return true;
    }
}
