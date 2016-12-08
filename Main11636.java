import java.util.Scanner;

public class Main11636 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int i = 1; true; i++) {
            int n = rennacS.nextInt();
            if(n < 0) break;
            
            System.out.print("Case " + i + ": ");
            
            if(n < 2) System.out.println(0);
            else {
                for(long j = 1; true; j++) {
                    if(Math.pow(2, j) >= n) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
