import java.util.*;

public class Main847 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(rennacS.hasNext()) {
            long bam = rennacS.nextLong();

            for(int i = 1; true; i++) {
                long dog = (long)Math.pow(18, i);

                if(bam <= dog && bam > dog/2) {
                    System.out.println("Ollie wins.");
                    break;
                }
                if(dog > bam) {
                    System.out.println("Stan wins.");
                    break;
                }
            }
        }
    }
}