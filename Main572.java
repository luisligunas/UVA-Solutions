import java.util.*;

public class Main572 {
    static boolean[][] isPocket, passed;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int row = rennacS.nextInt();
            int col = rennacS.nextInt();
            
            if(row == 0) break;
            
            isPocket = new boolean[row][col];
            passed = new boolean[row][col];
            
            for(int i = 0; i < row; i++) {
                String g = rennacS.next();
                for(int j = 0; j < col; j++) isPocket[i][j] = g.charAt(j) == '@';
            }
            
            int deposits = 0;
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(!passed[i][j]) {
                        if(isPocket[i][j]) deposits++;
                        floodFill(i, j);
                    }
                }
            }
            System.out.println(deposits);
        }
    }
    public static void floodFill(int x, int y) {
        if(passed[x][y]) return;
        
        passed[x][y] = true;
        if(oksCoords(x - 1, y - 1) && isPocket[x][y] == isPocket[x-1][y-1]) floodFill(x-1, y-1); 
        if(oksCoords(x - 1, y) && isPocket[x][y] == isPocket[x-1][y]) floodFill(x-1, y); 
        if(oksCoords(x - 1, y + 1) && isPocket[x][y] == isPocket[x-1][y+1]) floodFill(x-1, y+1);
        if(oksCoords(x, y - 1) && isPocket[x][y] == isPocket[x][y-1]) floodFill(x, y-1);
        if(oksCoords(x, y + 1) && isPocket[x][y] == isPocket[x][y+1]) floodFill(x, y+1);
        if(oksCoords(x + 1, y - 1) && isPocket[x][y] == isPocket[x+1][y-1]) floodFill(x+1, y-1);
        if(oksCoords(x + 1, y) && isPocket[x][y] == isPocket[x+1][y]) floodFill(x+1, y);
        if(oksCoords(x + 1, y + 1) && isPocket[x][y] == isPocket[x+1][y+1]) floodFill(x+1, y+1);
    }
    public static boolean oksCoords(int x, int y) {
        return !(x < 0 || x >= isPocket.length || y < 0 || y >= isPocket[0].length);
    }
}
