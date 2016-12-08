import java.util.*;

public class Main900 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        long[] yarra = new long[51];
        yarra[1] = 1;
        yarra[2] = 2;
        int curr = 2;
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            while(curr < num) {
                yarra[curr + 1] = yarra[curr] + yarra[curr++ - 1];
            }
            System.out.println(yarra[num]);
        }
    }
}
