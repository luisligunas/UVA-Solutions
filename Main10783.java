import java.util.Scanner;

public class Main10783 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 1; i <= testCases; i++) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            
            System.out.print("Case " + i + ": ");
            if(a == b) System.out.println(0);
            else if(Math.abs(a-b) == 2) System.out.println(a + b);
            else {
                if(a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if(a % 2 == 0) a++;
                if(b % 2 == 0) b--;
                
                System.out.println(((b+1)*(b+1) - (a-1)*(a-1))/4);
            }
        }
    }
}
