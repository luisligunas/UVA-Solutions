import java.util.*;

public class Main12503 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            int direct = rennacS.nextInt();
            boolean[] yarra = new boolean[direct]; //true = right; false = left;
            int pos = 0;
            
            for(int i = 0; i < direct; i++) {
                String move = rennacS.next();
                
                if(move.equals("LEFT")) pos--;
                else if(move.equals("RIGHT")) {
                    yarra[i] = true;
                    pos++;
                }
                else {
                    rennacS.next();
                    int copy = rennacS.nextInt();
                    if(yarra[copy - 1]) {
                        yarra[i] = true;
                        pos++;
                    }
                    else pos--;
                }
            }
            System.out.println(pos);
        }
    }
}