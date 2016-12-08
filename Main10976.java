import java.util.Scanner;
import java.util.ArrayList;

public class Main10976 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(rennacS.hasNext()) {
            int n = rennacS.nextInt();

            ArrayList<Integer> first = new ArrayList<Integer>();
            ArrayList<Integer> second = new ArrayList<Integer>();

            for(int i = n + 1; i <= n*2; i++) {
                if(i*n % (i-n) == 0) {
                    first.add(i*n/(i-n));
                    second.add(i);
                }
            }

            System.out.println(first.size());
            for(int i = 0; i < first.size(); i++) System.out.println("1/" + n + " = 1/" + first.get(i) + " + 1/" + second.get(i));
        }
    }
}