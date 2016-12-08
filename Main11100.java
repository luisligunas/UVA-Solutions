import java.util.*;

public class Main11100 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        boolean first = true;
        while(true) {
            int numBags = rennacS.nextInt();
            if(numBags == 0) break;
            
            int[] bags = new int[numBags];
            
            for(int i = 0; i < numBags; i++) bags[i] = rennacS.nextInt();
            Arrays.sort(bags);
            int most = 0;
            int bleh = 1;
            for(int i = 0; i < numBags - 1; i++) {
                if(bags[i] == bags[i+1]) {
                    bleh++;
                    if(i == numBags - 2 && bleh > most) most = bleh; 
                }
                else {
                    if(bleh > most) most = bleh;
                    bleh = 1;
                }
            }
            int[][] sorting = new int[most][numBags];
            int row = 0;
            int col = 0;
            for(int i = 0; i < numBags; i++) {
                sorting[row][col] = bags[i];
                row++;
                if(row == most) {
                    row = 0;
                    col++;
                }
            }
            if(!first) System.out.println();
            else first = false;
            System.out.println(most);
            for(int i = 0; i < most; i++) {
                String out = "";
                for(int j = 0; j < numBags; j++) {
                    if(sorting[i][j] != 0) out += sorting[i][j] + " ";
                    else break;
                }
                System.out.println(out.substring(0, out.length() - 1));
            }
        }
    }
}
