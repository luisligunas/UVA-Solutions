import java.util.*;

public class Main514 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int length = rennacS.nextInt();
            if(length == 0) break;
            
            while(true) {
                int[] yarra = new int[length];
                yarra[0] = rennacS.nextInt();
                if(yarra[0] == 0) {
                    System.out.println("");
                    break;
                }
                
                for(int i = 1; i < length; i++) yarra[i] = rennacS.nextInt();
                int curr = 0;
                int right = 1;
                
                Stack<Integer> station = new Stack<Integer>();
                
                while(curr < length && right <= length + 1) {
                    if(yarra[curr] == right) {
                        right++;
                        curr++;
                    }
                    else if(!station.isEmpty() && station.peek() == yarra[curr]) {
                        station.pop();
                        curr++;
                    }
                    else {
                        station.push(right);
                        right++;
                    }
                }
                if(curr == length) System.out.println("Yes");
                else System.out.println("No");
                
            }
        }
    }
}
