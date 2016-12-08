//from netbook

import java.util.Scanner;

public class Main498 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String coefficient = rennacS.nextLine();
            Scanner a = new Scanner(coefficient);
            long[] yarra = new long[numSpaces(coefficient) + 1];
            String output = "";
            
            for(int i = 0; a.hasNext(); i++) {
                yarra[i] = Long.parseLong(a.next());
            }
            
            String input = rennacS.nextLine();
            a = new Scanner(input);
            
            while(a.hasNext()) {
                long temp = Long.parseLong(a.next());
                output += solver(yarra, temp) + " ";
            }
            System.out.println(output.substring(0, output.length() - 1));
        }
    }
    public static int numSpaces(String g) {
        int output = 0;
        for(int i = 0; i < g.length(); i++) {
            if(g.charAt(i) == ' ') output++;
        }
        return output;
    }
    public static long solver(long[] yarra, long num) {
        long total = 0;
        int thing = yarra.length;
        for(int i = 0; i < thing; i++) {
            total += yarra[i] * (long)Math.pow(num, thing - i - 1);
        }
        return total;
    }
}
