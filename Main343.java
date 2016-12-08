import java.util.*;

public class Main343 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String x = rennacS.next();
            String y = rennacS.next();
            
            int temp = highestDigit(x) + 1;
            if(temp == 1) temp++;
            if(x.equals(y)) System.out.println(x  + " (base " + temp + ") = " + y + " (base " + temp + ")");
            else {
                ArrayList<Long> eks = new ArrayList<Long>();
                ArrayList<Long> wai = new ArrayList<Long>();
                
                int highestX = highestDigit(x);
                int highestY = highestDigit(y);
                
                for(int i = highestX; i < 36; i++) eks.add(convertToBaseTen(x, i+1));
                for(int i = highestY; i < 36; i++) wai.add(convertToBaseTen(y, i+1));
                
                boolean done = false;
                for(int i = highestX; i < eks.size() + highestX; i++) {
                    for(int j = highestY; j < wai.size() + highestY; j++) {
                        if(Objects.equals(eks.get(i - highestX), wai.get(j - highestY))) {
                            System.out.println(x + " (base " + (i+1) + ") = " + y + " (base " + (j+1) + ")");
                            done = true;
                            break;
                        }
                    }
                    if(done) break;
                }
                if(!done) System.out.println(x + " is not equal to " + y + " in any base 2..36");
            }
        }
    }
    public static int highestDigit(String g) {
        int highest = 0;
        for(int i = 0; i < g.length(); i++) {
            if(g.charAt(i) > highest) highest = g.charAt(i);
        }
        if(highest >= 65) highest -= 55;
        else highest -= 48;
        
        return highest;
    }
    public static long convertToBaseTen(String g, int base) {
        long out = 0;
        for(int i = 0; i < g.length(); i++) {
            int digit = g.charAt(i);
            if(digit > 64) digit -= 55;
            else digit -= 48;
            out += digit*Math.pow(base, g.length() - 1 - i);
        }
        return out;
    }
}