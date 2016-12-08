import java.util.*;

public class Main11094 {
    static boolean[][] passed;
    static char[][] los;
    static int count, dudeX, dudeY;
    static boolean dudeInHere;

    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(rennacS.hasNext()) {
            los = new char[rennacS.nextInt()][rennacS.nextInt()];

            passed = new boolean[los.length][los[0].length];

            for(int i = 0; i < los.length; i++) {
                String g = rennacS.next();
                for(int j = 0; j < los[i].length; j++) {
                    los[i][j] = g.charAt(j);
                }
            }
            dudeX = rennacS.nextInt();
            dudeY = rennacS.nextInt();
            char land = los[dudeX][dudeY];
            int max = 0;
            dudeInHere = false;

            for(int i = 0; i < los.length; i++) {
                for(int j = 0; j < los[i].length; j++) {
                    if(passed[i][j]) continue;
                    count = 0;

                    floodFill(i, j, los[i][j]);
                    if(count > max && los[i][j] == land && !dudeInHere) max = count;
                    dudeInHere = false;
                }
            }
            System.out.println(max);
        }
    }
    public static void floodFill(int x, int y, char color) {
        if(los[x][y] != color) return;

        if(x == dudeX && y == dudeY) dudeInHere = true;
        count++;
        passed[x][y] = true;
        if(x != 0 && !passed[x-1][y]) floodFill(x - 1, y, color);
        if(x != los.length - 1 && !passed[x+1][y]) floodFill(x + 1, y, color);

        if(y == 0 && !passed[x][los[0].length - 1]) floodFill(x, los[0].length - 1, color);
        else if(y != 0 && !passed[x][y - 1]) floodFill(x, y - 1, color);

        if(y == los[0].length - 1 && !passed[x][0]) floodFill(x, 0, color);
        else if(y != los[0].length - 1 && !passed[x][y + 1]) floodFill(x, y + 1, color);
    }
}