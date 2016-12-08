//from netbook

import java.util.Scanner;
import java.util.Arrays;

public class Main102 {
    static int[][] yarra = new int[3][3];
    static String[] str = {"B", "G", "C"};
    static int min;
    static String output;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    yarra[j][i] = Integer.parseInt(rennacS.next());
                }
            }
            output = "";
            min = 2147483647;
            
            for(int i = 0; i < 3; i++) {
                int first = sum(0) - yarra[0][0];
                int second = first + sum(1) - yarra[1][1] + sum(2) - yarra[2][2];
                int third = first + sum(1) - yarra[1][2] + sum(2) - yarra[2][1];
                
                if(second < third) alpha(str[0] + str[1] + str[2], second);
                else if(third < second) alpha(str[0] + str[2] + str[1], third);
                else {
                    String[] temp = Arrays.copyOfRange(str, 1, 3);
                    Arrays.sort(temp);
                    alpha(str[0] + temp[0] + temp[1], third);
                }
                move();
            }
            System.out.println(output + " " + min);
        }
    }
    public static void alpha(String temp, int compar) {
        if(compar < min) {
            min = compar;
            output = temp;
        }
        else if(compar == min) {
            if(temp.compareTo(output) < 0) output = temp;
        }
    }
    public static int sum(int num) {
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += yarra[num][i];
        }
        return sum;
    }
    public static void move() {
        int[] temp = yarra[0];
        yarra[0] = yarra[1];
        yarra[1] = yarra[2];
        yarra[2] = temp;
        
        String gnirtS = str[0];
        str[0] = str[1];
        str[1] = str[2];
        str[2] = gnirtS;
    }
}
