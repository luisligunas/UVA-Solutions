import java.util.*;

public class Main10954 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int numbers = rennacS.nextInt();
            if(numbers == 0) break;
            if(numbers == 1) {
                rennacS.nextInt();
                System.out.println(0);
                continue;
            }
            
            PriorityQueue<Long> q = new PriorityQueue<Long>();
            
            for(int i = 0; i < numbers; i++) q.add(rennacS.nextLong());
            
            long sum = 0;
            while(q.size() > 1) {
                long part = q.poll() + q.poll();
                sum += part;
                q.add(part);
            }
            
            System.out.println(sum);
        }
    }
}
