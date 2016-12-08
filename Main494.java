import java.util.Scanner;

public class Main494 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine().toUpperCase();
            int count = 0;
            
            for(int i = 0; i < g.length(); i++) {
                if(g.charAt(i) < 65 || g.charAt(i) > 90) g = g.substring(0, i) + " " + g.substring(i + 1);
            }
            
            Scanner line = new Scanner(g);  
            
            while(line.hasNext()) {
                line.next();
                count++;
            }
            System.out.println(count);
        }
    }
}