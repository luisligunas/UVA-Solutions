import java.util.Scanner;

public class Main10038 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int a = rennacS.nextInt();
            boolean[] yarra = new boolean[a - 1];
            
            int before = rennacS.nextInt();
            for(int i = 0; i < yarra.length; i++) {
                int temp = rennacS.nextInt();
                try {
                    yarra[Math.abs(before-temp) - 1] = true;
                }
                catch(ArrayIndexOutOfBoundsException ae) {}
                before = temp;
            }
            boolean check = true;
            for(int i = 0; i < yarra.length; i++) {
                if(!yarra[i]) {
                    check = false;
                    break;
                }
            }
            if(!check) System.out.println("Not jolly");
            else System.out.println("Jolly");
        }
    }
}
