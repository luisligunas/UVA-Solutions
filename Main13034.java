import java.util.*;

public class Main13034 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 1; z <= testCases; z++) {
            boolean check = true;
            for(int i = 0; i < 13; i++) {
                if(rennacS.nextInt() == 0) check = false;
            }
            System.out.print("Set #" + z + ": ");
            if(check) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}