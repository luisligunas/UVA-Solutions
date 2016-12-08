//ProgVar Tryouts Problems
//from netbook

import java.util.Scanner;

public class Main541 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        while(true) {
            int size = Integer.parseInt(rennacS.nextLine());
            if(size == 0) break;
            int[][] yarra = new int[size][size];

            for(int i = 0; i<size; i++) {
                String row = rennacS.nextLine();
                for(int j = 0; j < row.length(); j += 2) yarra[i][j/2] = Integer.parseInt(row.substring(j, j+1));
            }
            //you now have the inputs in yarra

            boolean damaged = evenchecker(true, size, yarra);
            if(!damaged) damaged = evenchecker(false, size, yarra);
            //damaged will now indicate whether or not the original array exhibits the parity property

            if(!damaged) System.out.println("OK");
            else {
                for(int i = 0; i < size; i++) {
                    for(int j = 0; j < size; j++) {
                        if(yarra[i][j] == 0) yarra[i][j] = 1;
                        else yarra[i][j] = 0;

                        damaged = evenchecker(true, size, yarra);
                        if(!damaged) damaged = evenchecker(false, size, yarra);

                        if(!damaged) {
                            System.out.println("Change bit (" + (i+1) + "," + (j+1) + ")");
                            break;
                        }
                        else {
                            if(yarra[i][j] == 0) yarra[i][j] = 1;
                            else yarra[i][j] = 0;
                        }
                    }
                    if(!damaged) break;
                }
                if(damaged) System.out.println("Corrupt");
            }
        }
    }
    
    public static boolean evenchecker(boolean checkrows, int size, int[][] test) {
        boolean damaged = false;
        
        if(checkrows) { //checkrows is true if checking rows' sums
            for(int i = 0; i < size; i++) {
                int sum = 0;
                for(int j = 0; j < size; j++) sum += test[i][j];
                if(sum%2 != 0) {
                    damaged = true;
                    break;
                }
            }
        }
        else { //checkrows is false if checking columns' sums
            for(int i = 0; i < size; i++) {
                int sum = 0;
                for(int j = 0; j < size; j++) sum += test[j][i];
                if(sum%2 != 0) {
                    damaged = true;
                    break;
                }
            }
        }
        return damaged;
    }
}
