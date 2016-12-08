import java.util.*;

public class Main10161 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            int row, col;
            
            int sqrt = (int)Math.sqrt(num);
            if(sqrt*sqrt != num) sqrt++;
            
            if(sqrt % 2 == 1) {
                row = sqrt;
                col = 1;
                if(sqrt*sqrt == num) {}
                else if(sqrt*sqrt - num < sqrt) col = sqrt*sqrt - num + 1;
                else {
                    col = sqrt;
                    row = sqrt - (sqrt*sqrt - sqrt + 1 - num);
                }
            }
            else {
                row = 1;
                col = sqrt;
                if(sqrt*sqrt == num) {}
                else if(sqrt*sqrt - num < sqrt) row = sqrt*sqrt - num + 1;
                else {
                    row = sqrt;
                    col = sqrt - (sqrt*sqrt - sqrt + 1 - num);
                }
            }
            System.out.println(col + " " + row);
        }
    }
}
