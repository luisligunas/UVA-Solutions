import java.util.Scanner;

public class Main12405 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int testCases = rennacS.nextInt();

        for(int i = 0; i < testCases; i++) {
            boolean[] yarra = new boolean[rennacS.nextInt()];
            String inp = rennacS.next();
            int out = 0;

            for(int j = 0; j < yarra.length; j++) {
                if(inp.charAt(j) == '.') yarra[j] = true;
            }
            for(int j = 0; j < yarra.length; j++) {
                if(yarra[j]) {
                    out++;
                    j += 2;
                }
            }
            System.out.println("Case "  + (i+1) + ": " + out);
        }
    }
}