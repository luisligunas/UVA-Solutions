import java.util.*;

public class Main484 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        
        while(rennacS.hasNext()) {
            int num = rennacS.nextInt();
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        // Display elements
        for(Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
