import java.util.*;

public class Main439 {
    static int x2, y2;
    static int[][] yarra;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String start = rennacS.next();
            String end = rennacS.next();
            
            yarra = new int[8][8];
            for(int i = 0; i < 8; i++) Arrays.fill(yarra[i], Integer.MAX_VALUE);
            
            int x1 = start.charAt(0) - 'a';
            int y1 = Integer.parseInt(start.substring(1)) - 1;
            x2 = end.charAt(0) - 'a';
            y2 = Integer.parseInt(end.substring(1)) - 1;
            go(x1, y1, 0);
            System.out.println("To get from " + start + " to " + end + " takes " + yarra[x2][y2] + " knight moves.");
        }
    }
    public static void go(int x, int y, int distance) {
        if(x == x2 && y == y2) {
            yarra[x][y] = Math.min(yarra[x][y], distance);
            return;
        }
        if(yarra[x][y] <= distance) return;
        yarra[x][y] = distance;
        
        for(int i = -2; i < 3; i++) {
            if(i == 0) continue;
            for(int j = -2; j < 3; j++) {
                if(j == 0 || Math.abs(i) == Math.abs(j)) continue;
                if(oksCoords(x + i, y + j)) {
                    go(x + i, y + j, distance + 1);
                }
            }
        }
    }
    public static boolean oksCoords(int x, int y) {
        return !(x < 0 || x > 7 || y < 0 || y > 7);
    }
}