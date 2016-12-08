import java.util.Scanner;

public class Main10018 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            long num = rennacS.nextLong();
            int iterations = 0;
            while(true) {
                num += palindrome(num);
                iterations++;
                if(num == palindrome(num)) break;
            }
            
            System.out.println(iterations + " " + num);
        }
    }
    public static long palindrome(long num) {
        char[] yarra = Long.toString(num).toCharArray();
        long out = 0;
        for(int i = yarra.length - 1; i >= 0; i--) {
            out += Math.pow(10, i) * Long.parseLong(Character.toString(yarra[i]));
        }
        return out;
    }
}
