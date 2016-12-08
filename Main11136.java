package UVAExercises;

import java.util.*;

public class Main11136 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int days = rennacS.nextInt();
            if(days == 0) break;
            
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
            long out = 0;
            
            for(int z = 0; z < days; z++) {
                int receipts = rennacS.nextInt();
                for(int y = 0; y < receipts; y++) {
                    int n = rennacS.nextInt();
                    if(map.containsKey(n)) map.put(n, map.get(n) + 1);
                    else map.put(n, 1);
                }
                int last = map.lastKey();
                int lastNum = map.get(last);
                if(lastNum == 1) map.remove(last);
                else map.put(last, lastNum - 1);
                
                int first = map.firstKey();
                int firstNum = map.get(first);
                if(firstNum == 1) map.remove(first);
                else map.put(first, firstNum - 1);
                
                out += last - first;
            }
            System.out.println(out);
        }
    }
}
