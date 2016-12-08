import java.util.*;

public class Main151 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int[] memo = new int[100];
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            if(memo[num] != 0) {
                System.out.println(memo[num]);
                continue;
            }
            
            for(int m = 1; true; m++) {
                ArrayList<Integer> yarra = new ArrayList<Integer>();
                for(int j = 0; j < num; j++) yarra.add(j+1);
                
                int index = 0;
                while(yarra.size() > 1) {
                    if(yarra.get(index) == 13) break;
                    yarra.remove(index);
                    index = (index + m - 1)%yarra.size();
                }
                if(yarra.size() == 1) {
                    memo[num] = m;
                    System.out.println(m);
                    break;
                }
            }
        }
    }
}
