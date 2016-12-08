import java.util.Scanner;

public class Main11172 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            if(a > b) System.out.println(">");
            else if(a < b) System.out.println("<");
            else System.out.println("=");
        }
    }
}
