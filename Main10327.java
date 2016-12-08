import java.util.*;

public class Main10327 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int numbers = rennacS.nextInt();
            int[] yarra = new int[numbers];
            for(int i = 0; i < numbers; i++) yarra[i] = rennacS.nextInt();
            
            int count = 0;
            
            for(int i = 1; i < numbers; i++) {
                for(int j = 0; j < numbers - i; j++) {
                    if(yarra[j] > yarra[j+1]) {
                        int temp = yarra[j];
                        yarra[j] = yarra[j+1];
                        yarra[j+1] = temp;
                        count++;
                    } 
                }
            }
            System.out.println("Minimum exchange operations : " + count);
        }
    }
}