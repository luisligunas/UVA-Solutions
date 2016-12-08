import java.util.*;

public class Main575 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String g = rennacS.next();
            if(g.equals("0")) break;
            
            int out = 0;
            for(int i = 0; i < g.length(); i++) {
                out += Integer.parseInt(g.charAt(i) + "")*((1 << (g.length() - i)) - 1);
            }
            System.out.println(out);
        }
    }
}
