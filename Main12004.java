import java.util.*;

public class Main12004 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        long[] yarra = new long[100001];
        int curr = 1;
        
        for(int z = 0; z < tC; z++) {
            int num = rennacS.nextInt();
            
            while(curr < num) {
                yarra[curr + 1] = yarra[curr] + new Long(curr++);
            }
            
            System.out.print("Case " + (z + 1) + ": ");
            if(yarra[num] % 2 == 0) System.out.println(yarra[num]/2);
            else System.out.println(yarra[num] + "/2");
        }
    }
}