import java.util.Scanner;

public class Main11831 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int n = rennacS.nextInt();
            int m = rennacS.nextInt();
            int s = rennacS.nextInt();
            if(n + m + s == 0) break;
            
            char[][] yarra = new char[n][m];
            char orient = ' ';
            int x = 0;
            int y = 0;
            
            for(int i = 0; i < n; i++) {
                String g = rennacS.next();
                for(int j = 0; j < m; j++) {
                    yarra[i][j] = g.charAt(j);
                    if(yarra[i][j] >= 65)  {
                        orient = yarra[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            String g = rennacS.next();
            int stickers = 0;
            for(int z = 0; z < s; z++) {
                if(g.charAt(z) == 'D') {
                    if(orient == 'N') orient = 'L';
                    else if(orient == 'S') orient = 'O';
                    else if(orient == 'L') orient = 'S';
                    else orient = 'N';
                }
                else if(g.charAt(z) == 'E') {
                    if(orient == 'N') orient = 'O';
                    else if(orient == 'S') orient = 'L';
                    else if(orient == 'L') orient = 'N';
                    else orient = 'S';
                }
                else {
                    if(orient == 'N') {
                        if(x != 0) {
                            if(yarra[x - 1][y] != '#') {
                                x--;
                                if(yarra[x][y] == '*') {
                                    stickers++;
                                    yarra[x][y] = '.';
                                }
                            }
                        }
                    }
                    else if(orient == 'S') {
                        if(x != n - 1) {
                            if(yarra[x + 1][y] != '#') {
                                x++;
                                if(yarra[x][y] == '*') {
                                    stickers++;
                                    yarra[x][y] = '.';
                                }
                            }
                        }
                    }
                    else if(orient == 'L') {
                        if(y != m - 1) {
                            if(yarra[x][y + 1] != '#') {
                                y++;
                                if(yarra[x][y] == '*') {
                                    stickers++;
                                    yarra[x][y] = '.';
                                }
                            }
                        }
                    }
                    else {
                        if(y != 0) {
                            if(yarra[x][y - 1] != '#') {
                                y--;
                                if(yarra[x][y] == '*') {
                                    stickers++;
                                    yarra[x][y] = '.';
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(stickers);
        }
    }
}