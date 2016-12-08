import java.util.Scanner;

public class Main272 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int i = 1;
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine();
            while(true) {
                int a = g.indexOf("\"");
                if(a < 0) break;
                if(i % 2 == 1) g = g.substring(0, a) + "``" + g.substring(a + 1);
                else g = g.substring(0, a) + "''" + g.substring(a + 1);
                i++;
            }
            System.out.println(g);
        }
    }
}
