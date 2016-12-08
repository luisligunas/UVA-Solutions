import java.util.Scanner;

public class Main10812 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int s = rennacS.nextInt();
            int d = rennacS.nextInt();
            
            if((s % 2 == 0 ^ d % 2 == 0)) System.out.println("impossible");
            else if(s < d) System.out.println("impossible");
            else if(s == d) System.out.println(s + " 0");
            else {
                int one = (s + d)/2;
                int two = Math.abs(s - one);
                System.out.println(Math.max(one, two) + " " + Math.min(one, two));
            }
        }
    }
}
