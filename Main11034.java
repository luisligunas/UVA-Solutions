import java.util.*;

public class Main11034 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            int length = rennacS.nextInt()*100;
            int numCars = rennacS.nextInt();
            int out = 0;
            
            Queue<Integer> left = new LinkedList<Integer>();
            Queue<Integer> right = new LinkedList<Integer>();
            
            boolean atLeft = true;
            
            for(int i = 0; i < numCars; i++) {
                int car = rennacS.nextInt();
                String direct = rennacS.next();
                
                if(direct.equals("left")) left.add(car);
                else if(direct.equals("right")) right.add(car);
            }
            while(!left.isEmpty() || !right.isEmpty()) {
                int curr = 0;
                Queue <Integer> work = atLeft ? left:right;

                while(curr <= length && !work.isEmpty()) {
                    if(work.peek() + curr <= length) {
                        curr += work.poll();
                    }
                    else break;
                }
                atLeft = !atLeft;
                out++;
            }
            System.out.println(out);
        }
    }
}
