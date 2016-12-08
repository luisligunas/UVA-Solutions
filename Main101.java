//from netbook

import java.util.*;

public class Main101 {
    static int[][] yarra;
    static int num;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        num = rennacS.nextInt();
        yarra = new int[num][num];
        
        for(int i = 0; i < num; i++) yarra[0][i] = i;
        for(int i = 1; i < num; i++) {
            for(int j = 0; j < num; j++) {
                yarra[i][j] = -1;
            }
        }
        
        while(true) {
            String first = rennacS.next();
            if(first.equalsIgnoreCase("quit")) break;
            int a = Integer.parseInt(rennacS.next());
            String next = rennacS.next();
            int b = Integer.parseInt(rennacS.next());
            if(a==b || column(a) == column(b)) continue;
            
            if(first.equalsIgnoreCase("move") && next.equalsIgnoreCase("onto")) {
                initial(b);
                initial(a);
                yarra[row(a)][column(a)] = -1;
                yarra[zero(b)][column(b)] = a;
            }
            else if(first.equalsIgnoreCase("move") && next.equalsIgnoreCase("over")) {
                initial(a);
                yarra[row(a)][column(a)] = -1;
                yarra[zero(b)][column(b)] = a;
            }
            else if(first.equalsIgnoreCase("pile") && next.equalsIgnoreCase("onto")) {
                initial(b);
                int x = row(a);
                int y = column(a);
                for(int i = x; i < num; i++) {
                    yarra[zero(b)][column(b)] = yarra[i][y];
                    yarra[i][y] = -1;
                }
            }
            else if(first.equalsIgnoreCase("pile") && next.equalsIgnoreCase("over")) {
                int x = row(a);
                int y = column(a);
                for(int i = x; i < num; i++) {
                    yarra[zero(b)][column(b)] = yarra[i][y];
                    yarra[i][y] = -1;
                }
            }
        }
        for(int i = 0; i < num; i++) {
            System.out.print(i + ":" );
            for(int j = 0; j < num; j++) {
                if(yarra[j][i] != -1) System.out.print(" " + yarra[j][i]);
            }
            System.out.println("");
        }
    }
    public static void initial(int n) {
        int x = row(n);
        int y = column(n);
        int z = zero(n);
        for(int i = x + 1; i < z; i++) {
            yarra[0][yarra[i][y]] = yarra[i][y];
            yarra[i][y] = -1;
        }
    }
    public static int zero(int n) {
        int x = row(n);
        int y = column(n);
        for(int i = x; i < num; i++) {
            if(yarra[i][y] == -1) return i;
        }
        return -1;
    }
    public static int row(int n) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(yarra[i][j] == n) return i;
            }
        }
        return -1;
    }
    public static int column(int n) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(yarra[i][j] == n) return j;
            }
        }
        return -1;
    }
}
