import java.util.Scanner;

public class Main10424 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int a = sumOfDigits(getStringWorth(rennacS.nextLine().toUpperCase()));
            int b = sumOfDigits(getStringWorth(rennacS.nextLine().toUpperCase()));
            //65 90
            if(a == 0 & b == 0) System.out.println("0.00 %");
            else {
                System.out.printf("%.2f", 100.0*Math.min(a, b)/Math.max(a, b));
                System.out.println(" %");
            }
        }
    }
    public static int getStringWorth(String a) {
        int worth = 0;
        
        for(int i = 0; i < a.length(); i++) {
            int temp = a.charAt(i);
            if(temp < 91 && temp > 64) worth += temp - 64;
        }
        
        return worth;
    }
    public static int sumOfDigits(int a) {
        while(true) {
            if(a < 10) break;
            
            String compar = Integer.toString(a);
            int sum = 0;
            
            for(int i = 0; i < compar.length(); i++) sum += Integer.parseInt(compar.substring(i, i+1));
            
            a = sum;
        }
        
        return a;
    }
}
