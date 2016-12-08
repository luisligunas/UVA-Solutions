import java.util.Scanner;

public class Main10300 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            int farmers = rennacS.nextInt();
            long out = 0;
            
            for(int j = 0; j < farmers; j++) {
                long temp = rennacS.nextInt();
                rennacS.nextInt();
                out += temp * rennacS.nextInt();
            }
            System.out.println(out);
        }
    }
}
