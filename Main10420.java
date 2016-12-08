import java.util.*;

public class Main10420 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int women = rennacS.nextInt();
            
            HashMap h = new HashMap();
            rennacS.nextLine();
            for(int i = 0; i < women; i++) {
                String g = rennacS.nextLine();
                Scanner temp = new Scanner(g);
                g = temp.next();
                if(h.containsKey(g)) h.put(g, (Integer)h.get(g) + 1);
                else h.put(g, 1);
            }
            ArrayList<String> names = new ArrayList<String>();
            for(Object key: h.keySet()) {
                names.add((String)key);
            }
            Collections.sort(names);
            for(int i = 0; i < names.size(); i++) System.out.println(names.get(i) + " " + h.get(names.get(i)));
        }
    }
}