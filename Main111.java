import java.util.Scanner;

public class Main111 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int range = rennacS.nextInt();
        
        int[] base = new int[range];
        for(int i = 0; i < range; i++) base[rennacS.nextInt() - 1] = i + 1;
        
        while(rennacS.hasNext()) {
            int[] temp = new int[range];
            int[][] yarra = new int[range + 1][range + 1];
            
            for(int i = 0; i < range; i++) temp[rennacS.nextInt() - 1] = i + 1;
            
            for(int i = 1; i <= range; i++) {
                for(int j = 1; j <= range; j++) {
                    if(base[j - 1] == temp[i - 1]) yarra[i][j]++;
                    yarra[i][j] += Math.max(yarra[i-1][j], yarra[i][j-1]);
                }
            }
            System.out.println(yarra[range][range]);
        }
    }
}