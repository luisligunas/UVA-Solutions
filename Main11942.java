import java.util.Scanner;

public class Main11942 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        System.out.println("Lumberjacks:");
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            int one = rennacS.nextInt();
            int two = rennacS.nextInt();
            boolean ascending = one < two;
            boolean wrong = false;
            
            int stoppedAt = 0;
            for(int j = 0; j < 8; j++) {
                stoppedAt = j + 3;
                one = two;
                two = rennacS.nextInt();
                if(ascending) {
                    if(one > two) {
                        wrong = true;
                        break;
                    }
                }
                else {
                    if(one < two) {
                        wrong = true;
                        break;
                    }
                }
            }
            for(int j = 0; j <= 9 - stoppedAt; j++) rennacS.nextInt();
            if(wrong) System.out.println("Unordered");
            else System.out.println("Ordered");
        }
    }
}
