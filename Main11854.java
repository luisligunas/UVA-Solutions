import java.util.*;

public class Main11854 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int[] yarra = new int[3];
            yarra[0] = rennacS.nextInt();
            yarra[1] = rennacS.nextInt();
            yarra[2] = rennacS.nextInt();
            if(yarra[0] + yarra[1] + yarra[2] == 0) break;
            
            Arrays.sort(yarra);
            if(yarra[0]*yarra[0] + yarra[1]*yarra[1] == yarra[2]*yarra[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}