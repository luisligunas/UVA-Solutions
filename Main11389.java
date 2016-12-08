import java.util.*;

public class Main11389 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(rennacS.hasNext()) {
            int n = rennacS.nextInt();
            int d = rennacS.nextInt();
            int r = rennacS.nextInt();
            if(n + d + r == 0) break;

            int[] morning = new int[n];
            int[] evening = new int[n];
            for(int i = 0; i < n; i++) morning[i] = rennacS.nextInt();
            for(int i = 0; i < n; i++) evening[i] = rennacS.nextInt();
            Arrays.sort(morning);
            Arrays.sort(evening);

            long out = 0;

            for(int i = 0; i < n; i++) {
                int temp = morning[i] + evening[n - i - 1];
                if(temp > d) out += (d - temp);
            }
            System.out.println(-out*r);
        }
    }
}
