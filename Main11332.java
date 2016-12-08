import java.util.Scanner;

public class Main11332 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int a = rennacS.nextInt();
            if(a == 0) break;
            
            System.out.println(sumOfDigits(sumOfDigits(sumOfDigits(a))));
        }
    }
    public static int sumOfDigits(int a) {
        String g = Integer.toString(a);
        int out = 0;
        
        for(int i = 0; i < g.length(); i++) out += Integer.parseInt(g.substring(i, i + 1));
        
        return out;
    }
}
