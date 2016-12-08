import java.util.*;

public class Main11461 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int[] squares = new int[318];
        
        for(int i = 0; i < squares.length; i++) {
            squares[i] = i*i;
        }
        //System.out.println(Arrays.toString(squares));
        while(true) {
            int low = rennacS.nextInt();
            int high = rennacS.nextInt();
            if(low == 0 && high == 0) break;
            
            int left = (int)Math.sqrt(low);
            int right = (int)Math.sqrt(high);
            
            if(left*left != low) left++;
            
            //if(right*right != high) right++;
            
            System.out.println(right - left + 1);
        }
    }
}
