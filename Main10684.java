import java.util.*;

public class Main10684 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int inps = rennacS.nextInt();
            if(inps == 0) break;
            
            int total = 0;
            int max = 0;
            
            for(int i = 0; i < inps; i++) {
                int num = rennacS.nextInt();
                total += num;
                if(total > max) max = total;
                else if(total < 0) total = 0;
            }
            if(max > 0) System.out.println("The maximum winning streak is " + max + ".");
            else System.out.println("Losing streak.");
        }
    }
}
