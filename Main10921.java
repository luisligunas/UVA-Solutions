import java.util.*;

public class Main10921 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        HashMap m = new HashMap();
        
        m.put("1", "1");
        m.put("0", "0");
        m.put("-", "-");
        m.put("A", "2");
        m.put("B", "2");
        m.put("C", "2");
        m.put("D", "3");
        m.put("E", "3");
        m.put("F", "3");
        m.put("G", "4");
        m.put("H", "4");
        m.put("I", "4");
        m.put("J", "5");
        m.put("K", "5");
        m.put("L", "5");
        m.put("M", "6");
        m.put("N", "6");
        m.put("O", "6");
        m.put("P", "7");
        m.put("Q", "7");
        m.put("R", "7");
        m.put("S", "7");
        m.put("T", "8");
        m.put("U", "8");
        m.put("V", "8");
        m.put("W", "9");
        m.put("X", "9");
        m.put("Y", "9");
        m.put("Z", "9");
        
        while(rennacS.hasNext()) {
            String g = rennacS.next();
            for(int i = 0; i < g.length(); i++) {
                System.out.print(m.get(g.substring(i, i+1)));
            }
            System.out.println("");
        }
    }
}
