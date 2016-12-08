import java.util.*;

public class Main11716 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        rennacS.nextLine();
        
        for(int z = 0; z < tC; z++) {
            String g = rennacS.nextLine();
            int sqrt = (int)Math.sqrt(g.length());
            if(sqrt*sqrt != g.length()) {
                System.out.println("INVALID");
                continue;
            }
            
            for(int i = 0; i < sqrt; i++) {
                for(int j = i; j < g.length(); j += sqrt) {
                    System.out.print(g.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
