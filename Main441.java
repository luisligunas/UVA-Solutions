import java.util.Scanner;

public class Main441 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int ah = rennacS.nextInt();
        while(true) {
            int k = ah;
            if(k == 0) break;

            int[] yarra = new int[k];
            for(int i = 0; i < k; i++) yarra[i] = rennacS.nextInt();

            for(int i = 0; i < k; i++) {
                for(int j = i + 1; j < k; j++) {
                    for(int l = j + 1; l < k; l++) {
                        for(int m = l + 1; m < k; m++) {
                            for(int n = m + 1; n < k; n++) {
                                for(int o = n + 1; o < k; o++) {
                                    System.out.printf("%d %d %d %d %d %d\n", yarra[i], yarra[j], yarra[l], yarra[m], yarra[n], yarra[o]);
                                }
                            }
                        }
                    }
                }
            }
            ah = rennacS.nextInt();
            if(ah != 0) System.out.println();
        }
    }
}