//ProgVar Tryouts Problems
//from netbook

import java.util.Scanner;

public class Main11040 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        String[] gnirtS = new String[5];
        int[][] yarra = new int[9][9];
        
        int testCases = Integer.parseInt(rennacS.nextLine());
        int counter = 0;
        String output = "";
        
        while(counter < testCases) {
            int row = 0;
            
            for(int i = 0; i < 5; i++) gnirtS[i] = rennacS.nextLine();
            
            for(int i = 0; i < 5; i++) {
                String temp = "";
                int column = 0;
                
                for(int j = 0; j < gnirtS[i].length(); j++) {
                    if(gnirtS[i].substring(j, j +1).equals(" ")) {
                        yarra[row][column] = Integer.parseInt(temp);
                        temp = "";
                        column += 2;
                    }
                    else {
                        temp += gnirtS[i].substring(j, j +1);
                        if(j == gnirtS[i].length() - 1) yarra[row][column] = Integer.parseInt(temp);
                    }
                }
                row += 2;
            }
            row = 8;
            
            while(row > 0) {
                for(int i = 1; i < row; i += 2) {
                    yarra[row][i] = (yarra[row-2][i-1] - yarra[row][i-1] - yarra[row][i+1]) / 2;
                }
                row -= 2;
            }
            row = 7;
            
            while(row > 0) {
                for(int i = 0; i <= row; i++) {
                    yarra[row][i] = yarra[row+1][i] + yarra[row+1][i+1];
                }
                row -= 2;
            }
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j <= i; j++) {
                    output += yarra[i][j] + " ";
                }
                output = output.substring(0, output.length() - 1);
                output += "\n";
            }
            
            counter++;
        }
        System.out.println(output.substring(0, output.length() - 1));
    }
}
