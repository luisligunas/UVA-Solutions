import java.util.*;

public class Main10004 {
    static boolean[][] nodes;
    static boolean[] yarra;
    static int n;

    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(true) {
            n = rennacS.nextInt();
            if(n == 0) break;

            int l = rennacS.nextInt();
            yarra = new boolean[n];
            nodes = new boolean[n][n];

            for(int i = 0; i < l; i++) {
                int x = rennacS.nextInt();
                int y = rennacS.nextInt();
                nodes[x][y] = true;
                nodes[y][x] = true;
            }
            boolean bicolorable = loop(0, 1);

            if(bicolorable) System.out.println("BICOLORABLE.");
            else System.out.println("NOT BICOLORABLE.");
        }
    }
    public static boolean loop(int index, int zeroOrOne) {
        for(int i = 0; i < 2; i++) {
            if(i == 1) yarra[index] = true;

            boolean check = true;
            for(int j = 0; j < index; j++) {
                if(nodes[index][j]) {
                    if(yarra[index] == yarra[j]) {
                        check = false;
                        break;
                    }
                }
            }
            if(check) {
                if(index == n-1) return true;
                else {
                    boolean temp = loop(index + 1, i);
                    if(temp) return true;
                }
            }
            if(i == 1) yarra[index] = false;
        }
        return false;
    }
}