import java.util.*;

public class Main10945 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String g = rennacS.nextLine();
            if(g.equals("DONE")) break;
            g = g.toLowerCase();
            
            int i = 0;
            int j = g.length() - 1;
            boolean rekt = false;
            
            while(true) {
                while(i < g.length() && (g.charAt(i) < 'a' || g.charAt(i) > 'z')) i++;
                while(j >= 0 && (g.charAt(j) < 'a' || g.charAt(j) > 'z')) j--;
                
                if(i >= j) break;
                if(g.charAt(i) != g.charAt(j)) {
                    rekt = true;
                    break;
                }
                i++;
                j--;
            }
            if(rekt) System.out.println("Uh oh..");
            else System.out.println("You won't be eaten!");
        }
    }
}