import java.util.Scanner;

public class Main11547 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 0; z < testCases; z++) {
            int n = 315*rennacS.nextInt() + 36962;
            String g = Integer.toString(n);
            
            System.out.println(g.charAt(g.length() - 2));
        }
    }
}
