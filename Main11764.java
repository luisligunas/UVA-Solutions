import java.util.Scanner;

public class Main11764 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int walls = rennacS.nextInt();
            int up = 0;
            int down = 0;
            
            int base = rennacS.nextInt();
            for(int j = 0; j < walls - 1; j++) {
                int temp = rennacS.nextInt();
                if(base < temp) up++;
                else if(base > temp) down++;
                base = temp;
            }
            
            System.out.println("Case " + (i+1) + ": " + up + " " + down);
        }
    }
}
