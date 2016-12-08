import java.util.*;

public class Main11264 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int testCases = rennacS.nextInt();

        for(int i = 0; i < testCases; i++) {
            int[] coins = new int[rennacS.nextInt()];

            if(coins.length == 1) System.out.println(coins.length);
            else {
                int[] add = new int[coins.length];
                for(int j = 0; j < coins.length; j++) coins[j] = rennacS.nextInt();
                long sum = 0;
                int out = 1;

                for(int j = 0; j < coins.length - 1; j++) {
                    if(coins[j+1] > sum + coins[j]) {
                        out++;
                        sum += coins[j];
                    }
                }
                System.out.println(out);
            }
        }
    }
}

