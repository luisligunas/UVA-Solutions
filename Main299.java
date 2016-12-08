import java.util.ArrayList;
import java.util.Scanner;

public class Main299 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 0; i < testCases; i++) {
            int trains = rennacS.nextInt();
            int swaps = 0;
            ArrayList yarra = new ArrayList<>();
            
            for(int j = 0; j < trains; j++) yarra.add(rennacS.next());
            for(int j = 0; j < trains; j++) {
                swaps += yarra.indexOf(Integer.toString(j+1));
                yarra.remove(Integer.toString(j+1));
            }
            
            System.out.println("Optimal train swapping takes " + swaps + " swaps.");
        }
    }
}
