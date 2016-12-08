import java.util.Scanner;
import java.util.ArrayList;

public class Main10855 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int N = rennacS.nextInt();
            int n = rennacS.nextInt();
            if(N == 0 && n == 0) break;
            ArrayList<String> rot = new ArrayList<String>();
            ArrayList<String> base = new ArrayList<String>();
            
            String[][] big = new String[N][N];
            for(int i = 0; i < N; i++) {
                String temp = rennacS.next();
                for(int j = 0; j < N; j++) {
                    big[i][j] = temp.substring(j, j+1);
                }
            }
            String[][] small = new String[n][n];
            String later = "";
            for(int i = 0; i < n; i++) {
                String temp = rennacS.next();
                later += temp;
                for(int j = 0; j < n; j++) {
                    small[i][j] = temp.substring(j, j+1);
                }
            }
            rot.add(later);
            for(int i = 0; i < 3; i++) {
                small = rotate90(small);
                String temp = "";
                for(int j = 0; j < n; j++) {
                    for(int k = 0; k < n; k++) {
                        temp += small[j][k];
                    }
                }
                rot.add(temp);
            }
            //okay na si rot
            for(int i = 0; i < N-n+1; i++) {
                for(int j = 0; j < N-n+1; j++) {
                    later = "";
                    for(int k = i; k < n + i; k++) {
                        for(int l = j; l < n + j; l++) {
                            later += big[k][l];
                        }
                    }
                    base.add(later);
                }
            }
            int[] out = new int[4];
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < base.size(); j++) {
                    if(rot.get(i).equals(base.get(j))) out[i]++;
                }
            }
            for(int i = 0; i < 4; i++) {
                if(i == 0) System.out.print(out[i]);
                else System.out.print(" " + out[i]);
            }
            System.out.println("");
            
        }
    }
    public static String[][] rotate90(String[][] yarra) {
        int l = yarra.length;
        String[][] lipat = new String[l][l];
        
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < l; j++) {
                lipat[j][l-1-i] = yarra[i][j];
            }
        }
        return lipat;
    }
}
