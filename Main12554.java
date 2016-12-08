import java.util.Scanner;

public class Main12554 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int num = rennacS.nextInt();
        String[] yarra = new String[num];
        for(int i = 0; i < num; i++) yarra[i] = rennacS.next();
        String line = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
        Scanner base = new Scanner(line);
        
        int iterations = num/16;
        if(iterations*16 != num) iterations++;
        
        int ind = 0;
        for(int i = 0; i < iterations; i++) {
            for(int j = 0; j < 16; j++) {
                if(ind == num) ind = 0;
                System.out.println(yarra[ind] + ": " + base.next());
                ind++;
            }
            base = new Scanner(line);
        }
    }
}
