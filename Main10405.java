import java.util.*;

public class Main10405 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String a = rennacS.nextLine();
            String b = rennacS.nextLine();
            
            int[][] yarra = new int[a.length() + 1][b.length() + 1];
            
            for(int i = 1; i < yarra.length; i++) {
                for(int j = 1; j < yarra[i].length; j++) {
                    if(a.charAt(i-1) == b.charAt(j-1)) {
                        yarra[i][j] = yarra[i-1][j-1] + 1;
                    }
                    else yarra[i][j] = Math.max(yarra[i-1][j], yarra[i][j-1]);
                }
            }
            System.out.println(yarra[a.length()][b.length()]);
        }
    }
}
