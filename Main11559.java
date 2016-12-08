import java.util.Scanner;

public class Main11559 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int n = rennacS.nextInt(); //participants
            int b = rennacS.nextInt(); //budget
            int h = rennacS.nextInt(); //hotels to consider
            int w = rennacS.nextInt(); //number of weeks you can choose from
            
            int[] yarra = new int[w]; //values are number of beds available per week
            
            int out = Integer.MAX_VALUE;
            
            for(int i = 0; i < h; i++) {
                int temp = rennacS.nextInt();  //price per person
                if(temp*n <= b) {
                    for(int j = 0; j < w; j++) {
                        int temp2 = rennacS.nextInt(); //number of available beds
                        if(temp2 >= n) { //if enough beds
                            out = Math.min(out, temp*n);
                        }
                    }
                }
                else {
                    for(int j = 0; j < w; j++) rennacS.nextInt();
                }
            }
            if(out == Integer.MAX_VALUE) System.out.println("stay home");
            else System.out.println(out);
        }
    }
}