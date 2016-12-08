import java.util.*;

public class Main10165 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(true) {
            int numPiles = rennacS.nextInt();
            if(numPiles == 0) break;
            long bam = 0;

            for(int i = 0; i < numPiles; i++) bam = bam ^ rennacS.nextLong();

            if(bam == 0) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}