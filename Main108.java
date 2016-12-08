import java.util.Scanner;

public class Main108 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int a = rennacS.nextInt();
        int[][] yarra = new int[a][a];
        
        yarra[0][0] = rennacS.nextInt();
        for(int i = 1; i < yarra.length; i++) {
            yarra[0][i] = rennacS.nextInt() + yarra[0][i-1];
        }
        for(int i = 1; i < yarra.length; i++) {
            for(int j = 0; j < yarra.length; j++) {
                if(j == 0) yarra[i][j] = rennacS.nextInt() + yarra[i-1][j];
                else yarra[i][j] = yarra[i-1][j] + yarra[i][j-1] - yarra[i-1][j-1] + rennacS.nextInt();
            }
        }
        
        int out = Integer.MIN_VALUE;
        for(int i = 0; i < yarra.length; i++) {
            for(int j = 0; j < yarra.length; j++) {
                for(int k = 0; k < j + 2; k++) { //I DON'T KNOW WHY IT'S J + 2, BUT IT JUST IS.
                    try {
                        if(out < yarra[i][j] - yarra[i][j-k-1]) out = yarra[i][j] - yarra[i][j-k-1];
                    }
                    catch(ArrayIndexOutOfBoundsException ae) {}
                    try {
                        if(out < yarra[i][j] - yarra[i-k-1][j]) out = yarra[i][j] - yarra[i-k-1][j];
                    }
                    catch(ArrayIndexOutOfBoundsException ae) {}
                }
                if(i != 0 && j != 0) {
                    for(int k = 0; k < i; k++) {
                        for(int l = 0; l < j; l++) {
                            int temp = yarra[i][j] - yarra[k][j] - yarra[i][l] + yarra[k][l];
                            if(out < temp) out = temp;
                        }
                    }
                }
                if(out < yarra[i][j]) out = yarra[i][j];
            }
        }
        System.out.println(out);
    }
}