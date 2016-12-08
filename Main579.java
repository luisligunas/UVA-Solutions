import java.util.Scanner;

public class Main579 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            String g = rennacS.next();
            if(g.equals("0:00")) break;
            
            int hour = Integer.parseInt(g.substring(0, g.indexOf(":"))) * 30;
            
            double minute = Integer.parseInt(g.substring(g.length() - 2)) * 5.5;
            double out = Math.max(hour, minute) - Math.min(hour, minute);
            if(out >= 180) out = 360 - out;
            
            System.out.printf("%.3f", out);
            System.out.println("");
        }
    }
}