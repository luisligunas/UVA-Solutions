import java.util.Scanner;

public class Main12577 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int i = 1; true; i++) {
            String g = rennacS.next();
            if(g.equals("*")) break;
            
            System.out.print("Case " + i + ": ");
            if(g.equals("Hajj")) System.out.println("Hajj-e-Akbar");
            else System.out.println("Hajj-e-Asghar");
        }
    }
}