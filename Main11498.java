import java.util.Scanner;

public class Main11498 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int k = rennacS.nextInt();
            if(k == 0) break;
            
            int basex = rennacS.nextInt();
            int basey = rennacS.nextInt();
            
            for(int i = 0; i < k; i++) {
                int x = rennacS.nextInt();
                int y = rennacS.nextInt();
                
                if(x == basex || y == basey) System.out.println("divisa");
                else if(x > basex) {
                    if(y > basey) System.out.println("NE");
                    else System.out.println("SE");
                }
                else {
                    if(y > basey) System.out.println("NO");
                    else System.out.println("SO");
                }
            }
        }
    }
}
