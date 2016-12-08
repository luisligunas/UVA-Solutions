import java.util.Scanner;

public class Main10035 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String a = rennacS.next();
            String b = rennacS.next();
            if(a.equals("0") && b.equals("0")) break;
            int MAX = Math.max(a.length(), b.length());
            int count = 0;
            int[][] yarra = new int[2][MAX + 1];
            
            for(int i = 0; i < a.length(); i++) yarra[0][i] = a.charAt(a.length() - i - 1) - 48;
            for(int i = 0; i < b.length(); i++) yarra[1][i] = b.charAt(b.length() - i - 1) - 48;
            
            for(int i = 0; i < MAX; i++) {
                if(yarra[0][i] + yarra[1][i] > 9) {
                    yarra[0][i+1]++;
                    count++;
                }
            }
            
            if(count == 0) System.out.println("No carry operation.");
            else if(count == 1) System.out.println("1 carry operation.");
            else System.out.println(count + " carry operations.");
        }
    }
}
