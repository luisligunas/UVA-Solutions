import java.util.Scanner;

public class Main12279 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        for(int i = 1; true; i++) {
            int a = rennacS.nextInt();
            if(a == 0) break;

            int plus = 0;
            int minus = 0;

            for(int j = 0; j < a; j++) {
                long temp = rennacS.nextInt();
                if(temp == 0) minus++;
                else if(temp > 0 && temp < 100) plus++;
            }
            System.out.println("Case " + i + ": " + (plus-minus));
        }
    }
}

