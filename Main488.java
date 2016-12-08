import java.util.Scanner;

public class Main488 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int a = rennacS.nextInt();
            int b = rennacS.nextInt();
            
            String[] yarra = new String[a];
            for(int j = 1; j <= a; j++) {
                String temp = "";
                String add = Integer.toString(j);
                for(int k = 0; k < j; k++) temp += add;
                yarra[j-1] = temp;
            }
            
            String one = "";
            for(int j = 0; j < a; j++) one += yarra[j] + "\n";
            for(int j = a - 2; j >= 0; j--) one += yarra[j] + "\n";
            for(int j = 0; j < b; j++) {
                System.out.print(one);
                if(!(i == testCases - 1 && j == b - 1)) System.out.println();
            }
        }
    }
}
