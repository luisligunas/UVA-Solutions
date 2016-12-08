import java.util.*;

public class Main12015 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
            int max = -1;
            
            for(int i = 0; i < 10; i++) {
                String name = rennacS.next();
                int num = rennacS.nextInt();
                
                max = Math.max(max, num);
                map.put(name, num);
            }
            
            System.out.println("Case #" + (z+1) + ":");
            for(Map.Entry en : map.entrySet()) {
                if((int)en.getValue() == max) System.out.println(en.getKey());
            }
        }
    }
}
