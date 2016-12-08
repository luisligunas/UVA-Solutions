import java.util.Scanner;

public class Main13012 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int type = rennacS.nextInt();
            int counter = 0;
            
            for(int i = 0; i < 5; i++) {
                if(rennacS.nextInt() == type) counter++;
            }
            System.out.println(counter);
        }
    }
}