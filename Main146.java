import java.util.Arrays;
import java.util.Scanner;

public class Main146 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine();
            if(g.equals("#")) break;
            
            char[] yarra = g.toCharArray();
            
            boolean noSuccessor = true;
            
            for(int i = 0; i < yarra.length - 1; i++) {
                if(yarra[i] < yarra[i + 1]) {
                    noSuccessor = false;
                    break;
                }
            }

            if(noSuccessor) System.out.println("No Successor");
            else {
                for(int i = yarra.length - 1; i > 0; i--) {
                    if(yarra[i - 1] < yarra[i]) {
                        int closeness = yarra[i] - yarra[i - 1];
                        int index = i;
                        
                        for(int j = i + 1; j < yarra.length; j++) {
                            if(yarra[i - 1] < yarra[j] && yarra[j] - yarra[i - 1] < closeness) {
                                closeness = yarra[j] - yarra[i - 1];
                                index = j;
                            }
                        }
                        char temp = yarra[i - 1];
                        yarra[i - 1] = yarra[index];
                        yarra[index] = temp;
                        
                        Arrays.sort(yarra, i, yarra.length);
                        
                        for(int j = 0; j < yarra.length; j++) System.out.print(yarra[j]);
                        System.out.println();
                        
                        break;
                    }
                }
                
            }
        }
    }
}