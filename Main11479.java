import java.util.Scanner;

public class Main11479 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 1; z <= testCases; z++) {
            long a = rennacS.nextLong();
            long b = rennacS.nextLong();
            long c = rennacS.nextLong();
            
            System.out.print("Case " + z + ": ");
            if(a <= 0 || b <= 0 || c <= 0) System.out.println("Invalid");
            else if(a + b <= c || a + c <= b || b + c <= a) System.out.println("Invalid");
            else {
                if(a == b && b == c) System.out.println("Equilateral");
                else if(a == b || b == c || a == c) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }
        }
    }
}
