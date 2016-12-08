import java.util.Scanner;

public class Main10055 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            long a = rennacS.nextLong();
            long b = rennacS.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
}