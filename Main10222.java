import java.util.*;

public class Main10222 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        String up = "qwertyuiop[]\\";
        String mid = "asdfghjkl;'";
        String down = "zxcvbnm,./";
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine().toLowerCase();

            for(int i = 0; i < g.length(); i++) {
                int ind = up.indexOf(g.charAt(i));
                if(ind > 1) {
                    System.out.print(up.charAt(ind - 2));
                    continue;
                }
                ind = mid.indexOf(g.charAt(i));
                if(ind > 1) {
                    System.out.print(mid.charAt(ind - 2));
                    continue;
                }
                ind = down.indexOf(g.charAt(i));
                if(ind > 1) {
                    System.out.print(down.charAt(ind - 2));
                    continue;
                }
                System.out.print(g.charAt(i));
            }
            System.out.println("");
        }
    }
}
