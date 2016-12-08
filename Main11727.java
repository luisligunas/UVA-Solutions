import java.util.Scanner;
import java.util.Arrays;

public class Main11727 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            int[] yarra = new int[3];
            for(int j = 0; j < 3; j++) yarra[j] = rennacS.nextInt();
            Arrays.sort(yarra);
            System.out.println("Case " + (i+1) + ": " + yarra[1]);
        }
                
    }
}
