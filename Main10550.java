import java.util.*;

public class Main10550 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(true) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            int c = rennacS.nextInt();
            int d = rennacS.nextInt();

            if(a + b + c + d == 0) break;

            int rotate = 120 + clockwise(a, b) + counter(b, c) + clockwise(c, d);

            System.out.println(rotate*9);
        }
    }
    public static int clockwise(int start, int end) {
        if(start < end) start += 40;
        return start - end;
    }
    public static int counter(int start, int end) {
        if(start > end) end += 40;
        return end - start;
    }
}