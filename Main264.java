import java.util.*;

public class Main264 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int four = 4;
        int[] mid = new int[5000];
        mid[0] = 1;

        for(int i = 1; i < mid.length; i++) {
            mid[i] = mid[i-1]+four;
            four += 4;
        }
        while(rennacS.hasNext()) {
            int num = rennacS.nextInt();
            int depth = 1;
            
            while(depth*(depth + 1)/2 < num) depth++;
            
            int x, y;
            int rightMost = (depth*(depth + 1))/2;
            int leftMost = (depth*(depth - 1))/2 + 1;
            
            if(depth % 2 == 1) {
                if(num == mid[(depth+1)/2 - 1]) {
                    x = (depth+1)/2;
                    y = x;
                }
                else if(num > mid[(depth+1)/2 - 1]) {
                    int diff = rightMost - num;
                    x = diff + 1;
                    y = depth - diff;
                }
                else {
                    int diff = num - leftMost;
                    x = depth - diff;
                    y = diff + 1;
                }
            }
            else {
                double middle = (rightMost - leftMost)/2.0;
                if(num > middle) {
                    int diff = rightMost - num;
                    x = depth - diff;
                    y = diff + 1;
                }
                else {
                    int diff = num - leftMost;
                    x = diff + 1;
                    y = depth - diff;
                }
            }
            System.out.println("TERM " + num + " IS " + x + "/" + y);
        }
    }
}