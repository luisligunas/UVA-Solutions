import java.util.Scanner;

public class Main11185 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int a = rennacS.nextInt();
            if(a < 0) break;
            
            if(a == 0) System.out.println(0);
            else {
                String g = "";
                while(a != 0) {
                    g = (a%3) + g;
                    a /= 3;
                }
                System.out.println(g);
            }
        }
    }
}
