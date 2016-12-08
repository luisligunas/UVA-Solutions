import java.util.Scanner;

public class Main12289 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            String g = rennacS.next();
            
            if(g.length() == 5) System.out.println(3);
            else {
                if((g.contains("o") && g.contains("n")) || (g.contains("o") && g.contains("e")) || (g.contains("n") && g.contains("e"))) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
