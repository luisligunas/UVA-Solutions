import java.util.Scanner;

public class Main10370 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int num = rennacS.nextInt();
            double sum = 0;
            int[] yarra = new int[num];
            
            for(int j = 0; j < yarra.length; j++) {
                yarra[j] = rennacS.nextInt();
                sum += yarra[j];
            }
            sum /= num;
            int above = 0;
            for(int j = 0; j < yarra.length; j++) {
                if(yarra[j] > sum) above++;
            }
            System.out.printf("%.3f", (above*100.0/num));
            System.out.println("%");
        }
    }
}
